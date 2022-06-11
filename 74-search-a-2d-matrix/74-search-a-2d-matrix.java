class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int targetrow = 0;
        
        for(int i=0;i<row;i++){
            if(target >= matrix[i][0] && target <= matrix[i][col-1]){
                targetrow=i;
                break;
            }
        }
        
        for(int i=0;i<col;i++){
            if(target==matrix[targetrow][i]){
                return true;
            }
        }
        return false;
    }
}