class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int i = (right + left) / 2;
        while (nums[i] != target){
            if (right - left <= 1){
                if (nums[left] == target) {i = left;}
                else {i = right;}
                break;
            }
            if (nums[i] > target){
                right = i;
            }
            else{
                left = i;
            }
            i = (right + left) / 2;
        }
        return nums[i] == target ? i : -1;
    }
}
