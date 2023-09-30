import java.util.Scanner;

public class KehadiranGuru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaGuru;
        int Kehadiran;

        System.out.print("Masukkan nama guru: ");
        namaGuru = input.nextLine();
        System.out.print("Masukkan data kehadiran guru: ");
        Kehadiran = input.nextInt();

        if (Kehadiran >= 75) {
            System.out.println(namaGuru + " hadir dengan baik.");
        } else if (Kehadiran >= 50) {
            System.out.println(namaGuru + " hadir dengan cukup.");
        } else {
            System.out.println(namaGuru + " perlu meningkatkan kehadirannya.");
        }

    }    

}
