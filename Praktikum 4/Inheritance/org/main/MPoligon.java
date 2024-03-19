package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        persegiPanjang persegi = new persegiPanjang(10, 10, 4);
        Segitiga segitiga1 = new Segitiga(5, 10, 3)
        persegi.printInfo();
        segitiga1.printInfo();
        System.out.println("Luas segitiga: "+segitiga1.hitungLuas());
        System.out.println("Luas persegi panjang: "+persegi.hitungLuas());
    }
}
