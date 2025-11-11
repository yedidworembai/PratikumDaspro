package jobsheet8;
import java.util.Scanner;

public class JumlahKuadrat28 {

    public static void main(String[] args) {
       
        int N_MAX = 5; 

        System.out.println("Menghitung Jumlah Kuadrat Bilangan 1 s.d. N");
        System.out.println("----------------------------------------------");
        for (int i = 1; i <= N_MAX; i++) {
            
            int jumlahKuadrat = 0; // Variabel untuk menyimpan total kuadrat untuk setiap nilai 'i'
            String deret = "";      // Variabel untuk menyimpan representasi deret (misal: "1 + 4 + 9")

            // Perulangan Dalam: Menghitung kuadrat dari 1 sampai i
            // Variabel 'j' mewakili bilangan yang dikuadratkan
            for (int j = 1; j <= i; j++) {
                
                int kuadrat = j * j; // Hitung kuadrat dari j
                jumlahKuadrat += kuadrat; // Tambahkan ke total

                // Bangun string deret
                deret += kuadrat;
                if (j < i) {
                    deret += " + ";
                }
            }

            // Tampilkan output sesuai format yang diminta
            System.out.println("n = " + i + " -> jumlah kuadrat = " + deret + " = " + jumlahKuadrat);
        }
    }
}