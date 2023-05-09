
import java.util.Scanner;
/**
 *
 * @author C-15
 */
public class IfElse {

    public static void main(String[] args) {
        int people = inputNilaiInteger("people");
        int cars = inputNilaiInteger("car");
        int buses = inputNilaiInteger("bus");

        if (cars > people) {
            System.out.println("Kita Harus Mengambil Mobil");
        } else if (cars < people) {
            System.out.println("Kita tidak butuh mobil");
        } else {
            System.out.println("Kita tidak bisa memutuskan");
        }
        if (buses > cars) {
            System.out.println("itu terlalu banyak bus");
        } else if (buses < cars) {
            System.out.println("Mungkin kita bisa bus");
        } else {
            System.out.println("Kita tetap tidak bisa memutuskan");
        }
        if (people > buses) {
            System.out.println("Okey, ayo kita naik bus");
        } else {
            System.out.println("oke, ayo kita tetap berada di rumah");
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
