class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }
        int non_zero_index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[non_zero_index]=nums[i];
                non_zero_index+=1;
            }
        }
        for(int i=non_zero_index;i<nums.length;i++){
            nums[i]=0;
        }
        return;
    }
}

//TIME COMPLEXITY O(N)
// But a more Optimised Solution is Required
