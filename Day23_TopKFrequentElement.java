class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {
            return this.freq - p.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            }
            else{
                map.put(ele, 1);
            }
        }
        
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
            if(pq.size()>k) pq.remove();
        }
        for(int i = 0; i<k; i++){
            Pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}
