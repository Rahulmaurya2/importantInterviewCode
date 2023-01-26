/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null && strs.length==0) return "";
      Arrays.sort(strs);
      String f= strs[0];
      String e= strs[strs.length-1];
      int c=0;
      while(c<f.length()){
        if(f.charAt(c) == e.charAt(c)) c++;
        else break;
      }
      return c==0 ? "": f.substring(0,c);
    }
}
