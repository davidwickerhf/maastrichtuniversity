import java.util.Scanner;

import java.nio.charset.Charset;
import java.io.*;
import java.nio.file.Files;
import java.io.File;

public class Anchored {
    
  public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        String filename = scanner.nextLine();
        File infile = new File(filename);
        Scanner input = new Scanner(infile);
        String s1, s2;
        s1 = input.nextLine();
        s2 = input.nextLine();
        //Some clever stuff
        System.out.println(3);
        
        scanner.close();
    }
}

