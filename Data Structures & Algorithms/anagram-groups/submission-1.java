class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagramMap = new HashMap();
        for (String str: strs){
            int[] freqBuckets = new int[26];
            for (char ch : str.toCharArray()){
                freqBuckets[ch - 'a']++;
            }
            StringBuilder freqKey = new StringBuilder();
            for (int freq : freqBuckets){
                freqKey.append(String.valueOf(freq)).append('#');
            }
            anagramMap.computeIfAbsent(freqKey.toString(), k -> new ArrayList()).add(str);
        }
        return anagramMap.values().stream().collect(Collectors.toList());
    }
}
