package StringExercise.SimpleRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

        public static void main(String[] args) {

            Pattern pattern = Pattern.compile("c{1,3}ab");
            Matcher matcher = pattern.matcher("aaab");
            boolean b = matcher.matches();
            System.out.println(b);

            System.out.println(test("google.com"));
            System.out.println(test("reference1.ua"));
            System.out.println(test("reference1.org"));
        }

        public static boolean test(String testString) {
            Pattern pattern = Pattern.compile(".+\\.[a-z]{1,5}");
            Matcher matcher = pattern.matcher(testString);
            return matcher.matches();

    }
}
