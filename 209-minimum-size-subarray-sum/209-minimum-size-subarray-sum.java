class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int tmp = 2147483647;
        for(end = 0; end <= nums.length-1; end++){
            sum += nums[end];
            //target보다 커졌을 경우 
            while(sum >= target){
                tmp = Math.min(tmp, end - start + 1);
                //start가 가르키는값을 sum에서 빼준다 
                sum -= nums[start];
                start++;
            }
        }
        return (tmp == 2147483647) ? 0 : tmp;
    }
}