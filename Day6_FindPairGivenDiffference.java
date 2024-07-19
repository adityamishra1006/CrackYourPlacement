class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<n; i++){
            int c1 = arr[i] - x;
            int c2 = arr[i] + x;
            
            if(set.contains(c1) || set.contains(c2)) return 1;
            
            set.add(arr[i]);
        }
        return -1;
    }
}
