package BinaryOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 2022_01_21
public class PPJ27 {

    public static void main(String[] args) {

        int a = 10;										// 1010 (bin)			// 10 (dec)
        int b = 11;										// 1011					// 11

        System.out.println(a & b);						//  1010				// 10
        System.out.println(a | b);						//  1011				// 11
        System.out.println(a ^ b);						// 	   1				// 1
        System.out.println(a >> 1);						//   101				// 5
        System.out.println(a << 1);						// 10100				// 20


        int c = -2;
        System.out.println(Integer.toBinaryString(c));			// 11111111111111111111111111111110			// -2

        System.out.println(~c);    								// 00000000000000000000000000000001			// 1

        System.out.println(c >> 1);								// 11111111111111111111111111111111			// -1
        System.out.println(c >>> 1);							// 01111111111111111111111111111111 		// 2147483647


//		bits(127);


		/*
		 	//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html

					[abc]
					[a|b|c]
					[0-9] 			\d
					[a-zA-Z0-9]		\w
					\p{L}
					\s
					.	\.
					[^abc]
					\D
					\W

					a{2}
					b{2,}
					c{2,3}
					a*
					a+
					a?
					(ab)*

					(...)|(...)|(...)

					((...)...(...)...)...(...)	m.group(...)
		*/

//			String input = "aa999c";	//"aa99baa999cdeaa999cf";
//			String regex = "a{2}9{3}c";
//
//			System.out.println(Pattern.matches(regex, input));
//
//			Pattern pattern = Pattern.compile(regex);
//			Matcher matcher = pattern.matcher(input);
//
//			boolean check = matcher.matches();
//			System.out.println(check);
//
//			//matcher.reset();
//
//			//mat.find();
//			//mat.group();
//
//			while (matcher.find()) {
//				System.out.println(matcher.group());
//				//System.out.println(mat.start());
//				//System.out.println(mat.end());
//			}

    }

    static void bits(int n) {

        String res = "";

        for (int i = 0; i < 32 ; i++) {
            res = (n&1) + res;
            n = n>>1;
        }

        System.out.println(res);
    }
}
