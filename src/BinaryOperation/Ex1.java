package BinaryOperation;

public class Ex1 {
    public static void main(String[] args) {
//        System.out.println(binarySwap(127));

        System.out.println(showBin(127));
        int x = 128&1;
        System.out.println(x);

    }

    static int binarySwap(int i){
        String s = "";
        int l = i;
        while(i / 2 > 0){
            i = i /2;
            if (i % 2 == 0){
                s += 0;
            }else {
                s += 1;
            }

        }
        if (l % 2 == 0){
            s = 0 + s;
        }else {
            s = 1 + s;
        }

        return Integer.parseInt(s);
    }

    static String showBin(int i){
        String s = "";

        while (i != 0){
            s = (i&2) + s;
            i =   i << 2;
        }
        return s;
    }


}
