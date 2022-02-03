package StringExercise.Simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        String s = "Object-oriented programming is a programming language model organized around objects rather " +
            "than \"actions\" and data rather than logic. " +
            "Object-oriented programming blabla." +
            " Object-oriented programming bla. "+ "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. " +
                " Object-oriented programming bla. "+ "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla." +
                " Object-oriented programming bla. "+ "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. " + " But not Object-oriented programming." +
                " Object-oriented programming bla. " + "Object-oriented programming is really cool" +
                "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla." +
                " Object-oriented programming bla. "+ "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. " +
                " Object-oriented programming bla. "+ "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla." +
                " Object-oriented programming bla. "+ "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. " +
                " Object-oriented programming bla. " + "Object-oriented programming is really cool.";

        System.out.println(oopSwap(s));
    }


    public static String oopSwap(String s){
        int patternCounter = 0;
        String[] words = s.trim().split("[.]");
        StringBuilder sb = new StringBuilder();
        for (String s1 :words
             ) {
            patternCounter++;
            if (patternCounter % 2 == 0){
              sb.append(s1.replace("Object-oriented programming", "OOP")).append(".\n");
            }else {
                sb.append(s1).append(".\n");

            }
        }
        return String.valueOf(sb);
    }

}
