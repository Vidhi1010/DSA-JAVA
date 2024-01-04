import java.util.*;

public class binomial_coeff {
     public static int factorial(int n){
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        //n!
        int n_fact = factorial(n);
        //r!
        int r_fact = factorial(r);
        //(n-r)!
        int nmr_fact = factorial(n - r);

        int binCoeff = n_fact / (r_fact * nmr_fact);
        
        return binCoeff;
    }
    public static void main(String[] args) {

        System.out.println(binCoeff(5,2));

    }
}
