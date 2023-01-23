/*
Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/

//solution
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        ArrayList<Integer> list= new ArrayList<>();
        //col
        int left=0;
        int right=arr[0].length-1;;
        //row
        int top=0;
        int bottom=arr.length-1;;
       
       while(top<=bottom && left<=right){
           for(int i=left;i<=right;i++){
               list.add(arr[top][i]);
           }
           top++;
           for(int i=top;i<=bottom;i++){
               list.add(arr[i][right]);
           }
           right--;
           if(top<=bottom){
               for(int i=right; i>=left;i--){
                   list.add(arr[bottom][i]);
               }
               bottom--;
           }
           if(left<=right){
               for(int i=bottom;i>=top;i--){
                   list.add(arr[i][left]);
               }
               left++;
           }
       }
        return list;
    }
}
