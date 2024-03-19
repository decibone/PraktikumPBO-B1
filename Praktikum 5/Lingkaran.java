/*
 * Nama file: Lingkaran.java
 * Nama/Nim: Laurentius Lucky Andriawan/ 24060122130100
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;
    
    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
