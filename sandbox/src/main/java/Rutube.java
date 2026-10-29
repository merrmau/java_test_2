import java.util.Scanner;

public class Rutube {
    public static void main (String [] args) {
        System.out.println("Наберите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println("I love " + text);
    }
}
