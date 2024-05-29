/*
 * Nama: Laurentius Lucky A.B
 * NIM: 24060122130100
 * Lab: B1
 */

 public class Helicopter extends Vehicle implements IFlyer {
    double maxLoad;

    Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    double calcFuelEfficiency() {
        return 0; // implementasi sesuai kebutuhan
    }

    @Override
    double calcTripDistance() {
        return 0; // implementasi sesuai kebutuhan
    }

    @Override
    public void takeOff() {
        // implementasi sesuai kebutuhan
    }

    @Override
    public void land() {
        // implementasi sesuai kebutuhan
    }

    @Override
    public void fly() {
        // implementasi sesuai kebutuhan
    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
