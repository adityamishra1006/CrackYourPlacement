class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<m; i++){
            int a = 0;
            int b = m-1;

            while(a<b){
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++;
                b--;
            }
        }
    }
}
