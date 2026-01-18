class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int firstpointer=0;
        int secondpointer=0;

        while(firstpointer<g.length && secondpointer<s.length){
            if(s[secondpointer]>= g[firstpointer]){
                firstpointer++;
            }
            secondpointer++;
        }
        return firstpointer;
    }
}