class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        // Build LPS
        while (i < n) {

            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {

                if (len != 0) {
                    len = lps[len - 1];
                } 
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Length of longest prefix which is also suffix
        int longest = lps[n - 1];

        // Length of the repeating part
        int patternLength = n - longest;

        return longest > 0 && n % patternLength == 0;
    }
}
