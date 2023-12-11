import java.util.Scanner;

public class DemoProyekGajiGuru {
    static String[][] username = { { "Devin" }, { "Meisy" }, { "Rahmalia" } };
    static String[][] password = { { "20040417" }, { "20040418" }, { "20040419" } };

    static int jumlahPengajar = 5;
    static String[] nama = new String[jumlahPengajar];
    static int[] nip = new int[jumlahPengajar];
    static String[] jabatan = new String[jumlahPengajar];
    static int[] golongan = new int[jumlahPengajar];
    static double[] gajiUtama = new double[jumlahPengajar];
    static String[] mataPelajaran = new String[jumlahPengajar];
    static String[] alamat = new String[jumlahPengajar];
    static String[] pendidikan = new String[jumlahPengajar];

    static String[] namaGuru = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
    static int[] NIPGuru = { 20040417, 20040418, 20040419, 20040420, 20040421 };
    static String[] jabatanGuru = { "PNS", "PNS", "Honorer", "Honorer", "PNS" };
    static int[] golonganGuru = { 1, 2, 1, 2, 1 };
    static int[] gajiPokokGuru = { 4000000, 5000000, 1000000, 2500000, 4000000 };
    static double[] pajakGuru = { 0.005, 0.0015, 0.002, 0.005, 0.005 };

    static String[] namaGuru2 = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
    static int[] NIPGuru2 = { 20040417, 20040418, 20040419, 20040420, 20040421 };
    static String[] jabatanGuru2 = { "PNS", "PNS", "Honorer", "Honorer", "PNS" };
    static int[] golonganGuru2 = { 1, 2, 1, 2, 1 };
    static int[] gajiPokokGuru2 = { 4000000, 5000000, 1000000, 2500000, 4000000 };
    static double[] pajakGuru2 = { 0.005, 0.0015, 0.002, 0.005, 0.005 };

    static String[] namaGuru3 = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
    static int[] NIPGuru3 = { 20040417, 20040418, 20040419, 20040420, 20040421 };
    static String[] jabatanGuru3 = { "PNS", "PNS", "Honorer", "Honorer", "PNS" };
    static int[] golonganGuru3 = { 1, 2, 1, 2, 1 };
    static int hasil = -1; // Inisialisasi hasil dengan nilai 1
    static String namaGuruCari;

    static String[] namaGuru5 = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
    static String[] jabatanGuru5 = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
    static int[] NIPGuru5 = {20040417, 20040418, 20040419, 20040420, 20040421};
    static int[] golonganGuru5 = {1, 2, 1, 2, 1};
    static int[] gajiPokokGuru5 = {4000000, 5000000, 1000000, 2500000, 4000000};
    static double[] pajakGuru5 = {0.005, 0.0015, 0.002, 0.005, 0.005};

    static void dataGuru(String nama[], int nip[], String jabatan[], int golongan[], double gajiUtama[],
            String mataPelajaran[], String alamat[], String pendidikan[]) {
        if (jumlahPengajar > 0) {
            System.out.println(
                    "+--------------+------------+----------------+------------------+-------------------+--------------------+------------------------+---------------+");
            System.out.println(
                    "|     Nama     |     NIP    |     Jabatan    |     Golongan     |     Gaji Pokok    |   Mata Pelajaran   |          Alamat        |   Pendidikan  |");
            System.out.println(
                    "+--------------+------------+----------------+------------------+-------------------+--------------------+------------------------+---------------+");

            for (int i = 0; i < jumlahPengajar; i++) {
                System.out.println(String.format(
                        "| %-12s | %-10s | %-14s | %-16s | %-17s | %-18s | %-22s | %-13s |",
                        nama[i], nip[i], jabatan[i], golongan[i], gajiUtama[i], mataPelajaran[i],
                        alamat[i], pendidikan[i]));
                System.out.println(
                        "+--------------+------------+----------------+------------------+-------------------+--------------------+------------------------+---------------+");

            }
        } else {
            System.out.println("Tabel kosong. Tidak ada data yang ditampilkan.");
        }
        // case II admin
    }

    static void printSalarySlips(String[] namaGuru2, int[] NIPGuru2, String[] jabatanGuru2, int[] golonganGuru2,
            int[] gajiPokokGuru2, double[] pajakGuru2, double[] potonganGajiGuru, double[] gajiBersihGuru) {

        System.out.println(
                "+--------------+------------+----------------+------------------+-------------------+--------------------+------------------------+---------------+");
        System.out.println(
                "|     Nama     |     NIP    |     Jabatan    |     Golongan     |     Gaji Pokok    |        Pajak       |         Potongan       |  Gaji Bersih  |");
        System.out.println(
                "+--------------+------------+----------------+------------------+-------------------+--------------------+------------------------+---------------+");

        for (int i = 0; i < 5; i++) {
            System.out.println(String.format(
                    "| %-12s | %-10s | %-14s | %-16s | %-17s | %-18s | %-22s | %-13s |",
                    namaGuru2[i], NIPGuru2[i], jabatanGuru2[i], golonganGuru2[i], gajiPokokGuru2[i],
                    pajakGuru2[i] * 100 + "%", potonganGajiGuru[i], gajiBersihGuru[i]));
            System.out.println(
                    "+--------------+------------+----------------+------------------+-------------------+--------------------+------------------------+---------------+");

        }
    }


     // case III admin
    static void tambahDataGuru(String[] namaGuru4, int[] nIPGuru4, String[] jabatanGuru4, int[] golonganGuru4,
            int[] gajiPokokGuru3, double[] pajakGuru3) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan Nama Guru: ");
            String nama = sc.next();
            System.out.print("Masukkan NIP Guru: ");
            int nip = sc.nextInt();
            System.out.print("Masukkan Jabatan Guru (PNS/Honorer): ");
            String jabatan = sc.next();
            System.out.print("Masukkan Golongan Guru (1/2): ");
            int golongan = sc.nextInt();
            System.out.print("Masukkan Gaji Pokok Guru: ");
            int gajiPokok = sc.nextInt();
            System.out.print("Masukkan Pajak Guru: ");
            double pajak = sc.nextDouble();

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
        } while (sc.next().equalsIgnoreCase("y"));
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


    
                        } else if (jabatanGuru[i].equalsIgnoreCase("HONORER")) {
                            if (golonganGuru[i] == 1) {
                                pajakGuru[i] = 0.02;
                            } else if (golonganGuru[i] == 2) {
                                pajakGuru[i] = 0.015;
                            } else {
                                System.out.println("Golongan honorer yang anda masukkan salah.");
                                break;
                            }
                        } else {
                            System.out.println("Jabatan yang anda masukkan salah");
                            break;
                        }

                        System.out.print("Masukkan jumlah tidak hadir: ");
                        jumlahTidakMasukGuru[i] = sc.nextInt();
                        potonganGajiGuru[i] = jumlahTidakMasukGuru[i] * 14400.0;

                        // Calculate gaji bersih
                        double gajiBerth = gajiPokokGuru[i] - (gajiPokokGuru[i] * pajakGuru[i]) - potonganGajiGuru[i];
                        gajiBersihGuru[i] = gajiBerth;

                        System.out.println("Total potongan tidak hadir: " + potonganGajiGuru[i]);
                        System.out.println("Total gaji bersih: " + gajiBerth);
                        System.out.println();
                    }
                    // untuk mencetak struk gaji
                    printSalarySlips(namaGuru, nipGuru, jabatanGuru, golonganGuru, gajiPokokGuru, pajakGuru,
                            potonganGajiGuru, gajiBersihGuru);
                    break;
                case 3:
                    // Update data guru
                    static String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
                    static int[] NIPGuru = {20040417, 20040418, 20040419, 20040420, 20040421};
                    static String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
                    static int[] golonganGuru = {1, 2, 1, 2, 1};
                    static int[] gajiPokokGuru = {4000000, 5000000, 1000000, 2500000, 4000000};
                    static double[] pajakGuru = {0.005, 0.0015, 0.002, 0.005, 0.005};


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
                     }
                    
                    static void ubahDataGuru(Scanner scanner) {
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
            }

            static void cetakDataGuru() {
                System.out.println("Data Guru:");
                for (int i = 0; i < namaGuru.length; i++) {
                    System.out.println((i + 1) + ". Nama: " + namaGuru[i] + ", NIP: " + NIPGuru[i] + ", Jabatan: " +
                            jabatanGuru[i] + ", Golongan: " + golonganGuru[i] + ", Gaji Pokok: " + gajiPokokGuru[i] +
                            ", Pajak: " + (pajakGuru[i] * 100) + "%");
                }
            }

            // Fungsi untuk menambahkan elemen baru ke dalam array
            static String[] tambahArray(String[] array, String nilaiBaru) {
                String[] newArray = new String[array.length + 1];
                System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[array.length] = nilaiBaru;
                return newArray;
            }

            // Fungsi untuk menambahkan elemen baru ke dalam array
            static int[] tambahArray(int[] array, int nilaiBaru) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = nilaiBaru;
            return newArray;
        }

        // Fungsi untuk menambahkan elemen baru ke dalam array
        static double[] tambahArray(double[] array, double nilaiBaru) {
            double[] newArray = new double[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = nilaiBaru;
            return newArray;
    }
}
                            case 4:
                                
                            case 5:
                                
                            case 6:
                                System.out.println("kembali ke halaman utama");
                                main(args);
                                break;
                            default:
                        }
                    }
                case 4:
                    // Pelaporan riwayat gaji masing masing admin
                    static void pelaporan(String namaGuru3[], double gajiGuru[], boolean gajiDitarik[]){
                    System.out.print("Masukkan Jumlah Guru : ");
                    jumlahGuru = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < jumlahGuru; i++){
                        System.out.println

                case 5:
                    // fitur pencarian
                Scanner scan = new Scanner(System.in);
                    int hasil = -1;
                    String namaGuruuCari;

                    System.out.print("Masukkan nama guru: ");
                    namaGuruCari = scan.nextLine();
                    sc.nextLine();
                    // Mencari data guru berdasarkan nama
                    for (int i = 0; i < namaGuru1.length; i++) {
                        if (namaGuru1[i].equalsIgnoreCase(namaGuruCari)) {
                            hasil = i; // Simpan indeks tempat data ditemukan
                            break;
                        }
                    }
                        if (hasil != -1){
                            System.out.println("Nama: " +namaGuru1[hasil]+ ",NIP: " + NIPGuru1[hasil]+ ",Jabatan: " +jabatanGuru1[hasil]+ ", Golongan: " +golonganGuru1[hasil]);
                        } else {
                            System.out.println("Data guru dengan nama " +namaGuruCari+"tidak ditemukan. Menampilkan data keseluruhan:");
                            for (int i = 0; i<namaGuru.length; i++){
                                 System.out.println("Nama: " +namaGuru1[i] + " (" +NIPGuru1[i] + ") - " +jabatanGuru1[i] + " Gol. " +golonganGuru1[i]);
                                 continue;
                        }
                        break;
                case 6:
                    // Exit the program
                    main(args);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            // Login sebagai Guru
        } else if (answer.equals("Guru")) {

            // tampilan menu pada halaman Guru
            System.out.println("--------------------------------------");
            System.out.println("|                                    |");
            System.out.println("|                MENU                |");
            System.out.println("|                                    |");
            System.out.println("--------------------------------------");
            System.out.println("|       1. Slip gaji                 |");
            System.out.println("|       2. Pelaporan absensi         |");
            System.out.println("|       3. Pelaporan riwayat gaji    |");
            System.out.println("|       4. Keluar                    |");
            System.out.println("--------------------------------------");
            System.out.print("Pilihan menu 1/2/3/4: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                
                case 1:
                    // Slip gaji
                    static String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
    static String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
    static int[] NIPGuru = {20040417, 20040418, 20040419, 20040420, 20040421};
    static int[] golonganGuru = {1, 2, 1, 2, 1};
    static int[] gajiPokokGuru = {4000000, 5000000, 1000000, 2500000, 4000000};
    static double[] pajakGuru = {0.005, 0.0015, 0.002, 0.005, 0.005};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Memilih bulan
            System.out.print("Masukkan bulan (1-12): ");
            int bulan = scanner.nextInt();

            // Memasukkan nama guru
            System.out.print("Masukkan nama guru: ");
            String nama = scanner.next();

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
                printSlipGaji(namaGuru[indexGuru], NIPGuru[indexGuru], jabatanGuru[indexGuru], golonganGuru[indexGuru],
                        gajiPokokGuru[indexGuru], pajakGuru[indexGuru], jumlahTidakMasuk, gajiBersih);
            }

            // Opsi untuk melihat pelaporan gaji pada bulan lain atau nama guru lain
            System.out.print("Ingin melihat pelaporan gaji pada bulan lain? (y/n): ");
            char lanjut = scanner.next().charAt(0);

            if (lanjut != 'y' && lanjut != 'Y') {
                break;
            }

        } while (true);
    }

    static double hitungGaji(int gajiPokok, double pajak, int jumlahTidakMasuk) {
        double potonganGaji = jumlahTidakMasuk * 14400.0;
        return gajibERSIH - (gajiPokok * pajak) - potonganGaji;
    }

    static void printSlipGaji(String nama, int nip, String jabatan, int golongan, int gajiPokok,
                              double pajak, int jumlahTidakMasuk, double gajiBersih) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                           SLIP GAJI GURU                             ");
        System.out.println("-----------------------------------------------------------------------");
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
}

                case 2:
                    // Pelaporan semua karyawan bulanan

                case 3:
                    // Pelaporan riwayat gaji masing masing guru
                     inputGajiGuru();
                case 4:
                    // Exit the program
                    main(args);
                default:
                    System.out.println("Error 404");
                    break;
            }

        } else
            System.out.println("Pilihan anda salah.");
        // menutup scanner
        sc.close();
    }
}
