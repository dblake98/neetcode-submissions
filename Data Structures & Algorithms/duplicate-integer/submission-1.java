class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seens = new HashSet();
        for(int num: nums){
            if (!seens.add(num)){
                return true;
            }
            else continue;
        }
        return false;
    }
}