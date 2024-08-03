class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k) pq.remove();
            }
        }
        return pq.peek();
    }
}
