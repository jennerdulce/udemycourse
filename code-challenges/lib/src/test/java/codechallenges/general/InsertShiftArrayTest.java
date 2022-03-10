package codechallenges.general;

import codechallenges.general.arrayReverse.ArrayReverse;
import codechallenges.general.insertShiftArray.InsertShiftArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertShiftArrayTest {
    @Test void insert_shift_array() {
        InsertShiftArray sut = new InsertShiftArray();
        int[] evenTest = {0, 1, 2, 3, 4, 5};
        int[] expectedEvenResult = sut.insertShiftArray(evenTest, 99);
        assertEquals("[0, 1, 2, 99, 3, 4, 5]", Arrays.toString(expectedEvenResult), "Should be true.");

        int[] oddTest = {0, 1, 2, 3, 4};
        int[] expectedOddResult = sut.insertShiftArray(oddTest, 99);
        assertEquals("[0, 1, 99, 2, 3, 4]", Arrays.toString(expectedOddResult), "Should be true.");

        int[] emptyArr = {};
        int[] expectedEmptyResult = sut.insertShiftArray(emptyArr, 99);
        assertEquals("[99]", Arrays.toString(expectedEmptyResult), "Should be true");

    }
}