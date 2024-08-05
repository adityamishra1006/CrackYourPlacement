class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder result =  new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> current = pq.poll();
            result.append(current.getKey());
            current.setValue(current.getValue()-1);
            if(prev!=null && prev.getValue()>0){
                pq.offer(prev);
            }
            prev = current;
        }

        if(result.length() != s.length()) return "";

        return result.toString();
    }
}
