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
            System.out.println(" Data lengkap.");
        } else if (Kehadiran <= 5) {
            System.out.println(" ERROR, data kurang lengkap.");
       
    }    
    }
}
