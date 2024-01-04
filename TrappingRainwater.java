import java.util.*;

public class TrappingRainwater {
    public static int trappedRainwater(int height[]){

        //calculate left max boundary - array
        int leftMax[] = new int[height.length];//new int[height.length] - size of array
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);//leftMax[i] - it is storing the value of leftmax
            //System.out.println("leftMax array : " + leftMax[i]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            //System.out.println("rightMax array : " + rightMax[i]);
        }
        //loop
        int trappedWater = 0;

        for(int i = 0; i < height.length; i++){
            //Water level = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //System.out.println("waterLevel : " + waterLevel);
            
            //Trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
            //System.out.println("trappedWater : " + trappedWater);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int total = trappedRainwater(height);
        System.out.println("Total water trapped : " + total);

    }
}
