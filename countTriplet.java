//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        HashSet<Integer>set=new HashSet<>();
       for(int i:arr){
           set.add(i);
       }
       int count=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(set.contains(arr[i]+arr[j])){
                   count++;
               }
           }
       }
       return count;
    }
}
