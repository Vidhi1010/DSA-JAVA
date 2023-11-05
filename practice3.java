import java.util.Scanner;

public class practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //program thats reads a set of integrs, and then prints the sum of the even and odd integers

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.println("Enter the number ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        //program to find the factorial of a number
         /* int num;
         int fact = 1;

         System.out.println("Enter any positive integer: ");
         num = sc.nextInt();

         for(int i = 1; i <= num; i++){
            fact *= i;
         }
         System.out.println("Factorial: " + fact); */
         

    }
}
