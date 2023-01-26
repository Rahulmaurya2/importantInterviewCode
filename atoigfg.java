/*
our task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123
Output: 123
*/


class Solution
{
    int atoi(String str) {
	  if(str.length()==0) return 0;
	  
	  int sing=1;
	  int res=0;
	  boolean chr= false;
	  
	  int i=0;
	  if(str.charAt(i)=='-'){
	          sing=-1;
	          i++;
	      }
	  for(;i<str.length();i++){
	      
	      if(str.charAt(i)>= 48 && str.charAt(i) <= 57){
	          res=res*10+str.charAt(i)-48;
	      }else chr=true;
	  }
	  
	  return chr ? -1: res*sing;
    }
}
