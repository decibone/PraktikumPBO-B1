package bk.buku;

public class Buku{
    //Deklarasi atribut

    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    //Deklarasi method

    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public String getTahunTerbit(){
        return tahunTerbit;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void view(){}
}