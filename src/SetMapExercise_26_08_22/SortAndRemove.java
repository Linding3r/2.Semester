package SetMapExercise_26_08_22;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortAndRemove {

  public static TreeSet<Integer> sortAndRemoveDuplicates(List<Integer> list) {
    return new TreeSet<>(list);
  }

  public static int countUnique(List<Integer> list){
    return new TreeSet<>(list).size();
  }

  public static void main(String[] args) {
    Integer[] shitList = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
    List<Integer> numbers = new LinkedList<>(List.of(shitList));
    System.out.println(sortAndRemoveDuplicates(numbers));

    System.out.println(countUnique(numbers));
  }
}
