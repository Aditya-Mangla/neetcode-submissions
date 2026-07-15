class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        int a =0;
        while(a<len){
            if(s.charAt(a) == '(' || s.charAt(a) == '{' || s.charAt(a) == '[' ){
                st.push(s.charAt(a));
                if(a==len-1){
                    return false;
                }
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(s.charAt(a) == ')' && st.peek() == '('){
                    st.pop();
                }else if(s.charAt(a) == '}' && st.peek() =='{'){
                    st.pop();
                
                } else if(s.charAt(a) == ']' && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            a++;
        }
        if(st.isEmpty()) return true;
        else return false;

    }
}