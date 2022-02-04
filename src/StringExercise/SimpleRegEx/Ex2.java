package StringExercise.SimpleRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        String s = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern p = Pattern.compile("[A-z]{4}( {1,3})[1-9]{1,2}");
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
