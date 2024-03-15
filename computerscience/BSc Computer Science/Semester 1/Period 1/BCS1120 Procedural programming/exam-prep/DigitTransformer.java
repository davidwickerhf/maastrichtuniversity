public class DigitTransformer {
    public static void main(String[] args) {
        long[][] A = new long[][] {
                { 3, -101, 94, 12, 3 },
                { 777, 72, 54, 33040, 4 },
                { -444, 8898, 32, 9984, 233230021 }
        };
        digitTransformer(A);
    }

    public static void digitTransformer(long[][] A) {
        // loop over rows
        for (int i = 0; i < A.length; i++) {
            // loop over cols
            for (int j = 0; j < A[0].length; j++) {
                long element = Math.abs(A[i][j]);
                int count = String.valueOf(element).length();
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
