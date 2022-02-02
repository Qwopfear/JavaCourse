package interviewPreparation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Medium1 {

    // every word in String s contain number
    // replace words in String according to numbers
    public static void main(String[] args) {
        String  s = "is2 w5e go3od 4but thi1s";

        System.out.println(stringEnum(s.trim()));
    }

    static String stringEnum(String s){
        System.out.println(s);
        String[] str = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            for (String value : str) {
                if (value.indexOf((char) (i + 1 + '0')) != -1) {
                    System.out.println(value.indexOf((i + 1 + '0')));
                    result.append(value).append(" ");
//                    System.out.println(result);

                }
            }
        }
        return  String.valueOf(result);
    }
}
