class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        HashMap<Long,Integer> tempHM = new HashMap<>();
        long sum = 0;
        int longSubArray = 0;
        for(int i=0;i<N;i++){
            sum = sum+A[i];
            if(sum==K){
                longSubArray = i+1;
            }
            if(tempHM.containsKey(sum-K)){
                longSubArray = Math.max(longSubArray,i-tempHM.get(sum-K));
            }
            if(!tempHM.containsKey(sum)){
                tempHM.put(sum,i);
            }
        }
        return longSubArray;
    }
}
