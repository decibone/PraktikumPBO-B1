/* Nama: Laurentius Lucky Andriawan Bagaskara
 * NIM: 24060122130100
 * Lab B1
 */
public class Senjata {

    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }

    public String getBunyi(){
        return this.bunyi;
    }
    public void setBunyi(String bunyi){
        this.bunyi= bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public boolean isMenusuk(){
        return this.menusuk;
    }
}