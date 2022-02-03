package StringExercise.Simple;

public class Ex1 {
    public static void main(String[] args) {
        String s = (mathException(10,3));
        System.out.println(s);
//        System.out.println(equalSwap(s));
        System.out.println(equalReplace(s));
    }

    public static String mathException(int a, int b){
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a+b);
        sb.append('\n');
        sb.append(a).append(" * ").append(b).append(" = ").append(a*b);
        sb.append('\n');
        sb.append(a).append(" - ").append(b).append(" = ").append(a-b);
        return String.valueOf(sb);
    }

    public static String equalSwap(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = s.indexOf("=");
        System.out.println(i);
        while (i != -1){
            sb.deleteCharAt(i);
            sb.insert(i, " equal ");
            i = sb.indexOf("=");
        }
        return String.valueOf(sb);
    }


    public static String equalReplace(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = s.indexOf("=");
//        System.out.println(i);
        while (i != -1){
           sb.replace(i,i+1," equal ");
            i = sb.indexOf("=");
        }
        return String.valueOf(sb);
    }

}
