/*
 * Nama: Laurentius Lucky A.B
 * NIM: 24060122130100
 * Lab: B1
 */

 abstract class Vehicle {
    abstract double calcFuelEfficiency();
    abstract double calcTripDistance();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
