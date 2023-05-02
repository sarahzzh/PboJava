/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kelasutama;

import java.util.Scanner;
import javafx.scene.effect.ImageInput;

/**
 *
 * @author C-15
 */
public class SelamatUlangTahun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama depan :");
        String namaDepan = input.nextLine();
        System.out.println("Masukkan nama belakang");
        String namaBelakang = input.nextLine();
        String pesanUcapan = SelamatUlangTahun(namaDepan,namaBelakang);
        System.out.println(pesanUcapan);   
    }
    public static String SelamatUlangTahun(String namaDepan, String namaBelakang){
        Scanner input = new Scanner(System.in);
        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println("Masukkan Umur :");
        int umur = input.nextInt();
        
        return "saudara" +" " +namaLengkap+" " + "Berumur"+" "+ umur+ " " + "Semoga Panjang Umur";
    }
}
