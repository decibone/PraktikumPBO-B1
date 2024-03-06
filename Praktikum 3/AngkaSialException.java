/**
 * File = AngkaSialException.java
 * Deskripsi : Program penggunaan exception buatan sendiri, menolak masukan angka 13
 * Nama/Nim: Laurentius Lucky/24060122130100
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memaasukkan angka 13 karena 13 angka sial!");
    }
}
