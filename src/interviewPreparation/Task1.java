package interviewPreparation;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(bracketStr("recede"));
        System.out.println(bracketStr("average"));
        System.out.println(bracketStr("agro"));
        System.out.println(bracketStr("aaaaaaaaaaaab"));
        System.out.println(bracketStr("Aruchimaru"));
    }


//    If the letter is repeated, it is replaced by the character ')' ,
//    if the letter occurs only once, it is replaced by the character '(' .
//    Case is ignored;.

    static String bracketStr(String s){
        String strBracket = "";

        char[] chars = s.toLowerCase(Locale.ROOT).toCharArray();
//        byte[] equals = new byte[chars.length];



        boolean lastEl = false;
        for (int i = chars.length -2; i >= 0; i--) {
            if (chars[chars.length - 1] == chars[i]){
                System.out.println(chars[chars.length -1] + " " + chars[i]);
                lastEl = true;
            }
        }

        if (lastEl){
            chars[chars.length - 1] = ')';
        }else {
            chars[chars.length -1] = '(';
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ')'){
                for (int j = 0; j < chars.length; j++) {
                  if (chars[i] == chars[j] && i != j){
                      chars[i] = ')';
                      chars[j] = ')';
                  }
                }
            }
        }
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] != ')'){
                chars[i] = '(';
            }
        }

        for (char c: chars
             ) {
            strBracket += c;
        }

        return  strBracket;
    }
}
