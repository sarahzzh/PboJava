/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan8;

/**
 *
 * @author C-15
 */
 class Mobil1 {
        private String merk;
        private int tahun;
        private String model;
        private String warna;
        
        public Mobil1(String merk, int tahun, String model, String warna) {
            this.merk = merk;
            this.model = model;
            this.tahun = tahun;
            this.warna = warna;
        }
        
        void displayInfo () {
            System.out.println("Mobil: " + merk);
            System.out.println("Model mobilnya: "+ model);
            System.out.println("Tahun :" + tahun);
            System.out.println("Warna :" + warna);
        }
    }
    
public class PenjualanMobil1 {

    public static void main(String[] args) {
        Mobil1 mobil = new Mobil1("Toyota", 2022,"camry","Merah");
        mobil.displayInfo();
    }
}
