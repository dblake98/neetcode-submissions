class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] prefixArray = new int[nums.length];
        prefixArray[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }

        int [] suffixArray = new int[nums.length];
        suffixArray[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            suffixArray[i] = suffixArray[i+1] * nums[i+1];
        }

        int[] productArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            productArray[i] = suffixArray[i] * prefixArray[i];
        }
        return productArray;
    }
}  
