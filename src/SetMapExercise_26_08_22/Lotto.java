package SetMapExercise_26_08_22;

import java.util.*;

public class Lotto {

  public static final int MAX_NUMBERS = 7;
  public static final int EXTRA_NUMBERS = 2;
  public static final int TOTAL_NUMBERS = 49;
  public static final int TOTAL_EX_NUMBERS = 20;


  public static Set<Integer> drawRandomNumbers(){
    Random r = new Random();
    Set<Integer> newList = new TreeSet<>();
    while(newList.size()<MAX_NUMBERS) {
      newList.add(r.nextInt(TOTAL_NUMBERS)+1);
    }
    return newList;
  }

  public static Set<Integer> drawExtraNumbers(Set<Integer> ticket){
    Random r = new Random();
    Set<Integer> newList = new TreeSet<>();
    while(newList.size()<EXTRA_NUMBERS) {
      int temp = r.nextInt(TOTAL_EX_NUMBERS)+1;
      if(!ticket.contains(temp)){
        newList.add(temp);
      }
    }
    return newList;
  }

  public static void main(String[] args) {

    Set<Integer> lottoTicket = new TreeSet<>();
    Set<Integer> extraNumbers = new TreeSet<>();

    Set<Integer> winningNumbers = new TreeSet<>();
    Set<Integer> winningEXNumbers = new TreeSet<>();

    lottoTicket.addAll(drawRandomNumbers());
    extraNumbers.addAll(drawExtraNumbers(lottoTicket));
    System.out.println(lottoTicket);
    System.out.println(extraNumbers);

    winningNumbers.addAll(drawRandomNumbers());
    winningEXNumbers.addAll(drawExtraNumbers(winningNumbers));

    System.out.println(winningNumbers);
    System.out.println(winningEXNumbers);

    Set<Integer> temp1 = new TreeSet<>();
    Set<Integer> temp2 = new TreeSet<>();

    temp1.addAll(lottoTicket);
    temp2.addAll(extraNumbers);

    temp1.retainAll(winningNumbers);
    temp2.retainAll(winningEXNumbers);

    System.out.println("Number og winning numbers: " + temp1.size() + " | Numbers are: " + temp1);
    System.out.println("Number og winning Extra numbers: " + temp2.size() + " | Numbers are: " + temp2);



  }
}
