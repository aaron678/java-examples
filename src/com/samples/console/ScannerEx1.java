package com.samples.console;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
            System.out.println(line);
          //  do not close a scanner tied to System.in
         //   scanner.close();
        }
        System.out.println("done");
    }
}
