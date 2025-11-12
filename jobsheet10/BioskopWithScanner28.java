package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int menu;
        
        do {
            System.out.println("\n--- Menu Aplikasi Bioskop ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            
            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka (1, 2, atau 3).");
                sc.nextLine(); 
                menu = 0;
                continue;
            }

            switch (menu) {
                case 1:
                    inputDataPenonton(sc, penonton);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton); 
                    break;
                case 3:
                    System.out.println("Terima kasih. Aplikasi ditutup.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak ditemukan. Silakan coba lagi.");
            }
        } while (menu != 3);
        
        sc.close();
    }

    public static void inputDataPenonton(Scanner sc, String[][] penonton) {
        String nama, next;
        int baris, kolom;
        boolean inputSelesai = false;

        System.out.println("\n--- Input Data ---");
        while (!inputSelesai) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            
            boolean kursiValid = false;
            while (!kursiValid) {
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine(); 
                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("⚠️ Error: Nomor baris atau kolom TIDAK TERSEDIA. Silakan masukkan ulang.");
                    continue; 
                }

                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("⚠️ WARNING: Kursi Baris " + baris + " Kursi " + kolom + " SUDAH TERISI oleh " + penonton[baris - 1][kolom - 1] + ".");
                    System.out.println("Silakan masukkan baris dan kolom lain.");
                    continue; 
                }
                
                kursiValid = true;

                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data berhasil disimpan pada Baris " + baris + " Kursi " + kolom + ".");
            }

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                inputSelesai = true;
            }
        }
    }
    public static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("\n--- Daftar Penonton di Bioskop ---");
        
        for (int i = 0; i < penonton.length; i++) {
            StringBuilder barisOutput = new StringBuilder("Baris " + (i + 1) + ": ");
            
            for (int j = 0; j < penonton[i].length; j++) {
        
                if (penonton[i][j] == null) {
                    barisOutput.append("***"); 
                } else {
                    barisOutput.append(penonton[i][j]); 
                }
                
               
                if (j < penonton[i].length - 1) {
                    barisOutput.append(", ");
                }
            }
            System.out.println(barisOutput.toString());
        }
    }
}