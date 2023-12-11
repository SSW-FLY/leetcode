public class LeetCode283 {


    public void moveZeroes(int[] nums) {
        int position = 0;
        int n = 0;
        while (position < nums.length) {
            if (nums[position] != 0) {
                nums[n] = nums[position];
                n++;
            }
            position++;
        }
        while (n < position) {
            nums[n] = 0;
            n++;
        }

    }
}

