/**
 * File = angkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'
 * Nama/Nim: Laurentius Lucky/24060122130100
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!");
        }
}
}
/**Jawaban
 * 1. Saat eksepsi terjadi, baris 12 tidak dieksekusi.
 * 2. Baris 21 dieksekusi, karena terjadi sebuah error pada baris 18, mencoba memasukkkan angka 13
*/

