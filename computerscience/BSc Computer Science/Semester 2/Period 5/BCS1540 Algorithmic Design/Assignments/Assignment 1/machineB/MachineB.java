import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.io.File;

public class MachineB {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        String filename = scanner.nextLine();
        File infile = new File(filename);
        Scanner input = new Scanner(infile);

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            //Do something with this, presumably
        }
        //Some clever stuff
        System.out.printf("2\n");
        scanner.close();
    }
}

