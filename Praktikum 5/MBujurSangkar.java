/*
 * Nama file: MBujurSangkar.java
 * Nama/Nim: Laurentius Lucky Andriawan/ 24060122130100
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
        scan.close();
    }
}

/*
 * apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi
metode abstrak yang ada pada kelas BangunDatar ? jelaskan !

Jawaban: Program tidak akan bisa di-run karena ada syarat yang menyatakan bahwa 
suatu subclass harus mengimplementasi semua metode abstrak yang telah didefinisikan di dalam suatu superclass abstrak
 */