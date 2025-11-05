package jobsheet9;

import java.util.Scanner;

public class SearchNilai28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input banyaknya elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlElemen = sc.nextInt();

        // Deklarasi array dengan ukuran yang diinput pengguna
        int[] arrNilai = new int[jmlElemen];

        // 2. Input isi array
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        
        // 3. Input nilai yang ingin dicari (key)
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Variabel hasil. Diinisialisasi dengan -1 (nilai yang menunjukkan "tidak ditemukan")
        int hasil = -1; 

        // Proses Pencarian
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Simpan indeks saat nilai ditemukan
                break;     // Hentikan perulangan (lebih efisien)
            }
        }

        // 4. Cetak hasil pencarian
        System.out.println(); // Baris kosong

        if (hasil != -1) {
            // Karena indeks dimulai dari 0, posisi mahasiswa adalah indeks + 1
            int posisiMahasiswa = hasil + 1; 
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + posisiMahasiswa);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }
        
        sc.close();
    }
}