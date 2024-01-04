/* import java.util.*;

public class linearSearch {

    public static int linearSearch(int numbers[], int key){

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){

       int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("key is at index : " + index );
        }
    }
} */
import java.util.*;

public class linearSearch {

    public static int linearSearch(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {  // Use .equals() for string comparison, not ==
                return i;
            } 
        }
        return -1;  // Return -1 for not found
    }

    public static void main(String args[]) {
        String menu[] = {"samose", "idli", "momo", "dosa"};
        String key = "momo";
        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
