package StringExercise.Simple;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println(middleChars("Yourmine"));
    }

    public static String middleChars(String s){
        if (s.length() % 2 != 0){
            return "This method accept only stings with even length";
        }else {
            return s.substring(s.length()/ 2 - 1, s.length() / 2 + 1);
        }
    }
}
