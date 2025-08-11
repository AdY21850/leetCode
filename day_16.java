class Solution {
    public int singleNonDuplicate(int[] arr) {
        int high = arr.length - 1; 
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            
            if ((mid == 0 || arr[mid - 1] != arr[mid]) && 
                (mid == arr.length - 1 || arr[mid + 1] != arr[mid])) {
                return arr[mid];
            }

            if (mid > 0 && arr[mid - 1] == arr[mid]) {
    if ((mid & 1) == 1) {     
        low = mid + 1;
    } else {                     
        high = mid - 2;
    }
} else {
  
    if ((mid & 1) == 0) {         
        low = mid + 2;
    } else {                     
        high = mid - 1;
    }
}
        }
        return -1; 
    }
}
