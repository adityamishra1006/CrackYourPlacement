class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> list = new ArrayList<>(); 

        int minC = 0, minR = 0;
        int maxC = n-1, maxR = m-1;

        while(minC <= maxC && minR <= maxR){
            for(int j = minC; j <= maxC; j++){
                list.add(matrix[minR][j]);
            }
            minR++;

            if(minR > maxR || minC > maxC) break;

            for(int i = minR; i <= maxR; i++){
                list.add(matrix[i][maxC]);
            }
            maxC--;

            if(minR > maxR || minC > maxC) break;

            for(int j = maxC; j >= minC; j--){
                list.add(matrix[maxR][j]);
            }
            maxR--;

            if(minR > maxR || minC > maxC) break;


            for(int i = maxR; i >= minR; i--){
                list.add(matrix[i][minC]);
            }
            minC++;
            if(minR > maxR || minC > maxC) break;
        }
        return list;
    }
}
