/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strukturkontrol;

import java.util.Scanner;

/**
 *
 * @author C-15
 */
public class LatihanSatu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        int age;
        System.out.println("How old are You?");
        
        age = keyboard.nextInt();
        System.out.println("You are: ");
        
        if (age < 13) {
            System.out.println("\ttoo young to create a Facebook account");
        }
        if (age < 16){
            System.out.println("\ttoo young to get a driver's license");
        }
        if (age <= 18){
            System.out.println("\ttoo young to marry someone");
        }
        if (age < 35){
            System.out.println("\ttoo young to run for president RI");
            System.out.println("\t\t(How Sad!)");
        }
        if (age >= 50){
            System.out.println("Anda sudah setengah baya, hati - hati dengan kuliner");
        }
    }
}
