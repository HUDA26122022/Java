package latihan1;

public class Array {
    public static void main(String[] args) {
        String[] ArrayString;
        ArrayString = new String[3];
        ArrayString[0] = "ahmad";
        ArrayString[1] = "mulia";
        ArrayString[2] = "huda";
    
        System.out.println(ArrayString[0]);
    
        //cara penulisan array ke dua
        int[] ArrayInt = new int[]{
            19, 4, 2004
        };
    
        System.out.println(ArrayInt[1]);
        //cara penulisan array ke tiga
        byte[] ArrayByte = {
            19, 4, 4
        };
        System.out.println(ArrayByte[1]);
    
        //array dalam array
        String[][] ArrayString2 = {
            {"ahmad","mulia","huda"},
            {"daud"}
        };
    
        System.out.println(ArrayString2[0][1]);
    
    }
}
