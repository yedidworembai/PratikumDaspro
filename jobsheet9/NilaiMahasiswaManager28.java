package jobsheet9;
import java.util.Scanner;

public class NilaiMahasiswaManager28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Memasukkan banyaknya nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();

        // Deklarasi array untuk menyimpan nilai
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        
        System.out.println("--- Mulai Input Nilai ---");
        
        // 2. Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        // Inisialisasi awal untuk nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        // 3. Menghitung nilai tertinggi dan terendah
        for (int nilai : nilaiMhs) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        // 4. Menghitung nilai rata-rata
        double rataRata = total / jumlahMahasiswa;

        // --- Tampilan Hasil ---
        System.out.println("\n==================================");
        System.out.println("          RINGKASAN NILAI         ");
        System.out.println("==================================");

        // 5. Menampilkan semua nilai yang telah dimasukkan
        System.out.print("Semua Nilai yang dimasukkan: [");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print(nilaiMhs[i]);
            if (i < nilaiMhs.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("----------------------------------");
        
        // Menampilkan hasil perhitungan
        System.out.printf("Nilai Rata-rata Mahasiswa: %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi          : " + nilaiTertinggi);
        System.out.println("Nilai Terendah           : " + nilaiTerendah);
        System.out.println("==================================");

        sc.close();
    }
}