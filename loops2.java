import java.util.*;
public class loops2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       //WHILE LOOP
       /* int counter = 0;
       while(counter < 100) {
            System.out.println("Hello World");
        counter++;
       } */
       //1-10
       /* int counter = 1;
       while(counter <= 10) {
            System.out.println(counter);
        counter++;
       } */

       //1-n

       /* int n = sc.nextInt();
       int counter = 1;
       while(counter <= n) {
            System.out.print(counter);
        counter++;
       } */

       //Sum of first n natural numbers
        /* int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.print(sum); */

        // Stars
        /* int line = 1;
        while(line <= 4){
            System.out.println("****");
            line++;
        } */
//FOR LOOP
        /* int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("****");
        } */
//Print reverse of a number
        //int n = sc.nextInt();
       /*  while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10; 
        }
        System.out.println(); */

        //Reverse the given number
        /* int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev); */
//DO WHILE LOOP
      /* int i = 1;
      do{
        System.out.println("Hello World");
        i++;
      }  while(i <= 10); */

//BREAK STATEMENT - exit the loop
      /* for(int i = 0; i <= 5; i++){
            if(i == 3) {
                break;
            }
            System.out.println(i);
      }
      System.out.println("I am out of the loop"); */
//keep entering numbers till user enters a multiple of 10

      
     /*  do{
        System.out.println("Enter your number");
        int n = sc.nextInt();
        if(n % 10 == 0){
            break;
        }
        System.out.println(n);
       }while(true); */

//CONTINUE STATEMENT- to skip an itration
       /* for(int i = 0; i <= 5; i++){
            if(i == 3) {
            continue;
            }
        System.out.println(i);
       }
 */
       //DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLE OF 10
    
       /* do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
            continue;
            }
            System.out.println(n);
        }while(true); */
//Prine number
        


    }
}
