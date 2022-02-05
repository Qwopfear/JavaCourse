package StringExercise.SimpleRegEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        String s = "Если есть хвосты по дз, начните с  не сданного задания. 123 324 111 4554\"";

        System.out.println(palindromeNums(s));
    }

    static String palindromeNums(String s){
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(s);
        ArrayList<String> palindromes = new ArrayList<>();
        while (m.find()){
            if (isPalindrome(m.group())){
                palindromes.add(m.group());
            }
        }
        return palindromes.toString();
    }

    static boolean isPalindrome(String s){
        boolean isPalindrome = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
