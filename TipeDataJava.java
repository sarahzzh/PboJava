/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tipedata;

/**
 *
 * @author C-15
 */
public class TipeDataJava {
    public static void main(String[] args) {
        //Tipe Data Numerik
        byte variabelTipeByte = 10;
        short variabelTipeShort = 20;
        int variabelTipeInteger = 30;
        long variabelTipeLong = 40L;
        float variableTipeFloat = 3.14f;
        double variabelTipeDouble = 3.1415;
        
        //Tipe Data Karakter
        char variabelTipeChar ='A';
        
        //Tipe Data Boolean
        boolean variabelTipeDataBoolean = true;
        
        // Mencetak variabel ke console
        System.out.println("Tipe Data Numerik");
        System.out.println("Byte: " + variabelTipeByte);
        System.out.println("Short: " + variabelTipeShort);
        System.out.println("integer: " + variabelTipeInteger);
        System.out.println("Long: " + variabelTipeLong);
        System.out.println("Float: " + variableTipeFloat);
        System.out.println("Double " + variabelTipeDouble);
        
        System.out.println("\nTipe Data Karakter");
        System.out.println("Char: " + variabelTipeChar);
        
        System.out.println("\nTipe Data Boolean");
        System.out.println("Boolean: " + variabelTipeDataBoolean);
    }
}
