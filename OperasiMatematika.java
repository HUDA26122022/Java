package latihan1;

import java.util.Scanner;
public class OperasiMatematika {
    public static void main (String[] args){
        //operasi matematika sederhana
        int a = 10 ;
        int b = 2 ;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //augmanted assignments
        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);
      
        
        // unary operator
        int d = 100;
        int e = -10;

        d++;//ditambah satu
        System.out.println(d);

        e--; //dikurang 1
        System.out.println(e);

        System.out.println(!true);
     




    }
}
