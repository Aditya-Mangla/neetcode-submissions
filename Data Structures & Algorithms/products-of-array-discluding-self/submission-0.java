class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] pref = new int[nums.length];
        pref[0] = 1;
        suff[nums.length-1] = 1;

        int left =1;
        int right = nums.length-1;
        while(left<=right){
            pref[left] = nums[left-1]*pref[left-1];
            left++;
            
        }
        left=0;
        right = right-1;
        while(right>=left){
            suff[right] = suff[right+1]*nums[right+1];
            right--;
        }
        
        for(int i=0;i<nums.length;i++){
            out[i] = pref[i] *suff[i];
        }
       return out;
    }
}  
