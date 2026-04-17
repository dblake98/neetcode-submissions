class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Character> subset = new HashSet();

        while (right < s.length()){
            if (subset.add(s.charAt(right))){
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                subset.remove(s.charAt(left));
                left++;
            }
        }
        return max;   
    }
}
