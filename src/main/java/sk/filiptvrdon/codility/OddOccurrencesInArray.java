package sk.filiptvrdon.codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

  public int findSingleOccurranceElement(Integer[] array) {
    Set<Integer> set = new HashSet<>();

    for (Integer integer : array) {
      if (set.contains(integer)) {
        set.remove(integer);
      } else {
        set.add(integer);
      }
    }
    return (int) set.toArray()[0];
  }


}
