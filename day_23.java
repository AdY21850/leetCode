class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int entity:map.keySet()){
            if (entity>0){
                sum+=entity;
            }

        }
        if (sum==0){
                sum=Arrays.stream(nums).max().getAsInt();
        }
        return sum;
    }
}