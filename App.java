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
        //readLineByLine("JC_Results.txt");
        int  studentNumbers = 891234;
        int [] subjectCodes = {1, 2, 3, 4, 5, 12, 42, 46};
        int [] studentGrades = {65,58,45,60,50,48,42,60};

        int [] grades = selectFiveGrades(subjectCodes, studentGrades);
        System.out.println(Arrays.toString(grades));
    }
   /* public static void readLineByLine(String file)

    {
        System.out.println("Read and output text file line-by-line");
int i = 0;
        try {
            Scanner sc = new Scanner(new File(file));

            while (sc.hasNext()) {
                String str = sc.nextLine();
                //System.out.println(str);

                String[] parts = str.split(",");
                sc.useDelimiter(",");
                int[] studNum = new int[parts.length];
                int[] subjectCodes = new int [parts.length];

                studNum[i] = Integer.parseInt(parts[0]);

                for (i = 0; i <= parts.length; i++){
                    subjectCodes[i] = Integer.parseInt(parts[i]);
                }


                System.out.println(studNum[i]);
                //System.out.println(subjectCodes[i]);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/
   public static int[] selectFiveGrades(int [] subjectCodes, int[] studentGrades) {
       int i = 0;
       int x = 0;
       int tempNum = 0;
       int[] fiveGrades = new int[5];
       for (i = 0; i < 8; i++) {
               if (subjectCodes[i] == 1) {
                   fiveGrades[x] = studentGrades[i];
                   x++;
               } else if (subjectCodes[i] == 2) ;
               {
                   fiveGrades[x] = studentGrades[i];
                   x++;
               }
               if (subjectCodes[i] == 3) {
                   fiveGrades[x] = studentGrades[i];
                   x++;
               } else if (subjectCodes[i] != 218 && subjectCodes[i] != 1 && subjectCodes[i] != 2 && subjectCodes[i] != 3 && studentGrades[i] > tempNum) {
                   tempNum = studentGrades[i];
                   fiveGrades[x] = tempNum;
                   x++;
               }
           }

       return fiveGrades;
   }

   }



