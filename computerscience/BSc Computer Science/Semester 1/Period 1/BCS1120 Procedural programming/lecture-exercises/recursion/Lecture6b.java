package recursion;

public class Lecture6b {
    public static void main(String[] args) {

    }

    public static int fibonacci(int index) {
        if (index == 0) {
            return 1;
        } else if (index == 1) {
            return 1;
        } else {
            return fibonacci(index - 2) + fibonacci(index - 1);
        }
    }
}
