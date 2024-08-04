class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        
        // Integer[] arr1Integer = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        // Integer[] arr2Integer = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n = arr1.length;
        
        for(int i = 0; i<n; i++){
            if(arr1[i] + arr2[n-1-i] < k) return false;
        }
        return true;
    }
}
