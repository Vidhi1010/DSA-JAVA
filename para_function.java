import java.util.*; 

public class para_function {

    public static int calculateSum(int num1, int num2){//parameters or formal parameters-definition
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int sum1 = calculateSum(a, b);//arguments or actual parameters-call
        System.out.println("Sum is : " + sum1);
    }
}
//