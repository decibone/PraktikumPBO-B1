/**
 * File = PrismaSegitiga.java
 * Deskripsi : Tugas praktikum 2
 * Nama/Nim: Laurentius Lucky/24060122130100
 */

class PrismaSegitiga {

    //Deklarasi atribut
    private Segitiga alas;
    private double tinggiPrisma;

    // Deklarasi konstruktor
    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    // Deklarasi method
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    public double hitungLuasPermukaan() {
        return (2 * alas.hitungLuas()) + (alas.getAlas() * tinggiPrisma * 3);
    }
}