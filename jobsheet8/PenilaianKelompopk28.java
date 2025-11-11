package jobsheet8;
import java.util.Scanner;

public class PenilaianKelompopk28 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
        
        int i = 1;

       
        int totalNilai;
        int nilai;
        double rataNilai;
        
       
        while (i <= 6) {
               System.out.println("\nKelompok " + i); 
            
            totalNilai = 0; 
            
            for (int j = 1; j <= 5; j++) {
                
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
               
                nilai = sc.nextInt();
                
               
                totalNilai += nilai; 
            }
            
            
            rataNilai = (double) totalNilai / 5;
            
            
            System.out.println("Total Nilai Kelompok " + i + " adalah: " + totalNilai);
            System.out.println("Rata-rata Nilai Kelompok " + i + " adalah: " + rataNilai);
            
          
            i++; 
        }
        
       
        sc.close();
        System.out.println("\nProses penilaian selesai.");
    }
}