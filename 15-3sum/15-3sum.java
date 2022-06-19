class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //배열 정렬(오름차순)
        List<List<Integer>> list=new ArrayList();
        for(int i1=0;i1<nums.length-2;i1++){
            if(i1>0 && nums[i1]==nums[i1-1])
                continue;
            int i2=i1+1;
            int i3=nums.length-1;
            while(i2<i3){
                int sum=nums[i1]+nums[i2]+nums[i3];
                if(sum==0){
                    List<Integer> tmp=new ArrayList();
                    tmp.add(nums[i1]);
                    tmp.add(nums[i2]);
                    tmp.add(nums[i3]);
                    list.add(tmp);
                    i3--;
                    while(i2<i3 && nums[i3]==nums[i3+1]){ //중복
                        i3--;  
                    }
                }
                else if(sum>0){
                    i3--;
                }else{ //sum이 0보다 작은경우 
                    i2++;
                }
            }
        }
        return list;
    }
}