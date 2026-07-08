class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
                count=Math.max(curr,count);
            }else if(curr>0 && nums[i]==0){
                curr=0;
            }
        }
        return count;
    }
}