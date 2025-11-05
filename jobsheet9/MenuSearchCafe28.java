package jobsheet9;
import java.util.Scanner;
public class MenuSearchCafe28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar Menu dan Harga (Array satu dimensi terpisah)
        String[] menu = {"Nasi Goreng Spesial", "Mie Ayam Bakso", "Capcay Kuah", "Es Teh Manis", "Kopi Susu Dingin"};
        double[] harga = {25000, 20000, 28000, 7000, 12000};
        
        int indeksDitemukan = -1; // -1 menandakan makanan belum ditemukan

        // --- Tampilkan Menu ---
        System.out.println("================================");
        System.out.println("          MENU KAFE             ");
        System.out.println("================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-20s (Rp %.0f)\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("--------------------------------");

        // --- Input Pencarian ---
        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String keySearch = sc.nextLine();

        // --- Proses: Linear Search ---
        for (int i = 0; i < menu.length; i++) {
            // Menggunakan equalsIgnoreCase agar pencarian tidak sensitif huruf besar/kecil
            if (keySearch.equalsIgnoreCase(menu[i])) {
                indeksDitemukan = i; // Simpan indeks saat item ditemukan
                break; // Hentikan pencarian segera (efisiensi)
            }
        }

        // --- Output Hasil Pencarian ---
        System.out.println("\n=== HASIL PENCARIAN ===");
        if (indeksDitemukan != -1) {
            System.out.println("✅ " + keySearch + " **TERSEDIA!**");
            System.out.printf("   Harga: Rp %.0f\n", harga[indeksDitemukan]);
        } else {
            System.out.println("❌ Maaf, " + keySearch + " **TIDAK TERSEDIA** di menu kami.");
        }
        System.out.println("=======================");

        sc.close();
    }
}