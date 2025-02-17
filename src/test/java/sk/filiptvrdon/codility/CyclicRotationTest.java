package sk.filiptvrdon.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {

  CyclicRotation cyclicRotation;

  @BeforeEach
  void setUp() {
    cyclicRotation = new CyclicRotation();
  }

  @Test
  void turn3() {
    int[] startArr = {3, 8, 9, 7, 6};
    int[] endArr = {9, 7, 6, 3, 8};

    assertArrayEquals(endArr, cyclicRotation.rotateArray(startArr, 3));
  }

  @Test
  void turnZeroes() {
    int[] startArr = {0,0,0};
    int[] endArr = {0,0,0};

    assertArrayEquals(endArr, cyclicRotation.rotateArray(startArr, 3));
  }

  @Test
  void turnAround() {
    int[] startArr = {1, 2, 3, 4};
     int[] endArr = {1, 2, 3, 4};

    assertArrayEquals(endArr, cyclicRotation.rotateArray(startArr, 4));
  }

}