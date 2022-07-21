class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        
        int answer=0;
        int tmp=1;
        
        int start=0;
        int end=0;
        
        while(end<nums.length){
            tmp*=nums[end];
            
            while(tmp>=k){
                tmp/=nums[start];
                start++;
            } 
            answer+=end-start+1;
            end++;
        }
        return answer;
    }
        
    
}