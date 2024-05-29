/*
 * Nama: Laurentius Lucky A.B
 * NIM: 24060122130100
 * Lab: B1
 */

 class SeaPlane extends Vehicle implements IFlyer {
    double maxLoad;

    SeaPlane(double maxLoad) {
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
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
