class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startRow=0;
        int endRow=matrix.length-1;
        int finalRow=0;
        while(endRow>0) {
            if(matrix[endRow][0]==target) return true;
            else if(target>matrix[endRow][0]){
                finalRow=endRow;
                break;
            }else if(matrix[endRow][0]>target && target>=matrix[endRow-1][0]) {
                finalRow=endRow-1;
                break;
            } else --endRow;
        }
        // while(startRow<=endRow) {
        //     int midRow = startRow + (endRow-startRow)/2;
        //     System.out.println("mid row- "+midRow);
        //     if(matrix[midRow][0]==target) return true;
        //     else if(midRow+1<=endRow && matrix[midRow][0]<target && target<matrix[midRow+1][0]){
        //         if(matrix[midRow][0]<target && target<matrix[midRow+1][0]){
        //             finalRow=midRow;
        //             break;
        //         }
        //     }
        //     else if(matrix[midRow][0]>target) endRow=midRow-1;
        //     else startRow=midRow+1;
        // } //[[1,3,5,7],[10,11,16,20],[23,30,34,60]]
        //finalRow=startRow;
        int start=0;
        int end=matrix[0].length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(matrix[finalRow][mid]==target) return true;
            else if(matrix[finalRow][mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}