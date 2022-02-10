package Streams;

import java.util.Arrays;

public class Ex3ForEach {
    public static void main(String[] args) {
        int[] ints = {7,3,11,9,57};

//        Arrays.stream(ints).forEach(el -> {el = el * 2;
//            System.out.println(el);});

        Arrays.stream(ints).forEach(Utils::myMethod);
    }
}

class Utils{
    static public void myMethod(int i){
        i += i * 2;
        System.out.println("Element = " + i);
    }
}