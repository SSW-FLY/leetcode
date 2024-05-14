import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode128 {

    public static void main(String[] args) {

    }

    /**
     * 示例 1：
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     * 示例 2：
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     */

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;

        for (Integer s : set) {
            if (!set.contains(s - 1)) {
                int current = s;
                int currentStreak = 1;
                while (set.contains(current + 1)) {
                    current++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }


}
