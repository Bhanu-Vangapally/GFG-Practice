class Solution {
    public static boolean areIsomorphic(String s, String t) {
        // If lengths differ, they cannot be isomorphic
        if (s.length() != t.length()) return false;

        // Use arrays to store the last seen position (+1) of each character
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If the last seen positions don't match, the mapping is inconsistent
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Update positions with i + 1 (to avoid default 0 value conflict)
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
