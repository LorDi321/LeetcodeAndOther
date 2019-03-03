package randomArray;

public class FindMaxInRotatedSortedArray {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;


        int i = 0, j = nums.length - 1;
        while(i < j) {
            int mid = (i + j) / 2;
            if(nums[mid] > nums[j])
                i = mid + 1;
            else
                j = mid;
        }
        return nums[i];
    }
}
