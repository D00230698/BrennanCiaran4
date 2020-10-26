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
        readWordByWord("JC_Results.txt");
        getStudentNumber("JC_Results.txt");
    }

    public static void readWordByWord(String file) {
        System.out.println("Reading a text file word-by-word:");

        try {
            Scanner sc = new Scanner(new File(file));

            while (sc.hasNext()) {
                String word = sc.next();
                System.out.println(word);
            }
            sc.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void getStudentNumber(String file) {
        try
        {

            Scanner sc = new Scanner(new File(file));

            String str = sc.nextLine();
            String[] parts = str.split(",");
            int[] studNum = new int[parts.length];
            for(int i = 0; i <= parts.length; i++)
            {
                studNum[i] = Integer.parseInt(parts[0]);
            }

            System.out.println(Arrays.toString(studNum));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
