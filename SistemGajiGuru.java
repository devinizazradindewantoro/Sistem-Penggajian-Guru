import java.util.Scanner;

public class SistemGajiGuru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama guru: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIK guru: ");
        String nik = scanner.nextLine();

        System.out.print("Masukkan jabatan (PNS atau honorer): ");
        String jabatan = scanner.nextLine();

        System.out.print("Masukkan golongan (1 atau 2): ");
        int golongan = scanner.nextInt();

        System.out.print("Masukkan jumlah jam kerja per bulan: ");
        int torJamKerjaPerBulan = scanner.nextInt();

        System.out.print("Masukkan jumlah hari masuk per bulan: ");
        int totHariMasukPerBulan = scanner.nextInt();

        System.out.print("Masukkan jumlah hari tidak masuk per bulan: ");
        int totHariTidakMasukPerBulan = scanner.nextInt();

        double gajiPokok = 0;
        double pajak = 0;

        if (jabatan.equalsIgnoreCase("PNS")) {
            if (golongan == 1) {
                gajiPokok = 4000000;
                pajak = 0.005 * gajiPokok;  // 0.5% pajak
            } else if (golongan == 2) {
                gajiPokok = 5000000;
                pajak = 0.0005 * gajiPokok;  // 0.15% pajak
            } else {
                System.out.println("Golongan PNS yang Anda masukkan salah.");
            }
        } else if (jabatan.equalsIgnoreCase("honorer")) {
            if (golongan == 1) {
                gajiPokok = 1000000;
                pajak = 0.002 * gajiPokok;  // 0.2% pajak
            } else if (golongan == 2) {
                gajiPokok = 2500000;
                pajak = 0.0015 * gajiPokok;  // 0.15% pajak
            } else {
                System.out.println("Golongan honorer yang Anda masukkan salah.");
            }
        } else {
            System.out.println("Jabatan yang Anda masukkan salah.");
        }

        double gajiBersih = gajiPokok - pajak;
        
        System.out.println(" MENGHITUNG GAJI KARYAWAN ");
        System.out.println(" ======================== ");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    } 
}
