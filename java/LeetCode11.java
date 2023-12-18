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

        int i = 0, j = height.length - 1;

        while (i != j) {
            int min = Integer.min(height[i], height[j]);
            max = Integer.max(max, min * (j - i));
            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
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
