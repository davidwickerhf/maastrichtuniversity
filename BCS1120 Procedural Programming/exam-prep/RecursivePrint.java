class RecursivePrint {

    public static void main(String[] args) {
        printDigits(9691);

    }

    public static void printDigits(int x) {
        if (x == 0)
            return;

        else {
            System.out.println(x - (x / 10) * 10);
            printDigits(x / 10);
        }
    }
}