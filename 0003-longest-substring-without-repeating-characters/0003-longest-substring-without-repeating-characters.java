class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        int maxx=0;
        HashSet <Character> set =new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                max--;
            }
            set.add(c);
            max++;
            if(max>maxx){
                maxx=max;
            }
        }
        return maxx;
    }
}