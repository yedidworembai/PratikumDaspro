package jobsheet10;
import java.util.Scanner;

public class Siakad28 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int[][] nilai = new int[4][3];
          for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai siswa ke-" + (i + 1) + ":");

            for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < nilai.length; i++) {
             System.out.println("Input nilai mahasiswa ke-" + (i + 1) );
            double totalPerSiswa = 0; 
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
            nilai[i][j] = sc.nextInt();
            totalPerSiswa += nilai[i][j];
            }
            
            System.out.printf("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / 3 + "\n");
        }

        
        System.out.println("\n=================================================");
        System.out.println("=== Hasil Rata-Rata Nilai Setiap Mata Kuliah ===");
        
       
        for (int j = 0; j < 3; j++) {
           
            double totalPerMatkul = 0;
            
          
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            System.out.printf("Mata Kuliah"+ (1+j) + ": "+ totalPerMatkul / 4);
        }
        
        sc.close();
    }
}