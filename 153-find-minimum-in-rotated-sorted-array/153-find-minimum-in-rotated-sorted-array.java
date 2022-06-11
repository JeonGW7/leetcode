class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums[left]<=nums[right]){
            return nums[left];
        }
        
        while(left<right){
            int mid = (left+right)/2;
            if(nums[left]<nums[mid]){
                left=mid;
            }
            else{
                right=mid;
            }
        }
        return nums[left+1];
    }
}