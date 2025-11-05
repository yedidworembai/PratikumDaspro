package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai28 {

    public static void main(String[] args) {
        // Deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi array untuk 10 nilai mahasiswa
        int[] nilaiMhs = new int[10]; 
        
        // Variabel untuk total nilai, rata-rata, dan jumlah yang lulus
        double total = 0;
        double rata2;
        int lulus = 0; 

        // Loop untuk menerima input nilai dari 10 mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            // Menghitung total nilai
            total = total + nilaiMhs[i];
            
            // Pengecekan kelulusan (nilai > 70)
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        
        // Menghitung rata-rata keseluruhan
        rata2 = total / nilaiMhs.length;
        
        // Menampilkan hasil
        System.out.println("----------------------------------------");
        System.out.println("Rata-rata nilai mahasiswa adalah :" + rata2);
        System.out.println("Jumlah mahasiswa yang lulus :" + lulus);
        System.out.println("----------------------------------------");
        
        // Menutup Scanner
        sc.close();
    }
}