package codechallenges.general;

import codechallenges.general.arrayReverse.ArrayReverse;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverseTest {
    @Test void array_reverse() {
        ArrayReverse sut = new ArrayReverse();
        int[] evenNumber = {0, 1, 2, 3, 4, 5};
        int[] expectedEvenResult = sut.arrayReverse(evenNumber);
        assertEquals("[5, 4, 3, 2, 1, 0]", Arrays.toString(expectedEvenResult), "Should be true");

        int[] oddNumber = {0, 1, 2, 3, 4};
        int[] expectedOddResult = sut.arrayReverse(oddNumber);
        assertEquals("[4, 3, 2, 1, 0]", Arrays.toString(expectedOddResult), "Should be true");

        int[] emptyArr = {};
        int[] expectedEmptyResult = sut.arrayReverse(emptyArr);
        assertEquals("[]", Arrays.toString(expectedEmptyResult), "Should be true");
    }
}
