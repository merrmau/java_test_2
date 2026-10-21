import java.io.File;

public class Hello {
    public static void main(String[] args) {
        try {
            int z = calculated();
            System.out.println(z);
            System.out.println("HELLO");

        } catch (ArithmeticException exception) {
           exception.printStackTrace();
        }
    }

    private static int calculated() {
        var x = 1;
        var y = 1;
        var z = divide(x, y);
        return z;
    }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;
    }
}
