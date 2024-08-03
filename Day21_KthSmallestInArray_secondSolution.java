class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            pq.add(arr[i]);
        }
        
        for(int i = 0; i<k-1; i++){
            pq.remove();
        }
        return pq.peek();
    } 
}
