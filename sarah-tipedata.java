/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplikasi;

import java.util.Scanner;


/**
 *
 * @author C-15
 */
public class JavaAplikasi1 {
    public static void main(String[] args) {
        int nilaiA = 10;
        System.out.println("nilai a :" + nilaiA);
        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan ganti nilai a!");
        nilaiA = input.nextInt();
        System.out.println("nilai a telah diganti : " + nilaiA);
        int nilaiB = 20;
        System.out.println("nilai b :" + nilaiB);
        nilaiB = input.nextInt();
        System.out.println("nilai b telah diganti : " + nilaiB);
        double kelinci = 90.5;
        System.out.println("Nilai :" + kelinci);
        kelinci = input.nextDouble();
        System.out.println("nilai kelinci telah diganti : " + kelinci);
        double rusa = 90.2;
        System.out.println("Nilai :" + rusa);
        rusa = input.nextDouble();
        System.out.println("nilai rusa telah diganti : " + rusa);
        boolean isPlus;
        isPlus = true;
        System.out.println("is plus :" + isPlus);
        isPlus = input.nextBoolean();
        System.out.println("nilai isplus telah diganti : " + isPlus);
  
    }
    
}
