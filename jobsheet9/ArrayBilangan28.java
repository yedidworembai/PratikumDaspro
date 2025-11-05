package jobsheet9;

public class ArrayBilangan28 {

    public static void main(String[] args) {
        // 1. Deklarasi array (diberi ukuran 4)
        int[] bil = new int[4]; 
        
        // 2. Inisialisasi elemen array satu per satu
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // Modifikasi statement loop (Langkah No 4)
        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
    }
}