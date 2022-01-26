package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRecur {
    public static void main(String[] args) {
//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\w+"); // 1 match is matches before incongruity

        String s1 = "Hey abcd Usevalad MyHouse ";
        Pattern pattern1 =  Pattern.compile("\\w{3}"); // 1 match is matches {amountSymbols}


        Matcher matcher = pattern1.matcher(s1); // looking for matches with a template
        while (matcher.find()){
            System.out.println("Position : " + matcher.start() + "  " + matcher.group()  );
        }
    }
}
