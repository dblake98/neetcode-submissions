class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        for (int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer>[] frequencies = new ArrayList[nums.length + 1];
        for(Map.Entry<Integer,Integer> e : frequencyMap.entrySet()){
            if (frequencies[e.getValue()] == null){
                frequencies[e.getValue()] = new ArrayList();
            }
            ArrayList<Integer> bucket = frequencies[e.getValue()];
            bucket.add(e.getKey());
        }

        ArrayList<Integer> output = new ArrayList();
        for (int i = frequencies.length - 1; output.size() < k ; i--){
            if (frequencies[i] != null){
                for (Integer num: frequencies[i]){
                    output.add(num);
                }
            }
        }
        int[] out = new int[k];
        for (int i = 0; i<output.size() ;i++ ){
            out[i] = output.get(i);
        }
        return out;
    }
}
