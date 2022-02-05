package StringExercise.SimpleRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        String s = "One two three раз два три one1 two2 123";
        System.out.println(lath(s));
    }

    static String lath(String s){
        Pattern p = Pattern.compile("[A-z]+ ");
        Matcher m = p.matcher(s);
        int onlyLathSym = 0;
        while (m.find()){
            onlyLathSym++;
            System.out.println(m.group());
        }
        return  "Amount of: " + onlyLathSym;
    }

}
