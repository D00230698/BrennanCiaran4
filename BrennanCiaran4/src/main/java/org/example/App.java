package org.example;

/**
 * https://github.com/D00230698/BrennanCiaran4
 * Ciaran Brennan
 *D00230698
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Reading File in:");

        try {
            File file = new File("JCResults.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                String studentNumber = line.split(",")[0];
                splitStudent(line);
                int[] fiveGrades = splitStudent(line);
                double average = calculateAverage(fiveGrades);

                System.out.println("Student Number: " + studentNumber + " Average: " + average + "%");
            }
            sc.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int[] splitStudent(String line) {

        int index = 0;
        String[] studentArray = line.split(",");

        int[] copyStudentArray = new int[studentArray.length - 1];
        for (int i = 0, j = 0; i < studentArray.length; i++)
        {
            if (i != index)
            {
                copyStudentArray[j++] = Integer.parseInt(studentArray[i]);
            }
        }

        int studentGradesCount = 0;
        int studentMarksCount = 0;
        int[] studentSubjects = new int[8];
        int[] studentMarks = new int[8];

        for(int i = 0; i < copyStudentArray.length; i++)
        {
            if(i % 2 == 0)
            {
                studentSubjects[studentGradesCount] = copyStudentArray[i];
                studentGradesCount++;
            } else {
                studentMarks[studentMarksCount] = copyStudentArray[i];
                studentMarksCount++;
            }
        }

        int[] fiveGrades = selectFiveGrades(studentSubjects, studentMarks);

        return fiveGrades;
    }

    public static int[] selectFiveGrades(int [] subjectCodes, int[] studentGrades) {

        int[] fiveGrades = new int[5];
        int[] remainingGrades = new int[5];
        int indexHighestNumber = -1;
        int fiveGradesCounter = 0;
        int counterRemainingGrades = 0;
        int tempNumber = 0;

        for(int i = 0; i < subjectCodes.length; i++) {
            if(subjectCodes[i] == 1) {
                fiveGrades[fiveGradesCounter] = studentGrades[i];
                fiveGradesCounter++;
            } else if (subjectCodes[i] == 2)
            {
                fiveGrades[fiveGradesCounter] = studentGrades[i];
                fiveGradesCounter++;
            } else if (subjectCodes[i] == 3)
            {
                fiveGrades[fiveGradesCounter] = studentGrades[i];
                fiveGradesCounter++;
            } else {
                remainingGrades[counterRemainingGrades] = studentGrades[i];
                counterRemainingGrades++;
            }
        }
        for(int j = 0; j < 2; j++) {
            for(int i = 0; i < remainingGrades.length; i++) {
                tempNumber = remainingGrades[0];
                if (remainingGrades[i] > tempNumber && i != indexHighestNumber) {
                    tempNumber = remainingGrades[i];
                    indexHighestNumber = i;
                }
            }
            fiveGrades[fiveGradesCounter] = tempNumber;
            fiveGradesCounter++;
        }
        return fiveGrades;
    }

    public static double calculateAverage(int[] selectedGrades)
    {
        int i = 0;
        int sum = 0;
        double average = 0;
        while(i < selectedGrades.length){
            sum += selectedGrades[i];
            i++;
        }
        average = sum/ (double)i;
        return average;
    }

}



