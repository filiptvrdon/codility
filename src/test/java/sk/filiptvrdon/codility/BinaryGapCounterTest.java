package sk.filiptvrdon.codility;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapCounterTest {

    BinaryGapCounter binaryGapCounter = new BinaryGapCounter();

    @Test
    public void testCalculateBinaryGap() {
        assertEquals(2, binaryGapCounter.calculatebBinaryGap(9));
        assertEquals(4, binaryGapCounter.calculatebBinaryGap(529));
        assertEquals(1, binaryGapCounter.calculatebBinaryGap(20));
        assertEquals(0, binaryGapCounter.calculatebBinaryGap(15));
    }

}
