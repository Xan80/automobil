package com.company;

public class Audi extends Avtomobil {
   // String audiKeyfiyyeti;
    public Audi(String marka, String model, int il, int deyer) {
        super(marka, model, il, deyer);
        // this.audiKeyfiyyeti=audiKeyfiyyeti;
    }

    public void buyAudi(){
        System.out.println("Audi alicisina 2 illik servis hediyye");
    }
}

