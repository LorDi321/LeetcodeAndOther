package arrayAndString;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int x : nums) {
            if(x != val)
                nums[k++] = x;
        }
        return k;
    }
}
