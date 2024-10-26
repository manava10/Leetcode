class Solution {
    public int longestOnes(int[] nums, int k) {
        int left,right,maxLength;
        left = 0; right =0; maxLength =0;
        while(right<nums.length){
            if(nums[right]==0){
                k--;
            }
            if(k<0){
                while(nums[left]!=0){
                    left++;
                }
                left++;
                k++;
            }
            if(k>=0){
                maxLength = Math.max(maxLength,right-left+1);
            }
            right++;
        }
        return maxLength;  
    }
}
// class Solution {
//     public int longestOnes(int[] nums, int k) {

//         int MaxLength=0;
//         for(int i=0;i<nums.length;i++){
//             int p = k;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]==0){
//                     p--;
//                 }
//                 if(p>=0){
//                     MaxLength = Math.max(MaxLength,j-i+1);
//                 } 
//             }
//         }
//         return MaxLength;   
//     }
// } //Time Complexity = O(N*N);
