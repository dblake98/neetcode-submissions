class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int[] frequencyBuckets = new int[26];
        for (int i=0;i<s.length();i++){
            frequencyBuckets[s.charAt(i)-'a']++;
            frequencyBuckets[t.charAt(i)-'a']--;
        }

        for (int f : frequencyBuckets){
            if (f != 0){
                return false;
            }
        }
        return true;
    }
}
