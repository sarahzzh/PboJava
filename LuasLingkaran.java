/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kelasutama;

import java.util.Scanner;

/**
 *
 * @author C-15
 */
public class LuasLingkaran {
    public static void main(String[] args) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Masukkan nilai jari-jari");
            int x = inputScanner.nextInt();
            int hasil = (x*x)/7*22;
            System.out.println("Luas Lingkaran adalah "+ hasil);
    }
}
