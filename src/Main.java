import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        //Task 1
        int arraySize = SafeInput.getRangedInt(in, "Enter the size of the array", 1, 100);
        int[] randomNumbers = new int[arraySize];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rnd.nextInt(100) + 1;
        }

        //Task 2
        int minValue = randomNumbers[0];
        int maxValue = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < minValue) {
                minValue = randomNumbers[i];
            }
            if (randomNumbers[i] > maxValue) {
                maxValue = randomNumbers[i];
            }
        }

        //Task 3
        int sum = 0;
        for (int num : randomNumbers) {
            sum += num;
        }
        double average = (double) sum / randomNumbers.length;

        //Task 4
        int searchValue = SafeInput.getInt(in, "Enter a value to search for in the array");
        boolean found = false;
        for (int num : randomNumbers) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }

        System.out.println("Array filled with random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
        System.out.printf("Average value: %.2f%n", average);
        if (found) {
            System.out.println("The value " + searchValue + " was found in the array.");
        } else {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }


        int arraySize1 = SafeInput.getRangedInt(in, "Enter the size of the array", 1, 100);
        int[] dataPoints = new int[arraySize1];


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 5
        int searchValue2 = SafeInput.getRangedInt(in, "Enter a value between 1 and 100", 1, 100);

        // Task 6
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue2) {
                count++;
            }
        }
        System.out.println("The value " + searchValue2 + " was found " + count + " time(s) in the array.");

        // Task 7: Find the first occurrence of the value
        boolean found2 = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                System.out.println("The value " + searchValue2 + " was found at array index " + i + ".");
                found2 = true;
                break;
            }
        }
        if (!found2) {
            System.out.println("The value " + searchValue2 + " was not found in the array.");
        }
        // Task 8
        int minValue2 = dataPoints[0];
        int maxValue2 = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue2) {
                minValue2 = dataPoints[i];
            }
            if (dataPoints[i] > maxValue2) {
                maxValue2 = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + minValue2);
        System.out.println("Maximum value in the array: " + maxValue2);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}



