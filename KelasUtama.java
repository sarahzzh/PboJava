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
public class KelasUtama {
    public static void main(String[] args) {
        int varInteger;
        sayHello();
        sayHelloTo("Budi");
        String namaMahasiswa = "george";
        
        sayHelloTo(namaMahasiswa);
        
        varInteger = inpuNilaiInteger("Var integer");
        System.out.println("Nilai varInteger Sekarang = " + varInteger);      
    }
    
    static void sayHello(){
        System.out.println("Hello, ini dari metode bertipe void, tanpa parameter");
    }
    
    static void sayHelloTo (String nama){
        System.out.println("hello"+ nama + ", Metode bertipe void, dengan parameter");
    }
    static int inpuNilaiInteger ( String namaVariabel){
        Scanner inputScanner = new Scanner (System.in);
        int nilaiInput;
        System.out.println("Silahkan input nilai untuk variabel" + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }

}
