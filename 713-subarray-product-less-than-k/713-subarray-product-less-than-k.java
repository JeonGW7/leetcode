class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        
        int answer=0;
        int tmp=1;
        
        int left=0;
        int right=0;
        
        while(right<nums.length){
            tmp*=nums[right];
            
            while(tmp>=k){
                tmp/=nums[left];
                left++;
            } 
            answer+=right-left+1;
            right++;
        }
        return answer;
    }
        
    
}