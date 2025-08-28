// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;


//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }


//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n / 2; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][n - 1 - j];
//                 matrix[i][n - 1 - j] = temp;
//             }
//         }
//     }
// }


class Solution{
    public void rotate(int[][] matrix){
        int n = matrix.length;
        int matrix2[][] = new int[n][n];
        for(int j = 0; j<n ; j++){
            for(int i = n-1; i>=0; i--){
                matrix2[j][n-i-1] = matrix[i][j];

            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = matrix2[i][j];
            }
        }
    }
}