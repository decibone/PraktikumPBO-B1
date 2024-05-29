/*
 * Nama: Laurentius Lucky A.B
 * NIM: 24060122130100
 * Lab: B1
 */

 public class Truck extends Vehicle {
    double maxLoad;
    
    Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    double calcFuelEfficiency() {
        return 0; 
    }

    @Override
    double calcTripDistance() {
        return 0;
    }

    @Override
    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }
}

