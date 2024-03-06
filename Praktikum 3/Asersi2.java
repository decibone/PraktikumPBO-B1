/**
 * File = Asersi2.java
 * Deskripsi : Program penggunaan exception, menolak jari-jari = 0
 * Nama/Nim: Laurentius Lucky/24060122130100
 */
//Class lingkaran

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class  asersi2

public class Asersi2{
    public static void main(String[] args){
        double jariJari =  -2;
        assert(jariJari!=0):"Jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran ="
            +kelilingLingkaran);
    }
}

//Jawaban
//Ada kesalahan pada assert, jika jari-jari tidak boleh nol maka asersi seharusnya (jariJari != 0)