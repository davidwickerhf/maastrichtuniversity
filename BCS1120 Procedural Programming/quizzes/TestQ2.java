public class TestQ2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = 4;
        int x = i + j + k;

        i = x - i - j;
        j = x - j - k;
        k = x - i - k;

        System.out.println(i + " " + j + " " + k);
    }

    public static void test(float a) {
        System.out.println("float");
    }

    public static void test(double a) {
        System.out.println("double");
    }

}
