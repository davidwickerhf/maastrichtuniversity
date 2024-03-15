public class TestQ2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = 4;
        int x = i + j + k;

        i = x - i - j;
        j = x - j - k;
        k = x - i - k;

        // int a = 5;
        // int b = 10;
        // int c = b;

        // a = a + 1;
        // b = b - 1;
        // c = c + a;

        // int a = 1;
        // int b = 2;
        // int c;
        // int d;

        // c = ++b;
        // d = a++;
        // c++;
        // b++;
        // ++a;

        double var1 = 1 + 5;

        double var2 = var1 / 4;

        int var3 = 1 + 5;

        int var4 = var3 / 4;

        System.out.print(var2 + " " + var4);

        // System.out.println(i + " " + j + " " + k);
        // test(99.9);
    }

    public static void test(float a) {
        System.out.println("float");
    }

    public static void test(double a) {
        System.out.println("double");
    }

}
