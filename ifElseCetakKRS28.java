import java.util.Scanner;
public class ifElseCetakKRS28
 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x:--- Cetak KRS SIAKAD ---");
        System.out.print("s:Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        // Transformasi dari SWITCH-CASE ke IF-ELSE IF-ELSE
        if (semester == 1) {
            System.out.println("x:KRS semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("x:KRS semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("x:KRS semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("x:KRS semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("x:KRS semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("x:KRS semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("x:KRS semester 7 ditampilkan");
        } else {
            // Blok ELSE ini setara dengan klausa 'default' pada SWITCH-CASE
            System.out.println("x:Semester tidak valid");
        }

        sc.close();
    }
}