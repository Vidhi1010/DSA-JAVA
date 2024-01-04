public class Avg {

    public static float avgOfThreeNum(float a, float b, float c){
        float avg = 0;
        avg = (a + b + c)/3;
        return avg;
    }
  public static void main(String[] args) {
    System.out.println(avgOfThreeNum(1, 2, 4));
  }  
}
