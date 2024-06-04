/*
 * Nama: Laurentius Lucky Andriawan Bagaskara
 * NIM: 24060122130100
 * Deskripsi; Ekspresi lambda dasar untuk menghitung diskon
 */

interface IDiskon{
    public  double  hitungDiskon (int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
    IDiskon diskonMerdeka = new IDiskon() {
        public double hitungDiskon(int harga){
            return harga - (harga * 0.3);
        }
    };

    IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
    IDiskon diskonBiasa = (harga) -> {
        return harga - (harga * 0.1);
    };

    System.out.println("Diskon merdeka: "+diskonMerdeka.hitungDiskon(45000));
    System.out.println("Diskon lebaran: "+diskonLebaran.hitungDiskon(45000));
    System.out.println("Diskon biasa: "+diskonBiasa.hitungDiskon(45000));
}
}

/*
 * Dapatkah anda membedakan antara bagamana
diskonLebaran dan diskonBiasa diimplementasikan ?

Perbedaan cara mengimplementasikan diskonLebaran dan diskonBiasa adalah cara penulisannya.
Meski memiliki tujuan yang sama, diskon lebaran langsung ditulis dalam satu baris,
sedangkan diskon biasa menggunakan kurung kurawal dan menggunakan keluaran eksplisit menggunakan return.
 */
