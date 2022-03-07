package codechallenges.general.arrayReverse;

public class ArrayReverse {
    public static int[] arrayReverse(int[] arr){
        int front = 0;
        int back = arr.length -1;
        int temp = 0;
        while (front <= back) {
            temp = arr[back];
            arr[back] = arr[front];
            arr[front] = temp;
            front++;
            back--;
        }
        return arr;
    }
}
