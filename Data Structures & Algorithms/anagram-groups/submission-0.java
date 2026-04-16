class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList<String>> anagramMap = new HashMap();
        for (String word: strs){

            int[] freqBuckets = new int[26];
            for (char ch : word.toCharArray()){
                freqBuckets[ch - 'a']++;
            }

            // make the stringifed frequency key
            StringBuilder sb = new StringBuilder();
            for(Integer f : freqBuckets){
                sb.append(f).append('#');
            }

            if (anagramMap.get(sb.toString()) != null){
                ArrayList<String> list = anagramMap.get(sb.toString());
                list.add(word);
                anagramMap.put(sb.toString(), list);
            }
            else{
                ArrayList<String> list = new ArrayList();
                list.add(word);
                anagramMap.put(sb.toString(), list);
            }
        }
        return anagramMap.values().stream().collect(Collectors.toList());
    }
}
