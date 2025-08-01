import java.util.Arrays;
//Ady21850
public class day_10 {
//Ady21850
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int mid=0;
        int low=0;
        int high =nums.length-1;
        while (low<=high){
         mid=(low+high)/2;
            if (target==nums[mid])
            {
                return mid;
            }
            else if (target <nums[mid]){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
    }
}
