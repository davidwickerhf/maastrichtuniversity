public class Lecture2d {
    public static void main(String[] args) {
        double x = 20.0;
        double y = 10.0;
        double area;

        {
            // Inner scope. defining area hear will not make it accessible from outside the scope
            area = x * y;
        }

        {
            System.out.println("The area is: " + area);
        }
        
    }
}
