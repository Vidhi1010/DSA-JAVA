import java.util.*;

public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
             System.out.println("n is Prime");
        }else{
            boolean isPrime = true;
            //for(int i = 2; i <= Math.sqrt(n); i++)
            //Math.sqrt(n)- use to find square root of any number
            
            for(int i = 2; i <= n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is Prime");
            }else {
                System.out.println("n is not Prime");
            }
        }
    }
}
