import java.util.*;

public class swap {
    public static void swapNum(int a, int b){
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Enter a : " + a);
        System.out.println("Enter b : " + b);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        swapNum(a, b);
        

    }
}
