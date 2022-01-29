package RegEx;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
            String s = "Jan III Sobieski herbu Janina (ur. 17 sierpnia 1629" +
        " w Olesku, zm. 17 czerwca 1696 w Wilanowie) – król Polski i wielki " +
        "książę litewski od 1674, hetman wielki koronny od 1668, hetman polny koronny od " +
        "1666, marszałek wielki koronny od 1665, chorąży wielki koronny od 1656.";
//
//        System.out.println(amountOfWords(s));
//        System.out.println(amountOfDates(s));
//        System.out.println(amountOfYears(s));

        System.out.println(encode("recede"));
        System.out.println(makeComplement("TAACG"));
        System.out.println(bmi(57,1.80));

    }

    static int amountOfWords(String s){
        Pattern p = Pattern.compile("[a-z].[^\\r]");
        Matcher m = p.matcher(s);
        int i = 0;
        while (m.find()){
            System.out.println(m.group());
            i++;
        }

        return i;
    }

    static int amountOfDates(String s){
        Pattern p = Pattern.compile("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}S");
        Matcher m = p.matcher(s);

        Pattern p1 = Pattern.compile("[0-9]{1,2} \\D+ [0-9]{4}");
        Matcher m2 = p1.matcher(s);
        int i = 0;
        while (m.find()){
            i++;
        }
        while (m2.find()){
            i++;
            System.out.println(m2.group());
        }

        return i;
    }

    static int amountOfYears(String s){
        Pattern p = Pattern.compile("[0-9]{4}");
        Matcher m = p.matcher(s);

        int i = 0;
        while (m.find()){
            i++;

        }


        return i;
    }


    static String encode(String word){
        char [] chars = word.toCharArray();
        String nWord = " ";
        for(int i = 0;i < (chars.length);i++){
            boolean eq = false;
            for(int j = i + 1;j < chars.length;j++){
                if (chars[i] == chars[j]) {
                    eq = true;
                    break;
                }
            }
            if(eq){
                nWord+=")";
            }else{
                nWord+="(";
            }
        }
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[chars.length - 1] == chars[i]){
                nWord.replace('(',')');
            }
        }
        return nWord;
    }

    public static String makeComplement(String dna) {
        char[] c = dna.toCharArray();
        String nDna = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'A'){
                c[i] = 'T';
            }else if(c[i] == 'T'){
                c[i] = 'A';
            }else if(c[i] == 'C'){
                c[i] = 'G';
            }else if(c[i] == 'G'){
                c[i] = 'C';
            }

            nDna += c[i];

        }

        return nDna;

    }


    public static String remove(String str) {

        String s1 = str.substring(0,1) + str.substring(str.length()-2,str.length() -1) ;
        return  s1;
    }



    public static String bmi(double w, double h) {
        double bmi = w / (h*h);

        if(bmi <= 30){
            if(bmi <= 25){
                if(bmi <= 18){
                    return "Underweight";
                }
                return "Normal";
            }
            return "Overweight";
        }

        return "Obese";
    }



}
