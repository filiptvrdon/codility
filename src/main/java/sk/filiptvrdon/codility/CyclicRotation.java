package sk.filiptvrdon.codility;

import java.util.Arrays;

public class CyclicRotation {


  public int[] rotateArray(int[] array, int rotations) {
    System.out.println("original array: " + Arrays.toString(array));

    while (rotations > 0) {
      array = rotateOnePosition(array);
      System.out.println("rotated array: " + Arrays.toString(array));
      rotations--;
    }

    return array;
  }

  private static int[] rotateOnePosition(int[] array) {
    int[] newArray = new int[array.length];
    newArray[0] = array[array.length - 1];
    for (int i = 1; i < array.length; i++) {
      newArray[i] = array[i - 1];
    }
    return newArray;
  }

}
