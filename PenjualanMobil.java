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

    class Mobil {
        String warna;
        int kecepatan;
        String model;
        int harga;
        
        public Mobil(String warna, int kecepatan, String model, int harga) {
            this.warna = warna;
            this.kecepatan = kecepatan;
            this.model = model;
            this.harga = harga;
        }
        
        public void maju () {
            System.out.println("Mobil berjalan maju.");
        }
        
        public void mundur () {
            System.out.println("Mobil berjalan Mundur.");
        }
        
        void getInfoMobil () {
            System.out.println("Mobil ini berwarna: " + this.warna);
            System.out.println("Modelnya adalah:" + this.model);
            System.out.println("Harganya adalah:" +this.harga);
            System.out.println("Kecepatan tertinggi: " + this.kecepatan);
        }
    }
    
public class PenjualanMobil {

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Merah", 250, "Toyota Prius", 700000);
        mobil.getInfoMobil();
        mobil.maju();
    }
}
