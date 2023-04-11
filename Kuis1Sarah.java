/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz1;

import java.util.Scanner;

/**
 *
 * @author C-10
 */
public class Kuis1Sarah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai variabel 1 : ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai variabel 2: ");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("Jumlah variabel 1 + varibel 2 adalah : " + c);
        System.out.println("Dikerjakan oleh Sarah Azizah (22201087)");
    }
}
