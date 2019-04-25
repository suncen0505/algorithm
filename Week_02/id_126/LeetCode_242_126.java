class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<sChar.length;i++){
            map.put(sChar[i],map.get(sChar[i])==null?1:map.get(sChar[i])+1);
        }
        
        for(int i=0;i<tChar.length;i++){
            if(map.get(tChar[i])==null){
                return false;
            }
            if(map.get(tChar[i])==0){
                return false;
            }
            if(map.get(tChar[i])-1>0){
                map.put(tChar[i],map.get(tChar[i])-1);
            }else if(map.get(tChar[i])-1==0){
                map.remove(tChar[i]);
            }
            
        }
        
        if(map==null||map.size()==0){
            return true;
        }
        return false;
    }
}