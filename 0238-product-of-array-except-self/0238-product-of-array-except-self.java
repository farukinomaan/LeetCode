// Top 50 OA
// Nomaan Faruki
// optimal Soln

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }

        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = arr[i] * rightProd;
            rightProd *= nums[i];
        }

        return arr;
    }
}

// brute soln 
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int [] arr= new int[nums.length];
//         for(int i=0; i< nums.length; i++){
//             int prod =1;
            
//             for( int j=0; j<nums.length;j++){
//                 if(i !=j){
//                     prod *= nums[j];
//                 }
            
//             }
//             arr[i]= prod;
//         }
//             return arr;


//     }
// }