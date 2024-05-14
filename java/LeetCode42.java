/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */

public class LeetCode42 {


    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trap = trap(height);
        System.out.println(trap);
    }


    public static int trap(int[] height) {
        // 初始化
        int leftMax = height[0];
        int rightMax = height[height.length - 1];

        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        if (right == left) {
            return 0;
        }
        while (right - 1 != left) {
            if (leftMax < rightMax) {
                left = left + 1;
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    ans = ans + (leftMax - height[left]);
                }
            } else {
                right = right - 1;
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    ans = ans + (rightMax - height[right]);
                }
            }
        }

        return ans;
    }
}
