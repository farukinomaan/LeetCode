// #Top 50 OA
// Nomaan Faruki
// Optimal Solution

class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int newmax= nums[0];
        for(int i=0;i<nums.length;i++){ 
           max+=nums[i];
           if(max>newmax){
            newmax=max;
           }

           if(max<0){
            max=0;
           }
        }
        return newmax;
    }
}