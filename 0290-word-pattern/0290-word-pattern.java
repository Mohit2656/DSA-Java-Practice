class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        if(pattern.length()!=word.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=word[i];
            if(map.containsKey(a) && !map.get(a).equals(b)){
                return false;
            }
            else{
                if(!map.containsKey(a) && map.containsValue(b)){
                    return false;
                }
                map.put(a,b);
            }
        }
        return true;
    }
}