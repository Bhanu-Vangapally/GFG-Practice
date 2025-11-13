// User function Template for Java
class Solution {
    public String longestCommonPrefix(String strs[]) {
        // code here
        if (strs == null || strs.length == 0)
            return "";

        // Iterate through characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            // Compare this character with others at same position
            for (int j = 1; j < strs.length; j++) {
                // If index exceeds or mismatch found
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // Entire first string is the prefix
        return strs[0];
    }
}