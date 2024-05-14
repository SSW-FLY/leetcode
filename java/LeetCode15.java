import java.util.ArrayList;
import java.util.List;

public class LeetCode15 {


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);

    }


    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();



        for (int i = 0; i < nums.length; i++) {
            for (int a = i + 1; a < nums.length; a++) {
                for (int b = a + 1; b < nums.length; b++) {
                    if (nums[i] + nums[a] + nums[b] == 0) {
                        List<Integer> r = new ArrayList<>();
                        r.add(nums[i] );
                        r.add(nums[a]);
                        r.add(nums[b]);
                        result.add(r);
                    }
                }
            }
        }
        return result;

    }
}
