class Titik {
    // Deklarasi atribut

    double absis;
    double ordinat;
    static int counterTitik;

    //Deklarasi konstruktor

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double newAbsis, double newOrdinat){
        absis = newAbsis;
        ordinat = newOrdinat;
        counterTitik++;
    }

    //Deklarasi method

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double b){
        ordinat = b;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
}

