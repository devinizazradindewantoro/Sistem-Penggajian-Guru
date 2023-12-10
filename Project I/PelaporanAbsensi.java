import java.util.Scanner;

public class PelaporanAbsensi {
    static String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
    static int[] NIPGuru = {20040417, 20040418, 20040419, 20040420, 20040421};
    static String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
    static int[] golonganGuru = {1, 2, 1, 2, 1};
    static int[][][] absensiGuru = new int[5][12][4];  // Array untuk menyimpan absensi per guru, bulan, dan minggu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memilih guru
        System.out.println("Pilih Guru:");
        for (int i = 0; i < namaGuru.length; i++) {
            System.out.println((i + 1) + ". " + namaGuru[i]);
        }
        System.out.print("Masukkan nomor guru (1-5): ");
        int nomorGuru = scanner.nextInt() - 1;

        // Validasi nomor guru
        if (nomorGuru < 0 || nomorGuru >= namaGuru.length) {
            System.out.println("Nomor guru tidak valid.");
            return;
        }

        // Melakukan input absensi untuk setiap bulan
        for (int bulan = 1; bulan <= 12; bulan++) {
            inputAbsensi(nomorGuru, bulan, scanner);
            tampilkanAkumulasi(nomorGuru, bulan);
            
            // Opsi untuk melanjutkan ke bulan berikutnya atau ganti guru
            System.out.print("Lanjut ke bulan berikutnya (y/n): ");
            char lanjut = scanner.next().charAt(0);
            if (lanjut != 'y' && lanjut != 'Y') {
                // Memilih guru baru
                System.out.print("Ganti guru (y/n): ");
                char gantiGuru = scanner.next().charAt(0);
                if (gantiGuru == 'y' || gantiGuru == 'Y') {
                    System.out.println("Pilih Guru:");
                    for (int i = 0; i < namaGuru.length; i++) {
                        System.out.println((i + 1) + ". " + namaGuru[i]);
                    }
                    System.out.print("Masukkan nomor guru (1-5): ");
                    nomorGuru = scanner.nextInt() - 1;

                    // Validasi nomor guru
                    if (nomorGuru < 0 || nomorGuru >= namaGuru.length) {
                        System.out.println("Nomor guru tidak valid.");
                        return;
                    }
                } else {
                    break;  // Keluar dari loop jika tidak lanjut dan tidak ganti guru
                }
            }
        }
    }
    static void inputAbsensi(int nomorGuru, int bulan, Scanner scanner) {
        // Memasukkan jumlah kehadiran per minggu
        for (int minggu = 1; minggu <= 4; minggu++) {
            System.out.print("Masukkan jumlah kehadiran minggu ke-" + minggu + " untuk bulan " + bulan + ": ");
            absensiGuru[nomorGuru][bulan - 1][minggu - 1] = scanner.nextInt();
        }
    }

    static void tampilkanAkumulasi(int nomorGuru, int bulan) {
        // Menampilkan akumulasi inputan absensi kehadiran dan ketidakhadiran
        System.out.println("Akumulasi Absensi Kehadiran dan Ketidakhadiran untuk " + namaGuru[nomorGuru] +
                " pada Bulan " + bulan + ":");
        int totalKehadiran = 0;

        for (int minggu = 1; minggu <= 4; minggu++) {
            totalKehadiran += absensiGuru[nomorGuru][bulan - 1][minggu - 1];
        }

        int ketidakhadiran = 20 - totalKehadiran;

        System.out.println("Total Kehadiran: " + totalKehadiran + " hari");
        System.out.println("Ketidakhadiran: " + ketidakhadiran + " hari");
    }
}
