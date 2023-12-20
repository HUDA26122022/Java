package latihan1;

public class variabel {
    public static void main (String[] args){
        //dilakukan secara tidak langsung
        String name;
        name = "ahmad";

        //dilakukan secara langsung
        int angka = 30;
        String negara = "indonesia";

        //dibuat dua kali
        name = "huda";
       
        //penggunaan var (dimana secara otomatis bisa langsung membaca tip
        // datanya dan untuk var sendiri dalam pengisian valuenya harus langsung 
        //jadi tidak boleh tidak langsung akan menyebabkan error pada kode)

        var huruf = 'a';
        var nama = "ahmad mulia huda";
        var fullName = huruf + " " + nama;

        //penggunaan final (untuk penggunaan final jadi value selanjutnya dnegan nama variabel yang sama tidak bisa di gantikan lagi)
        final String Ahmad;
        Ahmad = "ahmad mulia huda";

        //tampilkan
        System.out.println(name);
        System.out.println(angka);
        System.out.println(negara);
        System.out.println(fullName);
        System.out.println(Ahmad);
    }
    
}
