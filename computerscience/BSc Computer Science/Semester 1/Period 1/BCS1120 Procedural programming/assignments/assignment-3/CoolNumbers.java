import java.util.Arrays;
// Given a (non-zero) positive integer n, a number is considered cool if n is divisible by each of the numbers digits without remainder. 



public class CoolNumbers {

    public static void main(String[] args) {
        //This is just to test your method
    }

    /**
     * Write a method that given any positive integer (let that be x) and an integer n determines whether the number is cool or not (this means the method will return a boolean). The signature is given below. This method returns true if the input a is cool, and false otherwise. Check your method in the main. 
     * @param x
     * @param n
     * @return
     */
    public static boolean isCool(int x, int n) {
        // your code here

        // Turn integer into string
        String nString = String.valueOf(x);

        // Collect each digit of the number into an array
        Integer[] digits = Arrays.stream(nString.split("|"))
            .map(dig -> Integer.valueOf(dig))
            .toArray(Integer[]::new);

        // Check divisibility
        boolean divisible = true;
        for (Integer digit : digits) {
            if (digit == 0 || n % digit != 0) { 
                divisible = false;
                break;
            }
        }
        return divisible;
    }

    /**
     * Write  a  method  that  counts  (and  returns)  how many cool numbers exist  between a and b (which are provided as parameters) given a specific integer n. In this method, (re)use your method from a).  The signature is given below. This method returns the number of cool numbers between a and b. Check your method in the main. 
     * 
     * @param n
     * @param a
     * @param b
     * @return
     */
    public static int countCools(int n, int a, int b) {
     // your code here
        int counter = 0;
        for (int x = a; x <= b; x++) {
            if (CoolNumbers.isCool(x, n)) {
                counter++;
            }
        }
        return counter;
    }


    
}