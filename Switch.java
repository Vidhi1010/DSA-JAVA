import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt(); 
        System.out.println("Enter b : ");  
        int b = sc.nextInt(); 
        char operator = sc.next().charAt(0);
        
        switch(operator) {
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break;
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default : System.out.println("Wrong operator");
        }
    }
}
