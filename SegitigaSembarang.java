/**
 * Program untuk menghitung panjang sisi segitiga sembarang menggunakan rumus Hukum Cosinus.
 * Program ini meminta input panjang dua sisi dan sudut antara kedua sisi segitiga,
 * kemudian menghitung panjang sisi yang ketiga.
 */
import java.util.Scanner;

public class SegitigaSembarang {

    /**
     * Menghitung panjang sisi segitiga sembarang menggunakan Hukum Cosinus.
     * @param a panjang sisi pertama
     * @param b panjang sisi kedua
     * @param sudut sudut antara kedua sisi dalam derajat
     * @return panjang sisi ketiga segitiga
     */
    public static double hitungPanjangSisi(double a, double b, double sudut) {
        // Menghitung sudut dalam radian karena fungsi Math.cos membutuhkan radian
        double sudutRadian = Math.toRadians(sudut);
        
        // Menggunakan rumus Hukum Cosinus: c^2 = a^2 + b^2 - 2ab * cos(sudut)
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(sudutRadian));
        return c;
    }

    /**
     * Fungsi utama yang akan meminta input dari pengguna dan menampilkan hasil perhitungan.
     * @param args argumen dari command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi-sisi segitiga dan sudut
        System.out.print("Masukkan panjang sisi pertama (a): ");
        double a = input.nextDouble();

        System.out.print("Masukkan panjang sisi kedua (b): ");
        double b = input.nextDouble();

        System.out.print("Masukkan sudut antara kedua sisi (dalam derajat): ");
        double sudut = input.nextDouble();

        // Menghitung panjang sisi ketiga
        double panjangSisiKetiga = hitungPanjangSisi(a, b, sudut);

        // Menampilkan hasil perhitungan
        System.out.println("Panjang sisi ketiga segitiga adalah: " + panjangSisiKetiga);
    }
}
