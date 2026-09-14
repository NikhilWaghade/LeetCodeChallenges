class Solution {
    public void rotate(int[][] matrix) {
        //  Easy Approach 
        // transpose 
        // T: 0(n^2) , S: 0(1)
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // row reverse 
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        // second Hard approach
        // int n = matrix.length;
        // for(int i=0;i<n/2;i++){
        //     for(int j=i; j<n-i-1; j++){
        //         // cycle 
        //         int delta = j-i;

        //         int curr = matrix[i][j];
        //         int next = matrix[i + delta][n-i-1];
        //         matrix[i + delta][n-i-1] = curr;
        //         curr = next ;

        //         next = matrix[n-i-1] [n-i-1-delta];
        //         matrix[n-1-i] [n-i-1-delta] = curr;
        //         curr = next;

        //         next = matrix[n-i-1-delta][i];
        //         matrix[n-i-1-delta][i] = curr;
        //         curr = next ;

        //         matrix[i][j] = curr;
        //     }
        // }
    }
}