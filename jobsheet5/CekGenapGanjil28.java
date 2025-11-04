import java.util.Scanner;

public class CekGenapGanjil28 {

    public static void main(String[] args) {
        // 1. Deklarasi dan Inisialisasi (int angka)
        Scanner sc = new Scanner(System.in);
        int angka;

        // 2. Input (input angka)
        System.out.println("--- Program Pengecek Angka Genap/Ganjil ---");
        System.out.print("Masukkan sebuah angka integer: ");
        angka = sc.nextInt();

        // 3. Pemilihan (angka % 2 == 0) menggunakan IF-ELSE
        if (angka % 2 == 0) {
            // Jalur "Ya" (Kondisi BENAR: Angka habis dibagi 2)
            System.out.println("Angka " + angka + " adalah: Genap");
        } else {
            // Jalur "Tidak" (Kondisi SALAH: Angka tidak habis dibagi 2)
            System.out.println("Angka " + angka + " adalah: Ganjil");
        }

        // 4. Akhir Program (End)
        sc.close();
    }
}