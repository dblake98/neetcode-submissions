class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap();
        for (int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer>[] freqBucks = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if (freqBucks[entry.getValue()] == null){
                freqBucks[entry.getValue()] = new ArrayList();
            }
            ArrayList<Integer> buck = freqBucks[entry.getValue()];
            buck.add(entry.getKey());
        }

        ArrayList<Integer> outputList = new ArrayList();
        for (int i = freqBucks.length - 1; i > 0; i--){
            ArrayList<Integer> bucketContents = freqBucks[i];
            if (bucketContents == null){
                continue;
            }
            outputList.addAll(bucketContents);
            if (outputList.size() > k) break;
        }
        return outputList.stream().mapToInt(Integer::intValue).limit(k).toArray();
    }
}
