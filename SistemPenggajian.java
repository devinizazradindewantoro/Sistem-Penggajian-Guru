import java.util.Scanner;

public class SistemPenggajian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di Sistem Penggajian Guru!");
        
        // Daftar user login
        String[] usernames = {"Devin", "Meisy", "Rahmalia"};
        String[] passwords = {"10", "19", "27"};
        
        // Login
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        int userIndex = -1;
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                userIndex = i;
                break;
            }
        }
        
        if (userIndex == -1) {
            System.out.println("Username atau password salah. Program berhenti.");
            return;
        }
        
        System.out.println("\nAnda berhasil login sebagai " + usernames[userIndex]);
        
        // Input data guru
        System.out.print("\nMasukkan nama guru: ");
        String namaGuru = input.nextLine();
        
        System.out.print("Masukkan jumlah kehadiran: ");
        int kehadiran = input.nextInt();
        
        System.out.print("Masukkan tingkat kinerja (1-5): ");
        int kinerja = input.nextInt();
        
        System.out.print("Masukkan jumlah jam mengajar: ");
        int jamMengajar = input.nextInt();

        System.out.print("Masukkan jumlah gaji: ");
        float jumlahGaji = input.nextInt();

        // Menghitung gaji
        int gajiDasar = 5000;
        int tunjanganKehadiran = kehadiran * 5000;
        int bonusKinerja = kinerja * 1000;
        int tunjanganMengajar = jamMengajar * 2000;
        
        int totalGaji = gajiDasar + tunjanganKehadiran + bonusKinerja + tunjanganMengajar;
        
        // Output gaji guru
        System.out.println("\n===== Data Gaji Guru =====");
        System.out.println("Nama Guru      : " + namaGuru);
        System.out.println("Kehadiran      : " + kehadiran + " hari");
        System.out.println("Kinerja        : Level " + kinerja);
        System.out.println("Jam Mengajar   : " + jamMengajar + " jam");
        System.out.println("Total Gaji     : " + gajiDasar * tunjanganKehadiran * bonusKinerja * tunjanganMengajar);

    }

}