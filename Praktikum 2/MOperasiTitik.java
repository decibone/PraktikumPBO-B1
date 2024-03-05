// File: MOperasiTitik.java
// Nama/NIM: Laurentius Lucky/24060122130100
// Hari/tanggal: Selasa, 5 Maret 2024

class MOperasiTitik {
    public static void main(String[] args){
        Titik t = new Titik(4, 4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("titik(" + t.getAbsis() + "," + t.getOrdinat() + ")");

        System.out.println("titik hasil refleksi X: (" + o.refleksiX(t).getOrdinat() + ")");

        System.out.println("titik hasil refleksi Y: (" + o.refleksiY(t).getAbsis() + ")");

    }
}
