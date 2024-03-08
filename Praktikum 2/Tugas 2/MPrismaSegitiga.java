/**
 * File = MPrismaSegitiga.java
 * Deskripsi : Tugas praktikum 2
 * Nama/Nim: Laurentius Lucky/24060122130100
 */

 public class MPrismaSegitiga {
    public static void main(String[] args) {

        // Instansiasi objek
        Segitiga segitiga = new Segitiga(3, 4);
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(segitiga, 5);

        // Menghitung volume dam luas permmukaan prisma
        double volume = prismaSegitiga.hitungVolume();
        double luasPermukaan = prismaSegitiga.hitungLuasPermukaan();

        System.out.println("Volume prisma segitiga adalah: " + volume);
        System.out.println("Luas permukaan prisma segitiga adalah: " + luasPermukaan);
    }
}
