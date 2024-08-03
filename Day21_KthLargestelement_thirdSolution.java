class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            pq.add(arr[i]);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}
