/*
 * Nama: Laurentius Lucky A.B
 * NIM: 24060122130100
 * Lab: B1
 */

 import java.util.ArrayList;
 import java.util.List;


 public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck(1000);
        System.out.println(truck);

        SeaPlane sPlane = new SeaPlane(500);
        System.out.println(sPlane);

        Helicopter copter = new Helicopter(300);
        System.out.println(copter);

        System.out.println("##############################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(new Truck(1500));
        armadaTruck.add(new Truck(2000));
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(new Helicopter(400));
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        System.out.println("##############################################");

        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getJumlahArmada());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getJumlahArmada());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getJumlahArmada());
    }
    }

