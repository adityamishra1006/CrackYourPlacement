class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 0) return 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();

        pq.add(1L);
        set.add(1L);

        long ugly = 1L;

        for(int i = 0; i<n; i++){
            ugly = pq.poll();
            if(!set.contains(ugly * 2)){
                pq.add(ugly * 2);
                set.add(ugly * 2);
            }
            if(!set.contains(ugly * 3)){
                pq.add(ugly * 3);
                set.add(ugly * 3);
            }
            if(!set.contains(ugly * 5)){
                pq.add(ugly * 5);
                set.add(ugly * 5);
            }
        }
        return (int) ugly;
    }
}
