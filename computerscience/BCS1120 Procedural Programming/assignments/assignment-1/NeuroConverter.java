import java.util.Scanner;

public class NeuroConverter {
    static final int CENT49 = 49;
    static final int CENT9 = 9;
    static final int CENT1 = 1;

    public static void main(String[] args) {

        // Initiate scanner
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.println("What is your amount?");
        double input = scanner.nextDouble();
        converter(input);

        scanner.close();
    }

    public static void converter(double amount) {
        
        // Divide whole part from floating part
        int whole = (int)amount;
        int floating = (int)Math.round((amount - whole) * 100.0);

        int cent49, cent9, cent1;
        cent49 = 0;
        cent9 = 0;
        cent1 = 0;

        while (floating > 0) {
            if ((floating - CENT49) >= 0 ){ 
                floating -= CENT49;
                cent49 ++;
            } else if ((floating - CENT9) >= 0) {
                floating -= CENT9;
                cent9 ++;
            } else {
                floating -= CENT1;
                cent1 ++;
            }
        }
        
        System.out.println(whole);
        System.out.println(cent49);
        System.out.println(cent9);
        System.out.println(cent1);
    }   
}

