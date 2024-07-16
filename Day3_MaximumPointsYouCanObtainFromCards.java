class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int totalSum = 0;

        for(int i = 0; i<n; i++){
            totalSum += cardPoints[i];
        }

        if(k==n){
            return totalSum;
        }

        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for(int i = 0; i<n-k; i++){
            currentSum += cardPoints[i];
        }

        minSum = currentSum;

        for(int i = n-k; i<n; i++){
            currentSum += cardPoints[i] - cardPoints[i - (n-k)];
            minSum = Math.min(currentSum, minSum);
        }

        return totalSum - minSum;
    }
}
