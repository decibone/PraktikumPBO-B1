/* Nama: Laurentius Lucky Andriawan Bagaskara
 * NIM: 24060122130100
 * Lab B1
 */

public class KontrolSenjata{
private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }
    public void isiPeluru(int peluru){
        this.senjata.setPeluru(peluru);
        System.out.println(">> Peluru berhasil ditambah: "+ peluru);
    }
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak "+ jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (this.senjata.getPeluru() > 0){
                System.out.println(this.senjata.getBunyi());
                this.senjata.setPeluru(this.senjata.getPeluru()-1);
            }
            else{
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru Sisa: " + this.senjata.getPeluru());
    } 
    public String menusuk(){
        if (this.senjata.isMenusuk()== false){
            return "Senjata tidak bisa menusuk";
        }
        else {
            return "Senjata bisa menusuk";
        }
    }
    public void pasangBayonet(){
        this.senjata.setMenusuk(false);
        System.out.println("Senjata dipasang bayonet agar dapat menusuk");
    }
}
