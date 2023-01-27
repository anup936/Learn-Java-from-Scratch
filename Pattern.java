import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        // for (int line = 1; line <= 5; line++) {
        // for (int star = 1; star <= line; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // out ofabovecode is
        // *
        // **
        // ***
        // ****
        // *****

        // new question pattern

        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= n-line + 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // output
        /*
         *****
         ****
         ***
         **
         *
         */

        // next question of patterns in numbers
        // for (int line = 1; line <= n; line++) {
        // for (int num = 1; num <= line; num++) {
        // System.out.print(num);
        // }
        // System.out.println();
        // }
        // out put
        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */

        // new question printing patterns of character
        // char ch = 'A';
        // for (int line = 1; line <= n; line++) {
        // for (int chars = 1; chars <= line; chars++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        /*
         * output
         * A
         * BC
         * DEF
         * GHIJ
         * KLMNO
         * PQRSTU
         * VWXYZ[\
         */

        // for (int i = 0; i <= n; i++) {
        // for (int star = 2 * (n - i); star >= 0; star--) {
        // System.out.print(" ");
        // }
        // for (int star = 0; star <= i; star++) {
        // // printing stars
        // System.out.print("* ");
        // }

        // // ending line after each row
        // System.out.println();
        // }
        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        // new question
        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= n-line + 1; star++) {
        // System.out.print( star);
        // }
        // System.out.println();
        // }
        // output
        // 12345
        // 1234
        // 123
        // 12
        // 1
        

        //new qestion
        // int k = 0;
        // for (int line = 1; line <= n; line++) {
        //     for (int num = 1; num <= line; num++) {
        //         System.out.print(k + 1);
        //         k = k + 1;
        //     }
        //     System.out.println();
        // }
        //output
        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15

    }
}
