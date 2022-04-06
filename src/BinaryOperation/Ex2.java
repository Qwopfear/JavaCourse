package BinaryOperation;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println(convertToSystem(i));

    }

    static String convertToSystem(int i){
        String s = "";

        while (i != 0){
            s = (i&1) + s;
            i =   i << 1;
        }
        return s;
    }
}
