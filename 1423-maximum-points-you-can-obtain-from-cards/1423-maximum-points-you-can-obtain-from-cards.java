class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int cpLen = cardPoints.length;
        int totalSum = 0;
        for (int cp : cardPoints){
            totalSum += cp;
        }
        int windowSize = cpLen - k;
        if (windowSize == 0){
            return totalSum;   // take all cards
        }
        int sum = 0;
        for (int i = 0; i<windowSize; i++){
            sum += cardPoints[i];
        }
        int minSum = sum;
        for (int j = windowSize; j<cpLen; j++) {
            sum += cardPoints[j];                 // add new element on the right
            sum -= cardPoints[j - windowSize];    // drop the oldest on the left
            minSum = Math.min(minSum, sum);
        }
        return totalSum - minSum;
    }
}