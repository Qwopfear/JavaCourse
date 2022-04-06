package interviewPreparation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiamondForDiamond {
    public static String printDiamond(int n){
        return IntStream.range(0,n * 2)
                .filter(i -> i % 2 > 0)
                .map(i -> i > n ? n - (i - n) : i)
                .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i) + "\n")
                .collect(Collectors.joining());
    }
    public static String pigIt(String str) {

        String[] s = str.split(" ");

        List<String> ls = Arrays.stream(s).
                        filter(el -> {return el.length() > 1;}).
                        map(el -> {
                           StringBuilder sb = new StringBuilder(el);
                           sb.append(" ");
                           char i = el.charAt(0);
                           String sub = el.substring(1,el.length());
                           el = el.replaceAll(String.valueOf(i),sub);
                           el = el.substring(0,sub.length());
                           el += i + "ay";
//                           el = String.valueOf(sb);
                           return el;
                        }).
                        collect(Collectors.toList());
        String sol = "";
        for (String s1: ls) {
            sol+= ls + " ";
        }

        return sol;
    }
}
