package LinkedList_25_08_22;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void removeInRange(List<Integer> list,Integer value, int start, int end){
        Iterator<Integer> intList = list.iterator();
        for (int i = 0; i < start; i++) {
            intList.next();
        }
        for (int i = start; i < end; i++) {
            if(intList.next()==value){
                intList.remove();
            }
        }
    }

    public static void partition(List<Integer> list, int e){
        List<Integer> listFinal = new LinkedList<>();
        Iterator<Integer> intList = list.iterator();
        while(intList.hasNext()) {
            Integer temp = intList.next();
            if(temp<e){
                listFinal.add(0,temp);
            } else listFinal.add(temp);
        }
        list.clear();
        list.addAll(listFinal);
    }


    public static void main(String[] args) {

        Integer[] rangeInt ={0,0,2,0,4,0,6,0,8,0,10,0,12,0,14,0,16};
        List<Integer> rangeList = new LinkedList<>(List.of(rangeInt));
        removeInRange(rangeList, 0,5,13);
        System.out.println(rangeList);

        Integer[] shitList ={15,1,6,12,-3,4,8,21,2,30,-1,9};
        List<Integer> testList = new LinkedList<>(List.of(shitList));
        partition(testList, 5);
        System.out.println(testList);


    }
}
