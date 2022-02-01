package interviewPreparation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Medium1 {

    // every word in String s contain number
    // replace words in String according to numbers
    public static void main(String[] args) {
        String  s = "is2 w5e  go3od 4but thi1s";

        System.out.println(stringEnum(s));
    }

    static String stringEnum(String s){
        String[] str;

        int amountOfWords = 0;
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(s);
        while (m.find()){
            amountOfWords++;

        }
        str = new String[amountOfWords];
        if (!m.find()){
            amountOfWords = 0;
        }

        Matcher m2 = p.matcher(s);
        while (m2.find()){
            str[amountOfWords] = m2.group();
            amountOfWords++;
        }


        String[] str2 = new String[amountOfWords];

        Pattern p1 = Pattern.compile("[0-9]");
        String tmp;
        for (int i = 0; i < str.length; i++) {
            Matcher m1 = p1.matcher(str[i]);
//            System.out.println(str[i] + " in matcher");
            if (m1.find() && (i != Integer.parseInt(m1.group()))){
                int j = Integer.parseInt(m1.group()) - 1;
                str2[j] = str[i];
            }
        }

        String fs = "";
        for (String s1: str2) {
            fs += s1 + " ";
        }

        return  fs;
    }
}
