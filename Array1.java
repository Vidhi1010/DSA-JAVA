import java.io.*;
import java.lang.*;
import java.util.Arrays;
public class Array1 {
    public static boolean check(int number[]) {

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                if (number[i] == number[j]) {
                    return true;
                }

            }

        }
        return false;

    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 1 };

        //boolean res = check(number);
        System.out.println(check(number));

	    
    }
}