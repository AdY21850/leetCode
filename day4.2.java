class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer ,Integer> map=new HashMap<>();
        int maxkey=0;
        int maxfreq=0;
        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxfreq) {
                maxfreq = entry.getValue();
                maxkey = entry.getKey();
            }
        }
        return maxkey;
    }
}