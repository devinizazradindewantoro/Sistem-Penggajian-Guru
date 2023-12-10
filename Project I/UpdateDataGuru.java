import java.util.Scanner;

public class UpdateDataGuru {
    static String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
    static int[] NIPGuru = {20040417, 20040418, 20040419, 20040420, 20040421};
    static String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
    static int[] golonganGuru = {1, 2, 1, 2, 1};
    static int[] gajiPokokGuru = {4000000, 5000000, 1000000, 2500000, 4000000};
    static double[] pajakGuru = {0.005, 0.0015, 0.002, 0.005, 0.005};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("Menu Update Data Guru:");
        System.out.println("1. Tambah Data Guru");
        System.out.println("2. Ubah Data Guru");
        System.out.print("Pilih menu (1/2): ");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                tambahDataGuru(scanner);
                break;
            case 2:
                ubahDataGuru(scanner);
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    static void tambahDataGuru(Scanner scanner) {
        do {
            System.out.print("Masukkan Nama Guru: ");
            String nama = scanner.next();
            System.out.print("Masukkan NIP Guru: ");
            int nip = scanner.nextInt();
            System.out.print("Masukkan Jabatan Guru (PNS/Honorer): ");
            String jabatan = scanner.next();
            System.out.print("Masukkan Golongan Guru (1/2): ");
            int golongan = scanner.nextInt();
            System.out.print("Masukkan Gaji Pokok Guru: ");
            int gajiPokok = scanner.nextInt();
            System.out.print("Masukkan Pajak Guru: ");
            double pajak = scanner.nextDouble();

            // Memperluas array
            namaGuru = tambahArray(namaGuru, nama);
            NIPGuru = tambahArray(NIPGuru, nip);
            jabatanGuru = tambahArray(jabatanGuru, jabatan);
            golonganGuru = tambahArray(golonganGuru, golongan);
            gajiPokokGuru = tambahArray(gajiPokokGuru, gajiPokok);
            pajakGuru = tambahArray(pajakGuru, pajak);

            System.out.println("Data Guru berhasil ditambahkan.");
            cetakDataGuru();

            System.out.print("Apakah ingin menambahkan data guru lain? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));
    }

    static void ubahDataGuru(Scanner scanner) {
        do {
            cetakDataGuru();
            System.out.print("Pilih nomor guru yang ingin diubah: ");
            int nomorGuru = scanner.nextInt();

            if (nomorGuru < 1 || nomorGuru > namaGuru.length) {
                System.out.println("Nomor guru tidak valid.");
                return;
            }

            System.out.println("Data Guru yang dipilih:");
            System.out.println("1. Nama: " + namaGuru[nomorGuru - 1]);
            System.out.println("2. NIP: " + NIPGuru[nomorGuru - 1]);
            System.out.println("3. Jabatan: " + jabatanGuru[nomorGuru - 1]);
            System.out.println("4. Golongan: " + golonganGuru[nomorGuru - 1]);
            System.out.println("5. Gaji Pokok: " + gajiPokokGuru[nomorGuru - 1]);
            System.out.println("6. Pajak: " + pajakGuru[nomorGuru - 1]);

            System.out.print("Pilih nomor data yang ingin diubah: ");
            int nomorData = scanner.nextInt();

            System.out.print("Masukkan nilai baru: ");
            switch (nomorData) {
                case 1:
                    namaGuru[nomorGuru - 1] = scanner.next();
                    break;
                case 2:
                    NIPGuru[nomorGuru - 1] = scanner.nextInt();
                    break;
                case 3:
                    jabatanGuru[nomorGuru - 1] = scanner.next();
                    break;
                case 4:
                    golonganGuru[nomorGuru - 1] = scanner.nextInt();
                    break;
                case 5:
                    gajiPokokGuru[nomorGuru - 1] = scanner.nextInt();
                    break;
                case 6:
                    pajakGuru[nomorGuru - 1] = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Nomor data tidak valid.");
                    return;
            }

            System.out.println("Data Guru berhasil diubah.");
            cetakDataGuru();

            System.out.print("Apakah ingin mengubah data guru lain? (y/n): ");
            String pilihan = scanner.next();

            if (pilihan.equalsIgnoreCase("n")) {
                System.out.print("Apakah ingin menambah data pada guru lain? (y/n): ");
                pilihan = scanner.next();
                if (pilihan.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
            }
        } while (true);
    }

    static void cetakDataGuru() {
        System.out.println("Data Guru:");
        for (int i = 0; i < namaGuru.length; i++) {
            System.out.println((i + 1) + ". Nama: " + namaGuru[i] + ", NIP: " + NIPGuru[i] + ", Jabatan: " +
                    jabatanGuru[i] + ", Golongan: " + golonganGuru[i] + ", Gaji Pokok: " + gajiPokokGuru[i] +
                    ", Pajak: " + (pajakGuru[i] * 100) + "%");
        }
    }

    static String[] tambahArray(String[] array, String nilaiBaru) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = nilaiBaru;
        return newArray;
    }

    static int[] tambahArray(int[] array, int nilaiBaru) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = nilaiBaru;
        return newArray;
    }

    static double[] tambahArray(double[] array, double nilaiBaru) {
        double[] newArray = new double[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = nilaiBaru;
        return newArray;
    }
}