import java.util.*;
public class conditionals1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        /* int b = sc.nextInt();
        if(a > b){
            System.out.println("a is Greater");
        }
        else if(a == b){
           System.out.println("a is equal to b");
        }else{
             System.out.println("b is Greater");
        } */

        //odd or even
        /* if(a % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        } */

        //Income tax calculator

        /* int income =sc.nextInt();
        int tax;

        if(income < 500000){

            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            
            tax = (int)(income * 0.2);
        }else{ 

            tax = (int)(income * 0.3 );
        }
        System.out.println("Your tax is : " + tax); */

        //POSITIVE OR NEGATIVE

        /* if(a < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is Positive");
        } */

        //Temprature

        /* double temp = 103.5;
        if(temp > 100){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever");
        }*/

        //3.WEEK

        /* int week = sc.nextInt();
        switch(week){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default : System.out.println("Invalid Button");
        } */

        //4.leap year
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 400 == 0) && (year % 100 == 0);

        if(x && (y || z)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap Year");
        }

    } 
}
