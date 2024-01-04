//BRUTEFORCE TECHNIQUE - It's time compexity is worst so we will prefer to do this code with prefix array

public class MaxSubArray {
    public static void maxSubarraySum(int numbers[]){
            
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
        int start = i;
            for(int j = i; j < numbers.length; j++){
            int end = j;
            currentSum = 0;//when i will move forward then we set the value of currentSum = 0
                for(int k = start; k <= end; k++){//print
                    //subarray sum
                    currentSum +=numbers[k];
                }
                System.out.println(currentSum);
                if(maximumSum < currentSum){
                    maximumSum = currentSum;
                }
            }
        }
        System.out.println("max sum = " + maximumSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);

    }

}
