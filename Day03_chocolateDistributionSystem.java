class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long minDiff = Integer.MAX_VALUE;
        for(int i = 0; i<n-m+1; i++){
            long currentDiff = a.get(i+m-1) - a.get(i);
            minDiff = Math.min(minDiff, currentDiff);
        }
        return minDiff;
    }
}
