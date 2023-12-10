import java.util.Scanner;

public class FinPro_SistemPenggajianGuru {
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


    // case I admin
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
   
    // case IV admin
    
    // case V admin

    // case I guru

    // case II guru

    // case III guru

    // case IV guru
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        String[] namaGuru = new String[5];
        int[] nipGuru = new int[5];
        String[] jabatanGuru = new String[5];
        int[] golonganGuru = new int[5];
        int[] gajiPokokGuru = new int[5];
        double[] pajakGuru = new double[5];
        int[] jumlahTidakMasukGuru = new int[5];
        double[] potonganGajiGuru = new double[5];
        double[] gajiBersihGuru = new double[5];

        String NIP;
        int tahun;
        int bulan;
        int gajiPokok;

        // Multi level Admin & Guru
        System.out.print("Masukkan sebagai siapa : ");
        String answer = sc.nextLine();

        // Login sebagai Admin
        if (answer.equals("Admin")) {

            // tampilan menu pada halaman Admin
            System.out.println("--------------------------------------");
            System.out.println("|                                    |");
            System.out.println("|                MENU                |");
            System.out.println("|                                    |");
            System.out.println("--------------------------------------");
            System.out.println("|       1. Input data guru           |");
            System.out.println("|       2. Perhitungan gaji          |");
            System.out.println("|       3. Update data guru          |");
            System.out.println("|       4. Pelaporan riwayat gaji    |");
            System.out.println("|       5. Pencarian                 |");
            System.out.println("|       6. Keluar                    |");
            System.out.println("--------------------------------------");
            System.out.print("Pilihan menu 1-6: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // Input data guru ke data master
                    System.out.print("Masukkan jumlah guru: ");
                    jumlahPengajar = sc.nextInt();

                    for (int j = 0; j < jumlahPengajar; j++) {

                        System.out.print("\nNama: ");
                        nama[j] = sc.next();

                        System.out.print("NIP: ");
                        nip[j] = sc.nextInt();

                        System.out.print("Jabatan: ");
                        jabatan[j] = sc.next();

                        sc.nextLine();
                        System.out.print("Golongan (1/2): ");
                        golongan[j] = sc.nextInt();

                        sc.nextLine(); // Membersihkan buffer

                        System.out.print("Gaji pokok: ");
                        gajiUtama[j] = sc.nextDouble();

                        sc.nextLine(); // Membersihkan buffer

                        System.out.print("Mata pelajaran: ");
                        mataPelajaran[j] = sc.nextLine();

                        System.out.print("Alamat: ");
                        alamat[j] = sc.nextLine();

                        System.out.print("Pendidikan terakhir: ");
                        pendidikan[j] = sc.nextLine();

                        System.out.println("Teacher data inserted successfully.");

                        dataGuru(nama, nip, jabatan, golongan, gajiUtama, mataPelajaran, alamat, pendidikan);
                    }
                    break;
                case 2:
                    // Perhitungan gaji guru
                    // pilih bulan
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Guru ke-" + (i + 1));
                        sc.nextLine();
                        System.out.print("Masukkan Nama Guru: ");
                        namaGuru[i] = sc.nextLine();
                        System.out.print("Masukkan NIP Guru: ");
                        nipGuru[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Jabatan (PNS/HONORER): ");
                        jabatanGuru[i] = sc.nextLine();
                        System.out.print("Golongan (1/2): ");
                        golonganGuru[i] = sc.nextInt();
                        System.out.print("Gaji pokok: ");
                        gajiPokokGuru[i] = sc.nextInt();

                        // Calculate pajak based on jabatan and golongan
                        if (jabatanGuru[i].equalsIgnoreCase("PNS")) {
                            if (golonganGuru[i] == 1) {
                                pajakGuru[i] = 0.05;
                            } else if (golonganGuru[i] == 2) {
                                pajakGuru[i] = 0.015;
                            } else {
                                System.out.println("Golongan PNS yang anda masukkan salah.");
                                break;
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

                case 3:
                    // Update data guru
                    
                case 4:
                    // Pelaporan riwayat gaji masing masing admin
                    
                case 5:
                    // fitur pencarian

                    break;
                case 6:
                    // Exit the program
                    main(args);
                default:

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
            System.out.println("|       1. Input kategori            |");
            System.out.println("|       2. Slip gaji                 |");
            System.out.println("|       3. Pelaporan bulanan         |");
            System.out.println("|       4. Pelaporan riwayat gaji    |");
            System.out.println("|       5. Keluar                    |");
            System.out.println("--------------------------------------");
            System.out.print("Pilihan menu 1-5: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    // Input kategori / golongan dan gaji

                case 2:
                    // Slip gaji
                    

                case 3:
                    // Pelaporan semua karyawan bulanan
                   
                case 4:
                    // Pelaporan riwayat gaji masing masing guru
                    System.out.print("Masukkan nama guru: ");
                    sc.nextLine();

                    sc.nextLine();

                    System.out.print("Masukkan NIP guru: ");
                    NIP = sc.nextLine();

                    System.out.print("Masukkan tahun: ");
                    tahun = sc.nextInt();

                    // Membaca data gaji
                    System.out.print("Masukkan gaji pokok: ");
                    gajiPokok = sc.nextInt();

                    System.out.print("Masukkan pajak: ");
                    double tax = sc.nextDouble();

                    for (bulan = 1; bulan <= 12; bulan++) {
                        // Menghitung total gaji
                        double totalGaji = gajiPokok - tax;

                        System.out.println("Riwayat Gaji Guru");
                        System.out.println("Nama: " + namaGuru);
                        System.out.println("NIP: " + NIP);
                        System.out.println("Tahun: " + tahun);
                        System.out.println("Bulan: " + bulan);
                        System.out.println("Gaji pokok: " + gajiPokok);
                        System.out.println("Pajak: " + tax);
                        System.out.println("Total gaji: " + totalGaji);
                    }
                    break;
                case 5:
                    // Exit the program
                    main(args);
                default:

                    break;
            }
        } else
            System.out.println("Pilihan anda salah.");
        // menutup scanner
        sc.close();
    }
}