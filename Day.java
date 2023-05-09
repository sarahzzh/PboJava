

import java.util.Scanner;

/**
 *
 * @author C-15
 */
public class Day {
    public static void main(String[] args) {
        int day = inputNilaiInteger("Day");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Masukkan inputan dari angka 1-7, mohon coba lagi");
        }
    }
    static int inputNilaiInteger(String namaVariabel) {
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Masukkan Inputan" + " " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    } 
}
