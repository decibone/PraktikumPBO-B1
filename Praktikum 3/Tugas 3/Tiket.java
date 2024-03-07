/**
 * File = Tiket.java
 * Deskripsi : Tugas praktikum 3
 * Nama/Nim: Laurentius Lucky/24060122130100
 */

 public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
 		// Asumsi jumlah tiket yang tersedia (boleh diganti)
     int tiketTersedia = 100;

    assert jumlahTiket > 0: "Tiket harus lebih dari 0";

   	assert jumlahTiket <= tiketTersedia: "Jumlah tiket melebihi tiket yang tersedia";

   	System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

	public static void isEWallet(int EWallet) {

 		assert EWallet >= 1 && EWallet <= 4: "E-wallet tidak sesuai index";

        assert !getEWallet(EWallet).isEmpty() : "E-Wallet tidak ditemukan";

     System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
       		return "OVO";
			case 2:
       		return "GoPay";
			case 3:
       		return "DANA";
			case 4:
       		return "LinkAja";
			default:
       		return "";
		}
	}
}
