package latihan1;

import java.util.Scanner;

public class OperasiBoolean {
public static void main(String[] args) {
    int nilaiabsen;
    int nilaiuas;

    Scanner N = new Scanner(System.in);
    System.out.print("masukan nilai absen :"); 
    nilaiabsen=N.nextInt();
    System.out.print("masukan nilai uas :");
    nilaiuas=N.nextInt(); 

    boolean lulusabsen = nilaiabsen >= 75;
    boolean lulusnilaiuas = nilaiuas >= 80;
    
    var lulus = lulusabsen || lulusnilaiuas;
    
    if (lulus){
        System.out.println("lulus");
    }else {
        System.out.println("tidak lulus");
    }
}
}
