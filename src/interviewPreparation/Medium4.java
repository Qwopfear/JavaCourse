package interviewPreparation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Medium4 {
//    Complete the solution so that it splits the string into pairs of two characters.
//    If the string contains an odd number of characters then it should replace
//    the missing second character of the final pair with an underscore ('_').
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sol("ashdkajsdhkjadshx")));
    }

    static String[] sol(String s){
        char[] newS = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(newS.length + " " + i + " " + s.length());
            sb.append(newS[i]);
            if (i % 2 != 0 && i + 1 != s.length()){
                sb.append(",");
            }
            if (i + 1 == s.length() && s.length() % 2 != 0){
                sb.append("_");
            }
        }
        String[] ta = String.valueOf(sb).split(",");


        return ta;
    }
}
