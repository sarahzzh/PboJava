/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class PerbandinganNilai {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger ("batasAtas");
        if (variabel1< batasBawah){
            System.out.println("variabel1 ="+ variabel1 + "Kurang dari batas bawah yang bernilai" + batasBawah);
        }
        if ((variabel1 < batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("variabel1 =" + variabel1 +"kurang dari variabel2 yang bernilai"+batasBawah+ "dan kurang dari variabel3 juga yang bernilai:"+ batasAtas);
        }
        if (variabel1 <= batasBawah||variabel1 >= batasAtas){
            System.out.println("variabel 1 nilainya tidak berada di antara variabel 2 dan variabel 3");
        }
        if (variabel1 >= batasBawah && variabel1 <= batasAtas){
            System.out.println("Variabel1 berada di antara nilai variabel2 dan variabel3");
        }
    }
    static int inputNilaiInteger(String namaVariabel){
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silahkan input nilai untuk variabel" + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }
}
