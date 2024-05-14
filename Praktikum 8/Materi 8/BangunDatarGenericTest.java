public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new  BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran: "+bdg.hitungKeliling());
        System.out.println("tipe generic: "+bdg.get().getClass().getName());
    }
}

// 'T dalam file BangunDatarGenerik diganti dengan T1, tidak ada perubahan pada hasil saat program di-run, kesimpulannya, T hanyalah sebagai placeholder yang bisa diganti sesukanya'