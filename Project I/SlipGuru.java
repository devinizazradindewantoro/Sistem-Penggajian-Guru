import java.util.Scanner;

public class SlipGuru {
    static String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
    static String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
    static int[] NIPGuru = {20040417, 20040418, 20040419, 20040420, 20040421};
    static int[] golonganGuru = {1, 2, 1, 2, 1};
    static int[] gajiPokokGuru = {4000000, 5000000, 1000000, 2500000, 4000000};
    static double[] pajakGuru = {0.005, 0.0015, 0.002, 0.005, 0.005};

    static double hitungGaji(int gajiPokok, double pajak, int jumlahTidakMasuk) {
        double gajiBersih = gajiPokok - (gajiPokok * pajak) - (jumlahTidakMasuk * 14400.0);
        return Math.max(gajiBersih, 0);  // Ensure gajiBersih is not negative
    }

    static void printSlipGaji(String nama, int nip, String jabatan, int golongan, int gajiPokok, double pajak, int jumlahTidakMasuk, double gajiBersih) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                           SLIP GAJI GURU                             ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Pajak: " + (pajak * 100) + "%");
        System.out.println("Gaji pokok: Rp" + gajiPokok);
        System.out.println("Jumlah Tidak Hadir: " + jumlahTidakMasuk);
        System.out.println("Potongan Tidak Hadir: Rp" + (jumlahTidakMasuk * 14400));
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
        System.out.println("----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Memilih bulan
            System.out.print("Masukkan bulan (1-12): ");
            scanner.nextInt();

            // Memasukkan nama guru
            System.out.print("Masukkan nama guru: ");
            scanner.next();

            // Memasukkan NIP guru
            System.out.print("Masukkan NIP guru: ");
            int nip = scanner.nextInt();

            // Mencari indeks guru berdasarkan NIP
            int indexGuru = -1;
            for (int i = 0; i < NIPGuru.length; i++) {
                if (NIPGuru[i] == nip) {
                    indexGuru = i;
                    break;
                }
            }

            // Validasi guru ditemukan
            if (indexGuru == -1) {
                System.out.println("Guru tidak ditemukan.");
                return;
            }

            // Menampilkan informasi guru
            System.out.println("Informasi Guru:");
            System.out.println("Nama: " + namaGuru[indexGuru]);
            System.out.println("NIP: " + NIPGuru[indexGuru]);
            System.out.println("Jabatan: " + jabatanGuru[indexGuru]);
            System.out.println("Golongan: " + golonganGuru[indexGuru]);
            System.out.println("Gaji Pokok: " + gajiPokokGuru[indexGuru]);
            System.out.println("Pajak: " + (pajakGuru[indexGuru] * 100) + "%");

            // Memasukkan input ketidakhadiran
            System.out.print("Masukkan jumlah ketidakhadiran: ");
            int jumlahTidakMasuk = scanner.nextInt();

            // Menghitung gaji bersih
            double gajiBersih = hitungGaji(gajiPokokGuru[indexGuru], pajakGuru[indexGuru], jumlahTidakMasuk);

            // Menampilkan output
            System.out.println("Total potongan tidak hadir: Rp" + (jumlahTidakMasuk * 14400));
            System.out.println("Total gaji bersih: Rp" + gajiBersih);

            // Opsi untuk mencetak slip gaji
            System.out.print("Cetak slip gaji (y/n): ");
            char cetakSlip = scanner.next().charAt(0);

            if (cetakSlip == 'y' || cetakSlip == 'Y') {
                printSlipGaji(namaGuru[indexGuru], NIPGuru[indexGuru], jabatanGuru[indexGuru], golonganGuru[indexGuru], gajiPokokGuru[indexGuru], pajakGuru[indexGuru], jumlahTidakMasuk, gajiBersih);
            }
            // Opsi untuk melihat pelaporan gaji pada bulan lain atau nama guru lain
            System.out.print("Ingin melihat pelaporan gaji pada bulan lain? (y/n): ");
            char lanjut = scanner.next().charAt(0);

            if (lanjut != 'y' && lanjut != 'Y') {
                break;
            }

            scanner.close();
        } while (true);
    }
}
