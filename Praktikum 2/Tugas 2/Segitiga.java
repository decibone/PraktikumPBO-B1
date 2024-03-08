/**
 * File = Segitiga.java
 * Deskripsi : Tugas praktikum 2
 * Nama/Nim: Laurentius Lucky/24060122130100
 */

public class Segitiga {
    //Deklarasi atribut

    private double alas;
    private double tinggi;

    //Deklarasi konstruktor
    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Deklarasi method

    public double getAlas(){
        return alas;
    }
    public double getTinggiSegitiga(){
        return tinggi;
    }
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
}
