import java.util.*;

public class practice {
    public static void main(String args[]){

        //1.AVERAGE OF 3 NUMBERS

        /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = (a + b + c) / 3;
        System.out.println(average); */

        //2.AREA OF SQUARE

       /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area = a * a;
        System.out.println(area); */

        //3.

        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float sum = pencil + pen + eraser;
        System.out.println("Bill is : " + sum);
        float gst = (0.18f * sum);
        float total = (sum + gst);
        System.out.println("Bill with 18% tax : " + total);


    }
}
