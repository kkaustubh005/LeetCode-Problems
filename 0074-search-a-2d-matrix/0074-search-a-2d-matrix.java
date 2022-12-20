class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startRow=0;
        int endRow=matrix.length-1;
        int finalRow=0;
        while(endRow>0) {    //Find row
            if(matrix[endRow][0]==target)
                return true;
            else if(target>matrix[endRow][0]){
                finalRow=endRow;
                break;
            }else if(matrix[endRow][0]>target && target>=matrix[endRow-1][0]) {
                finalRow=endRow-1;
                break;
            } else
                --endRow;
        }
        //Binary search on the row
        int start=0;
        int end=matrix[0].length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(matrix[finalRow][mid]==target)
                return true;
            else if(matrix[finalRow][mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return false;
    }
}