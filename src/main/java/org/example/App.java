package org.example;

/**
 * Hello world!
 *
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        readLineByLine("JC_Results.txt");

    }

    public static void readLineByLine(String file) {
        System.out.println("Read and output text file line-by-line");



        try {
            Scanner sc = new Scanner(new File(file));


            while (sc.hasNext()) {
                int i = 0;

                String str = sc.nextLine();

                String [] StudentResultsObjects = str.split(",");

                System.out.println(Arrays.toString(StudentResultsObjects));
                System.out.println("hello");

            }
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    
  /* public static int[] makeArrays (String[] args)
    {
        FileReader reader= new FileReader("JC_Results.txt");

        while (reader.hasNext()) {
                String str = sc.nextLine();
                String[] parts = str.split(",");
                String stud = parts[0];
                for []

    } */
}
