class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue(Comparator.comparingInt(Map.Entry<Integer,Integer>::getValue).reversed());
        HashMap<Integer,Integer> map = new HashMap();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        map.entrySet().stream().forEach(e -> pq.add(e));

        int[] output = new int[k];
        for (int i = 0; i<k; i++){
            output[i] = pq.poll().getKey();
        }

        return output;
    }
}
