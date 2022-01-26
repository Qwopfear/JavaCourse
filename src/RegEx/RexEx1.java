package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexEx1 {
    public static void main(String[] args) {
        String s =
                "Take Shekel, Israel, Tel Aviv, shalom street 22, flat 99 " +
                        "email: EasyMoney@money.com. Phone: +123312123 "+
                        "Petrov Ivan, Moscow,Vodka street 161, flat 228 "+
                        "email: RusForRusy@bnazi.com. Phone: +114882223 "+
                        "Jo Piter, Hollywood,Cinema street 25, flat 69 "+
                        "email: Merika@bucks.com. Phone: +123333123847 ";

//        Pattern allWords = Pattern.compile("\\w+");
//        Matcher m1 = allWords.matcher(s);
//
//        while (m1.find()){
//            System.out.print(m1.group() + " ");
//        }


//        Pattern phoneNumbers = Pattern.compile("\\+[0-9]+");
//        Matcher m2 = phoneNumbers.matcher(s);
//
//        while (m2.find()){
//            System.out.print(m2.group() + " ");
//        }

//
//        Pattern houseNumbers2 = Pattern.compile("\\b\\d{2}\\b");// \\b - word boundary; \\B same as other Big Letter
//        Matcher m3 = houseNumbers2.matcher(s);

//        while (m3.find()){
//            System.out.print(m3.group() + " ");
//        }

        Pattern emails = Pattern.compile("\\w+@\\w+\\.(com|ru)");
        Matcher m3 = emails.matcher(s);

        while (m3.find()){
            System.out.print(m3.group() + " ");
        }

    }
}
