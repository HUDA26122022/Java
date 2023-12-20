package latihan1;

public class TipeDataPrimitif {
    public static void main (String[] args){
        //penggunaan data bukan primitif

        Byte IniByte = null;
        Integer Iniint = 10;

        //memunculkan suatu hasil
        System.out.println(Iniint);
        System.out.println(IniByte);

        Byte IniByte2;
        IniByte2 = 100 ;

        System.out.println(IniByte2);

        //konversi dari data primitid ke bukan primitif

        byte iniByte3 = 100;
        Byte iniByte4 = iniByte3 ;
        
        
        //pengkonversian ke bentuk primitif untuk carannya tinggal tambahkan method di belakang variabel yang di konversikan
        short IniShort = iniByte4.shortValue();
        long IniLong = iniByte4.longValue();








    }
}
