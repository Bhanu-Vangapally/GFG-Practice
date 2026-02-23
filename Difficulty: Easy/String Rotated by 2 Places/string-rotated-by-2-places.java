class Solution {
    public static boolean isRotated(String s1, String s2) {
        // Base case: If lengths are different, they can never match
        if (s1.length() != s2.length()) return false;
        
        // Edge case: If length is less than 2, they must be equal
        if (s1.length() < 2) return s1.equals(s2);

        int n = s1.length();

        // 1. Anti-clockwise rotation (Move first 2 chars to the end)
        // "amazon" -> "azon" + "am"
        String antiClock = s1.substring(2) + s1.substring(0, 2);

        // 2. Clockwise rotation (Move last 2 chars to the front)
        // "amazon" -> "on" + "amaz"
        String clockwise = s1.substring(n - 2) + s1.substring(0, n - 2);

        // Check if s2 matches either rotation
        return s2.equals(antiClock) || s2.equals(clockwise);
    }
}
