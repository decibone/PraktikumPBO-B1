/*
 * Nama: Laurentius Lucky Andriawan Bagaskara
 * NIM: 24060122130100
 * Deskripsi; Implementasi lambda pada map
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {

    public static void main(String[] args) {

        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122130100", "Adi");
        mahasiswaMap.put("24060122130101", "Bambang");
        mahasiswaMap.put("24060122130102", "Cici");
        mahasiswaMap.put("24060122130103", "Didi");

    
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}