package jobsheet8;
import java.util.Scanner;

public class PenilaianKelompopk28 {

    public static void main(String[] args) {
        // Objek Scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in); 
        
        int i = 1; // Inisialisasi variabel counter untuk kelompok (outer loop)

        // Variabel yang dibutuhkan
        int totalNilai;
        int nilai;
        double rataNilai;
        
        // Outer loop (Perulangan Kelompok)
        while (i <= 6) {
            // Menampilkan nama kelompok saat ini
            System.out.println("\nKelompok " + i); 
            
            totalNilai = 0; // Reset total nilai untuk kelompok baru
            
            // Inner loop (Perulangan Penilai)
            // Mengambil 5 nilai dari penilai 1 sampai 5
            for (int j = 1; j <= 5; j++) {
                // Meminta input nilai dari setiap penilai
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
                // Asumsi variabel 'nilai' sudah dideklarasikan sebelumnya (misal: int nilai;)
                nilai = sc.nextInt();
                
                // Menambahkan nilai ke totalNilai
                totalNilai += nilai; 
            }
            
            // Menghitung rata-rata nilai (gunakan 5.0 atau casting agar hasilnya double)
            rataNilai = (double) totalNilai / 5;
            
            // Menampilkan hasil untuk kelompok saat ini
            System.out.println("Total Nilai Kelompok " + i + " adalah: " + totalNilai);
            System.out.println("Rata-rata Nilai Kelompok " + i + " adalah: " + rataNilai);
            
            // Increment counter kelompok (move to the next group)
            i++; 
        }
        
        // Tutup scanner setelah selesai
        sc.close();
        System.out.println("\nProses penilaian selesai.");
    }
}