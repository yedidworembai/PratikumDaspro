package jobsheet9;

import java.util.Scanner;

public class ArrayNilai28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        // Loop untuk 10 mahasiswa
        for (int i = 0; i < nilaiAkhir.length; i++) {
            
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
           nilaiAkhir[i] = sc.nextInt(); 

            // Pengecekan kondisi kelulusan
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " LULUS");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " TIDAK LULUS");
            }

            // Menampilkan nilai yang sudah dimasukkan
            System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " adalah: " + nilaiAkhir[i]);
            System.out.println("------------------------------"); // Pemisah antar mahasiswa
        }

        sc.close();
    }
}
