package jobsheet10;
import java.util.Scanner;

public class Siakad28 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Sistem Informasi Akademik Dinamis ===");
        
        System.out.print("Masukkan jumlah siswa (baris): ");
        int JUMLAH_SISWA = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah (kolom): ");
        int JUMLAH_MATA_KULIAH = sc.nextInt();
        
       
        int[][] nilai = new int[JUMLAH_SISWA][JUMLAH_MATA_KULIAH];
        
        System.out.println("\n--- Input Nilai Siswa ---");
        for (int i = 0; i < nilai.length; i++) { // Iterasi untuk siswa
            System.out.println("\nInput nilai siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < nilai[i].length; j++) { // Iterasi untuk mata kuliah
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
        }
        

        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0; 
            
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            
            
            double rataRataSiswa = totalPerSiswa / JUMLAH_MATA_KULIAH;
            
            System.out.printf("Rata-rata nilai siswa ke-%d: %.2f\n", (i + 1), rataRataSiswa);
        }
        System.out.println("\n=============================================");
        System.out.println("=== Hasil Rata-Rata Nilai Setiap Mata Kuliah ===");
        
        for (int j = 0; j < JUMLAH_MATA_KULIAH; j++) { 
            double totalPerMatkul = 0;
            
            for (int i = 0; i < JUMLAH_SISWA; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            
           
            double rataRataMatkul = totalPerMatkul / JUMLAH_SISWA;
            
            System.out.printf("Mata Kuliah ke-%d : %.2f\n", (j + 1), rataRataMatkul);
        }
        
        sc.close();
    }
}