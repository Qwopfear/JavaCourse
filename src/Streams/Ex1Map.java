package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Predicate");
        list.add("Supplier");
        list.add("Consumer");
        list.add("Function");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length()));
//        }

        // 9 8 8 8
        List<Integer> list2 =  list.stream().map(el -> el.length()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);


        int[] ints = {1,3,5,7,9,11,15};
        int[] ints1 = Arrays.stream(ints).map(el
                -> {
            if (el % 3 == 0){
               el = el / 3;
            }
            return el;
        }).toArray();

//        System.out.println(Arrays.toString(ints1));


        Set<String> set = new TreeSet<>();
        set.add("Predicate");
        set.add("Supplier");
        set.add("Consumer");
        set.add("Function");
        System.out.println(set);


        Set<Integer> set2 =  list.stream().map(el -> el.length()).collect(Collectors.toSet());

        System.out.println(set2);



    }
}
