// Nomaan Faruki
//v

class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            int distinct = 0;
            int maxFreq = 0;
            
            for (int j = i; j < n; j++) {
                int charIdx = s.charAt(j) - 'a';
                if (count[charIdx] == 0) {
                    distinct++;
                }
                count[charIdx]++;
                maxFreq = Math.max(maxFreq, count[charIdx]);
                
                if (distinct * maxFreq == (j - i + 1)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
