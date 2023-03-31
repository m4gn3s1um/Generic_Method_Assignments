import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Integer[] talRække = {1,2,3,4,5,6,7};

        String[] bogstavRække = {"ab","bc","cd","de","ef","fg"};
        Double[] doubleRække = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};

        int t = 3;
        int s = 3;
        int g = 5;

        String ss = "ses";
        String bb = "ses";
        String tt = "hej";


        printArray(talRække);
        printArray(bogstavRække);
        printArray(doubleRække);

        isEqualTo(t,s);
        isEqualTo(t,g);
        isEqualTo(ss,bb);
        isEqualTo(ss,tt);


        Pair p1 = new Pair(43,2.0);
        Pair p2 = new Pair("Hello", 'C');

    }

    public static <T> void printArray(T[] arr){

        System.out.println("\n" + "Normal order: ");
        for (T element : arr) {
            System.out.printf("%s ", element);
        }

        System.out.println("\n" + "Reverse order: ");
        Collections.reverse(Arrays.asList(arr));
        for (T element : arr) {
            System.out.printf("%s ", element);
        }
    }

    public static <T extends Comparable<T>> void isEqualTo(T x, T y){
        if(x.equals(y)){
            System.out.println("\n" + "It is indeed true, they are equal");
        }
        else {
            System.out.println("\n" + "It was all a lie... They are not equal...");
        }
    }
}