package jobsheet9;  
import java.util.Scanner;

public class KafeOrderManager28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. INPUT: Jumlah Pesanan
        System.out.print("Masukkan jumlah jenis pesanan yang akan diinput: ");
        int jumlahPesanan = sc.nextInt();
        
        // Membersihkan buffer setelah nextInt()
        sc.nextLine(); 

        // PROSES: Deklarasi dua array satu dimensi
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalBiaya = 0;

        System.out.println("--- Masukkan Detail Pesanan ---");
        
        // Loop untuk input nama dan harga setiap pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1) + ":");
            
            // Input Nama Pesanan
            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            // Input Harga Pesanan
            System.out.print("Harga (contoh: 15000): ");
            hargaPesanan[i] = sc.nextDouble();
            
            // Membersihkan buffer setelah nextDouble()
            sc.nextLine(); 
            
            // PROSES: Hitung total biaya
            totalBiaya += hargaPesanan[i];
        }
        
        // --- OUTPUT: Daftar Pesanan dan Total Biaya ---
        System.out.println("\n========================================");
        System.out.println("          DAFTAR PESANAN KAFE           ");
        System.out.println("========================================");
        
        // Tampilkan semua pesanan yang telah dimasukkan
        for (int i = 0; i < jumlahPesanan; i++) {
            // Menggunakan format printf untuk tampilan harga yang rapi
            System.out.printf("%d. %-25s Rp %.0f\n", 
                               (i + 1), 
                               namaPesanan[i], 
                               hargaPesanan[i]);
        }
        
        System.out.println("----------------------------------------");
        
        // Tampilkan Total Biaya
        System.out.printf("TOTAL BIAYA KESELURUHAN: Rp %.0f\n", totalBiaya);
        System.out.println("========================================");

        sc.close();
    }
}