package sk.filiptvrdon.codility;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

  private final OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

  @Test
  void test() {
    Integer[] ints = new Integer[99];
    for (int i = 0; i < 98; i += 2) {
      ints[i] = ints[i + 1] = (i / 2) + 1; // Pairing elements
    }
    ints[98] = 100;
    System.out.println(java.util.Arrays.toString(ints));

    Assertions.assertEquals(100,oddOccurrencesInArray.findSingleOccurranceElement(ints));

  }
}