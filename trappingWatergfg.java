/*
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
*/


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int a[], int n) { 
      int left[]= new int[n];
      int right[]=new int[n];

     left[0]=a[0];
     for(int i=1;i<n;i++){
         left[i]=Math.max(left[i-1],a[i]);
     }
     
     right[n-1]=a[n-1];
     for(int i=n-2;i>=0;i--){
         right[i]=Math.max(right[i+1],a[i]);
     }

     long ans=0;
     for(int i=0;i<n;i++){
         ans=ans+(Math.min(left[i],right[i])-a[i]);
     }

     return ans;
    }
}
