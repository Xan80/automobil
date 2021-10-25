package com.company;

public class Avtomobil {
    String marka;
    String model;
    int il;
    int deyer;

    public Avtomobil(String marka, String model, int il, int deyer) {
        this.marka = marka;
        this.model = model;
        this.il = il;
        this.deyer = deyer;
    }

       public void infoAvtomobil(){
           System.out.println("Avtomobilin markasi : " + marka);
           System.out.println("Avtomobilin modeli : " + model);
           System.out.println("Avtomobilin ili : " + il);
           System.out.println("Avtomobilin deyeri : " + deyer);

       }
         public void infoAvtoSpecifika(){
             System.out.println(" 100 km.sureti 8 saniyeye yigir ");
             System.out.println(" 4*4 xusuiyyeti vardir ");
             System.out.println(" peykden izleme vardir ");
             System.out.println(" euro 5 dir ");

         }




}
