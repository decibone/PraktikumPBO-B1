package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku {
    //Deklarasi atribut

    protected String genre;
    protected int jumlahHalaman;
    protected float harga;

    //Deklarasi method

    public String getGenre(){
        return genre;
    }
    public int getjumlahHalaman(){
        return jumlahHalaman;
    }
    public float getHarga(){
        return harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void view(){
        System.out.println("Judul buku: '"+this.getJudul()+"'");
        System.out.println("Penulis: '"+this.getPenulis()+"'");
        System.out.println("Tahun terbit: "+this.getTahunTerbit());
        System.out.println("Genre '"+this.getGenre()+"'");
        System.out.println("Jumlah halaman: "+this.getjumlahHalaman());
        System.out.println("Harga:"+this.getHarga());
    }
    }
