class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seens = new HashSet();
        for (int num : nums){
            if (seens.add(num)){
                continue;
            }
            else return true;
        }
        return false;
    }
}