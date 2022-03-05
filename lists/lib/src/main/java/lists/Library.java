package lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Library {
    public static void main(String[] args){
        // Array Syntax
        int[] integerArray = new int[5];
        String[] stringArray = new String[4];
        int[] integerArray2 = {1, 2, 3};

        // Array of integers starts with value of 0 for every index [0, 0, 0, 0, 0, 0, 0]
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Array of strings starts with value of null for every index [null, null, null...]
        String[] days = new String[7];
        for (int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }

        // Arrays can be hard coded with values
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++){
            String message = "There are " + daysInMonths[i] + " days in " + months[i] + ".";
            System.out.println(message);
        }

        // Roll
        System.out.println(roll(4));

        // Duplicates
        ArrayList<Integer> duplicateNumbers = new ArrayList<>();
        duplicateNumbers.add(1);
        duplicateNumbers.add(2);
        duplicateNumbers.add(3);
        duplicateNumbers.add(1);
        System.out.println("Duplicates? " + duplicates(duplicateNumbers));

        ArrayList<Integer> nonDuplicateNumbers = new ArrayList<>();
        duplicateNumbers.add(1);
        duplicateNumbers.add(2);
        duplicateNumbers.add(3);
        System.out.println("Duplicates? " + duplicates(nonDuplicateNumbers));

        // Averages
        int[] someNumbers = {10, 20, 30, 99, 1313, 599};
        System.out.println("Average value: " + averages(someNumbers));

        // Array of Arrays
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(lowestAverage(weeklyMonthTemperatures));
    }

    public static ArrayList<Integer> roll(int rolls){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < rolls; i++){
            Random dice = new Random();
            int diceRoll = dice.nextInt(6) + 1;
            nums.add(diceRoll);
        }
        return nums;
    }

    public static boolean duplicates(ArrayList<Integer> numbers){
        ArrayList<Integer> trackedNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++){
            if (trackedNumbers.contains(numbers.get(i))){
                return true;
            } else {
                trackedNumbers.add(numbers.get(i));
            }
        }
        return false;
    }

    public static double averages(int[] numbers){
        double average = 0d;
        for (int i = 0; i < numbers.length; i++){
            average += numbers[i];
        }
        return average / numbers.length;
    }

    public static String lowestAverage(int[][] arrayList){
        double lowestAverage = Double.POSITIVE_INFINITY;
        int[] lowestArr = new int[999];
        for (int i = 0; i < arrayList.length; i++){
            int[] currentArr = arrayList[i];
            double sum = averages(currentArr);
            if (sum < lowestAverage){
                lowestArr = arrayList[i];
                lowestAverage = sum;
            }
        }
        return  Arrays.toString(lowestArr);
    }


}
