/*
 * Nama: Laurentius Lucky Andriawan Bagaskara
 * NIM: 24060122130100
 * Deskripsi; Implementasi lambda pada list
 */

import java.util.ArrayList;

public class LambdaList {

    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama) -> System.out.println(nama));

    }
}