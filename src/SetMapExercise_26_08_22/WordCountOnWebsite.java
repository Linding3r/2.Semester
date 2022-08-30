package SetMapExercise_26_08_22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class WordCountOnWebsite {

    public static HashMap<String, Integer> readURLlookFor(ArrayList<String> words) throws Exception{
      HashMap<String, Integer> temp = new HashMap<>();

      for (String s:words){
       temp.put(s,0);
      }
      URL connection = new URL("https://dr.dk/");
      BufferedReader reader = new BufferedReader(new InputStreamReader(connection.openStream()));

      String input = "";

      while (input != null){

        for (String word:words) {
          if(input.contains(word)){
            temp.put(word,temp.get(word)+1);
          }
        }
        input = reader.readLine();
      }
      reader.close();


      return temp;
    }


  public static void main(String[] args) throws Exception{

    ArrayList<String> words = new ArrayList<>();

    words.add("Breaking");
    words.add("Ukraine");
    words.add("Putin");
    words.add("USA");
    words.add("Sex");

    System.out.println(readURLlookFor(words));
  }
}

