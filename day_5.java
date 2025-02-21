import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer ,Integer> map=new HashMap<>();
        int maxkey=0;
        int maxfreq=nums.length/3;
        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxfreq) {
                maxkey = entry.getKey();
                list.add(maxkey);
            }
        }
        return list;  
    }
}