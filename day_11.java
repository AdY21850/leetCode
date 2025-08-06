class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int [2];
        arr[0]=find_first(nums,target);
        arr[1]=find_last(nums,target);
        return arr;
    }
     public int find_first(int arr[],int target){
        int high=arr.length-1;
        int low=0;
        int mid=0;
        int result=-1;
        while (low<=high){
            mid=(low+high)/2;
            if (arr[mid] < target) {
                low = mid + 1;
                } else {
             high = mid - 1;
            }
                 if (arr[mid]==target){
               result= mid;
                high=mid-1;
            }
            }
        
        return result;
    }

    public int find_last(int arr[],int target){
        int high=arr.length-1;
        int low=0;
        int mid=0;
        int result=-1;
        while (low<=high){
            mid=(low+high)/2;
            if (arr[mid]==target){
                result=mid;
                low = mid + 1;
            }if (arr[mid] <= target) {
                low = mid + 1;
            }
            else{
               high = mid - 1;
            }
        }
        return result;
    }
   
}
