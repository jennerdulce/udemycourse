package codechallenges.general.insertShiftArray;

import java.util.Arrays;

public class InsertShiftArray {

    public static int[] insertShiftArray(int[] arr, int newMidpoint) {
        int midpoint = arr.length / 2;
        int[] newArr = new int[arr.length + 1];
        boolean newNumAdded = false;
        for (int i = 0; i < newArr.length; i++) {
            if (i == midpoint) {
                newArr[i] = newMidpoint;
                newNumAdded = true;
            } else {
                if (newNumAdded) {
                    newArr[i] = arr[i - 1];
                } else {
                    newArr[i] = arr[i];
                }
            }
        }
        return newArr;
    }
}
