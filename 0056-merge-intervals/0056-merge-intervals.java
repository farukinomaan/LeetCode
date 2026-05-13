class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals==null || intervals.length<=1){
            return intervals;
        }

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> result= new ArrayList<>();

        int[] currentInterval= intervals[0];
        result.add(currentInterval);

        for(int i=0;i<intervals.length;i++){
            int currentEnd= currentInterval[1];
            int nextBegin= intervals[i][0];
            int nextEnd= intervals[i][1];

            if(currentEnd>= nextBegin){
                currentInterval[1]= Math.max(currentEnd,nextEnd);
            }
            else{
                currentInterval= intervals[i];
                result.add(currentInterval);

            }
        }

        return result.toArray(new int[result.size()][]);
        
    }
}