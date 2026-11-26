import java.util.Scanner;

public class Rutube {
    public static void main (String [] args) {
        int j = 4;
        boolean result = isEven(j);
        print("Число " + j  + " четное? = " + result);
        printDefault();
    }

    static boolean isEven(int i) {
        boolean isEven = (i % 2) == 0;
        return isEven;
    }
    static void print(String str) {
        System.out.println(str);
    }
    static void printDefault(){
        System.out.println("HELLO");


    }


}

