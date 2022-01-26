package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExBasic {
    public static void main(String[] args) {

//        String s1 = "AQOR A1QR ";
//        Pattern pattern1 =  Pattern.compile("A[A-Z]OR"); // boilerplate

//        String s1 = "ABCD ABCE ABDDFA ";
//        Pattern pattern1 =  Pattern.compile("ABC");

//        String s1 = "ABFDFGDFGOP ";
//        Pattern pattern1 =  Pattern.compile("AB[C-F]OP"); [SofScope - EndOfScope]

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("abc[^e-g4-7]");  ^ same as !=

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 =  Pattern.compile("abc(e|5)"); OR

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("abc."); . == every symbol

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("^abc"); //  ^ -> begin of string  (same or not)

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("bcg6$"); // end of string <- $ (same or not)

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\d"); // every number or "_"

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\D"); // every NaN

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\D"); // every NaN also " "

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\w"); // every letter, number or "_"  [A-Za-z0-9_]

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\W"); // excludes \\w (" " for example)

//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\w\\s+\\w"); // \\s white space [/t/n/r/f]
//
//        String s1 = "abcd abce abc5abcg6";
//        Pattern pattern1 =  Pattern.compile("\\D{0,3}"); // {0,} from 0 to inf {2.} from 2 to inf {3,5} from 3 to 5

//        String s1 = "ABCDCDDABABSDW";
//        Pattern pattern1 =  Pattern.compile("(CD){2,3}"); // (CD) -> expression , have to repeat from 2 to 3 times

//        String s1 = "ABCDCDDABABSDWCDDD";
//        Pattern pattern1 =  Pattern.compile("CD "); // mean next C and couple  D (2 or 3)

        // ? -> 0 or 1 repeat -> {0,1}
        // * -> 0 or more repeats -> {0,}
        // + -> 0 or more repeats -> {1,}
        // {n} -> n  repeats
        // {n,} -> n  or more repeats
        // {n,m} -> from n to m repeats

//        String s1 = "ABCDCDDABABSDWCDDD";
//        Pattern pattern1 =  Pattern.compile("\\AABC"); // \\A Expression of begin of String
//        String s1 = "ABCDCDDABABSDWCDDD";
//        Pattern pattern1 =  Pattern.compile("CDDD\\Z"); // \\Z Expression of begin of String

        String s1 = "abcd abce abc5abcg6";
        Pattern pattern1 =  Pattern.compile("[abcd][ghfg3-8]"); // Common example




        Matcher matcher = pattern1.matcher(s1); // looking for matches with a template
        while (matcher.find()){
           System.out.println("Position : " + matcher.start() + "  " + matcher.group()  );
       }

    }
}
