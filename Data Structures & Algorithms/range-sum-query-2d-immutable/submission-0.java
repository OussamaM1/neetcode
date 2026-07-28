class NumMatrix {

    private final int ans[][];

    public NumMatrix(int[][] matrix) {
        this.ans = new int[matrix.length][matrix[0].length+1];
        for(int i=0; i<matrix.length; i++)
            for(int j=0;j<matrix[0].length;j++)
                ans[i][j+1] = ans[i][j] + matrix[i][j];
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i=0; i<= row2-row1; i++) {
            int left = this.ans[row1+i][col1];
            int right = this.ans[row1+i][col2+1];
            sum += right - left;
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */