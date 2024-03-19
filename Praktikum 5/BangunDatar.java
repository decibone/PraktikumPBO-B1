/*
 * Nama file: BangunDatar.java
 * Nama/Nim: Laurentius Lucky Andriawan/ 24060122130100
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
