class Solution
{
    static int getMax(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    
    static void countSort(int[] arr, int n, int exp){
        int[] output = new int[n];
        int[] count = new int[10];
        
        int i;
        Arrays.fill(count, 0);
        
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    static void radixSort(int arr[], int n) 
    { 
        // code here 
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    } 
}
