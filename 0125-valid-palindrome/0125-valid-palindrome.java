class Solution {
    public boolean isPalindrome(String s) {
        char [] arr=new char[s.length()];
        int i=0,j=0;
        
        s=s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                arr[i]=ch;
                i++;
            }
        }
        while(j<i-1){
            if(arr[i-1]!=arr[j]){
                return false;
            }
            else{
                i--;
                j++;
            }
        }
        return true;
    }
}