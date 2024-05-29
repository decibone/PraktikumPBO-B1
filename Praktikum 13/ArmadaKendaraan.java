/*
 * Nama: Laurentius Lucky A.B
 * NIM: 24060122130100
 * Lab: B1
 */

 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.List;

 

 class ArmadaKendaraan {
    private List<Vehicle> armada;

    public ArmadaKendaraan() {
        armada = new ArrayList<>();
    }

    public <T extends Vehicle> void tambahArmada(Collection<T> armadaBaru) {
        armada.addAll(armadaBaru);
    }

    public int getJumlahArmada() {
        return armada.size();
    }
}
