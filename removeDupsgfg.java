/*
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence
*/


class Solution {
    String removeDups(String S) {
     
        String str ="";
        HashMap<Character,Integer> map = new HashMap<>();
        // for(char c: S.toCharArray()){
        //     ans.put(c,ans.getOrDefault(c,0)+1);
        // }
        
        
        for(char c: S.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
                str+=c;
            }
            
            
        }
       return str; 
    
    }
}
