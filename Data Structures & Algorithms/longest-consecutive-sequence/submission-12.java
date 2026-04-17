class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seens = new HashSet();
        Integer longest = 0;
        for (int num : nums){
            seens.add(num); 
        }
        for (int num: nums){
            if (!seens.contains(num - 1)){
                int count = 1;
                int i = 1;
                while (seens.contains(num + i)){
                    count++;
                    i++;
                }
                longest = Math.max(count,longest);
            }
        }
        return longest;
    }
}
