
public class kadanesAlgo {

        public static int maxSubarraySum(int[] arr) {
            int cs = arr[0];
            int ms = arr[0];
            
            for (int i = 1; i < arr.length; i++) {
                //arr[i] - sum of previous element
                
                cs = Math.max(arr[i], cs + arr[i]);
                ms = Math.max(ms, cs);
            }
            
            return ms;
        }
        public static void main(String[] args) {
            int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
            int result = maxSubarraySum(arr);
            System.out.println("Maximum subarray sum of all negative elements: " + result);
        }
}
