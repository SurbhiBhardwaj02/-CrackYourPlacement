package Arrayss;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, water = 0;
        while (i < j) {
            int width = j - i;
            int high = Math.min(height[i], height[j]);
            water = Math.max(water, high * width);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return water;
    }
}
