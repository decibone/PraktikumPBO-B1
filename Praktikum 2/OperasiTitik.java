// File: OperasiTitik.java
// Nama/NIM: Laurentius Lucky/24060122130100
// Hari/tanggal: Selasa, 5 Maret 2024

class OperasiTitik {
    //Deklarasi method

    private void refleksiSumbuX(Titik titik){
        titik.setOrdinat(-titik.getOrdinat());
    }
    private void refleksiSumbuY(Titik titik){
        titik.setAbsis(-titik.getAbsis());
    }
    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }
    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
