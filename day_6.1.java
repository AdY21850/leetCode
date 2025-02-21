import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int arr[]=new int [2];
        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
          int k=0;
        for (int j=0;j<nums.length;j++)
        {
            k=target-nums[j];
            if (map.containsKey(k) && map.get(k) != j)
            {
                arr[0]=j;
                arr[1]=map.get(k);
            }
        }
        return arr;
        
    }
}