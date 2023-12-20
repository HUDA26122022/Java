package latihan1;
import java.util.Scanner;
public class OperasiMatematika2 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int nialiAwal;
        int nilaiAkhir;
        int hasil;
        int hasil2;

        System.out.print("masukan nilai pertama :");
        nialiAwal=sc.nextInt();
        System.out.print("masukan nilai akhir :");
        nilaiAkhir=sc.nextInt();

        hasil = nialiAwal + nilaiAkhir;
        System.out.println(hasil);

        hasil2 = hasil - nilaiAkhir;
        System.out.println(hasil2);

    }
}
