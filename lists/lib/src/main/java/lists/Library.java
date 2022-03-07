package lists;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.*;

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
        System.out.println("Duplicates? " + containsDuplicates(duplicateNumbers));

        ArrayList<Integer> nonDuplicateNumbers = new ArrayList<>();
        duplicateNumbers.add(1);
        duplicateNumbers.add(2);
        duplicateNumbers.add(3);
        System.out.println("Duplicates? " + containsDuplicates(nonDuplicateNumbers));

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

        // Weather Data
        System.out.println(weatherData(weeklyMonthTemperatures));

        // Tally
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        System.out.println(tally(votes));
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

    public static boolean containsDuplicates(ArrayList<Integer> numbers){
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

    public static String weatherData(int[][] arr){
        // Find the MIN and MAX values of all the temps
        int lowestTemp = Integer.MAX_VALUE;
        int highestTemp = Integer.MIN_VALUE;
        HashSet<Integer> recordedTemps= new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < lowestTemp){
                    lowestTemp = arr[i][j];
                }
                if (arr[i][j] > highestTemp){
                    highestTemp = arr[i][j];
                }
                if (recordedTemps.contains(arr[i][j]) == false){
                    recordedTemps.add(arr[i][j]);
                }
            }
        }
        // Check to see what temps were not recorded by using MIN and MAX values as the range of numbers
        String weatherString = "";
        weatherString += "High: " + highestTemp + "\n";
        weatherString += "Low: " + lowestTemp + "\n";
        for (int i = lowestTemp; i <= highestTemp; i++){
            if (!recordedTemps.contains(i)){
                weatherString += "Never saw temperature: " + i + "\n";
            }
        }
        return weatherString;
    }

    public static String tally(List<String> votes){
        HashMap<String, Integer> totalVotes = new HashMap<>();
        String winner = "placeholder";
        int highestNumberOfVotes = Integer.MIN_VALUE;
        // Similar to foreach
        for (String name : votes){
            if(!totalVotes.containsKey(name)) {
                totalVotes.put(name, 0);
            } else {
                // put overrides the value of the key; Wondering if we are able to just update by totalVotes.get(name) + 1 (skipping put method
                totalVotes.put(name, totalVotes.get(name) + 1);
            }
            if (totalVotes.get(name) > highestNumberOfVotes) {
                highestNumberOfVotes = totalVotes.get(name);
                winner = name;
            }
        }
        String announceWinner = winner + " received the most votes!";
        return announceWinner;
    }

}
