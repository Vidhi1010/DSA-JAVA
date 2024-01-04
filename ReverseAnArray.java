import java.util.*;
public class ReverseAnArray {

    public static void reverse(int numbers[]){
        int first = 0, end = numbers.length - 1;
        while(first < end){
            //swap
            int temp = numbers[end];
            numbers[end] = numbers[first];
            numbers[first] = temp;

            first++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);

        //print array
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    } 
}
