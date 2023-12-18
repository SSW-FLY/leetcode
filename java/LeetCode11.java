public class LeetCode11 {

    public static void main(String[] args) {


    }


    /**
     * 假设第n个面积有 fn = max
     *
     * @param height
     * @return
     */

    public int maxArea(int[] height) {
        int max = 0;

        for (int i = 1; i < height.length; i++) {
            max = Math.max(max, max(i, height));
        }

        return max;

    }

    public int max(int index, int[] height) {
        int max = 0;

        for (int i = index - 1; i >= 0; i--) {
            int min = Math.min(height[index], height[i]);
            max = Math.max(max, min * (index - i));
        }

        return max;
    }
}
