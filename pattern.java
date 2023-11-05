import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* for(int i = 1; i <= n; i++){
            //one line
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } */
        //inverted *
        /* for(int i = 1; i <= n; i++){
            //one line
            for(int j = 1; j <= (n - i + 1); j++){
                System.out.print(j);
            }
            System.out.println();
        } */
        
        
        //Print character pattern

        char ch = 'A';
        for(int i = 1; i <= n; i++){
            //one line
            for(int chars = 1; chars <= i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
