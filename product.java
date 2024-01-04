import java.util.*;

public class product {
    public static int calculateProduct(int num1, int num2){//parameters or formal parameters-definition
        int mul = num1 * num2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int product = calculateProduct(a, b);//arguments or actual parameters-call
        System.out.println("Product of two numbers is : " + product);
        /* int product1 = calculateProduct(3, 5);
        System.out.println("Product of two numbers is : " + product1); */
    }
}
