package StringExercise.Simplest;

import java.util.Locale;

public class Ex1 {
    public static void main(String[] args) {
       String s = "Hello Java";
        lastChar(s);
        end(s);
        start(s);
        contains(s);
        aAndOSwap(s);
        System.out.println(s.toLowerCase(Locale.ROOT));
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.substring(6));
    }

    static public void str(String s){
        System.out.println(s);
    }
    static public void lastChar(String s){
        System.out.println(s.charAt(s.length() - 1));
    }
    static public void end(String s){
        System.out.println(s.endsWith("!!!"));
    }
    static public void start(String s){
        System.out.println(s.startsWith("Hello"));
    }
    static public void contains(String s){
        System.out.println(s.contains("ava"));
    }
    static public void aAndOSwap(String s){
        System.out.println(s.replaceAll("a","o"));
    }




}
