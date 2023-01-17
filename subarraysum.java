
//Subarray with given sum in gfg

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
    ArrayList<Integer>list= new ArrayList<Integer>();
        
     int start=0, end=0, currsum=0;
     for(int i=0;i<n;i++){
         currsum+=arr[i];
         end=i;
         
         while(s<currsum){
            currsum-=arr[start];
            start++;
         }
         if(s==currsum) break;
     }  
     
     if(s!=currsum || start>end){
         list.add(-1);
         return list;
     }else{
         list.add(start+1);
         list.add(end+1);
         return list;
     }
    }
}
