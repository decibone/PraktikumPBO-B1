package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukunonFiksi extends Buku{
    //Deklarasi atribut

    protected String subjek;
    protected int jumlahHalaman;
    protected float harga;

    //Deklarasi method

    public String getSubjek(){
        return subjek;
    }
    public int getjumlahHalaman(){
        return jumlahHalaman;
    }
    public float getHarga(){
        return harga;
    }
    public void setSubjek(String subjek){
        this.subjek = subjek;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void view(){
        System.out.println("Judul buku: '"+this.getJudul()+"'");
        System.out.println("Penulis: '"+this.getPenulis()+"'");
        System.out.println("Tahun terbit: "+this.getTahunTerbit());
        System.out.println("Genre: '"+this.getSubjek()+"'");
        System.out.println("Jumlah halaman: "+this.getjumlahHalaman());
        System.out.println("Harga:"+this.getHarga());
    }
}
