//#Kadane's Algorithm
//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
         int currentSum=arr[0];
         int overAllSum=arr[0];
         
         for(int i=1;i<n;i++){
             if(currentSum>=0){
               currentSum+=arr[i];  
             }else{
                 currentSum=arr[i];
             }
             
             if(currentSum>overAllSum){
                 overAllSum=currentSum;
             }
         }
        return overAllSum;
        
    }
    
}
