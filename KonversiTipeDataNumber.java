package latihan1;

public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        //tipe data konversi 
          //byte -> short -> int -> long -> float -> double (bisa dilakukan secara otomatis)
          byte IniByte = 25;
          short IniShort = IniByte;
          int IniInt = IniShort;
          long IniLong = IniInt;
          float IniFloat = IniLong;
          double IniDouble = IniFloat;

          
          // double -> float -> long -> int -> short -> byte (harus dilakukan secara manual untuk pengkonversiannya)
          float IniFloat2 = (float) IniDouble;
          long IniLong2 = (long) IniFloat2;
          int IniInt2 = (int) IniLong2;
          short IniShort2 = (short) IniInt2;
          byte Inibyte = (byte) IniShort2;



          
    }
}
