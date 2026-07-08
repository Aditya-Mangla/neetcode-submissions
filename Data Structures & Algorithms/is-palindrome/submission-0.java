class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s= s.toLowerCase();
        int left=0;
        int right = s.length();
        while(left<right){
            if(s.charAt(left) != s.charAt(right-1)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
