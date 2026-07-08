class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0,j=0;i<s.length() && j<t.length();i++,j++){
            if(map1.get(s.charAt(i))==null){
                map1.put(s.charAt(i),1);
            }else if(map1.get(s.charAt(i))>0){
                int l=map1.get(s.charAt(i));
                map1.put(s.charAt(i),++l);
            }
            
            if(map2.get(t.charAt(i))==null){
                map2.put(t.charAt(i),1);
            }else if(map2.get(t.charAt(i))>0){
                int q=map2.get(t.charAt(i));
                map2.put(t.charAt(i),++q);
            }
            
        }

        return map1.equals(map2);
    }
}
