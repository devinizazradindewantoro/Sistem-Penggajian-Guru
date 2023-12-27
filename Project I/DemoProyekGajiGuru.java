import java.util.Scanner;

public class DemoProyekGajiGuru {

    static int jumlahPengajar = 5;
    static String[] nama = new String[jumlahPengajar];
    static int[] nip = new int[jumlahPengajar];
    static String[] jabatan = new String[jumlahPengajar];
    static int[] golongan = new int[jumlahPengajar];
    static double[] gajiUtama = new double[jumlahPengajar];
    static String[] mataPelajaran = new String[jumlahPengajar];
    static String[] alamat = new String[jumlahPengajar];
    static String[] pendidikan = new String[jumlahPengajar];
    static int indexGuru = -1;
    static String history[] = new String[100];
    static int counter = 0;

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

    static String[] namaGuru5 = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
    static String[] jabatanGuru5 = { "PNS", "PNS", "Honorer", "Honorer", "PNS" };
    static int[] NIPGuru5 = { 20040417, 20040418, 20040419, 20040420, 20040421 };
    static int[] golonganGuru5 = { 1, 2, 1, 2, 1 };
    static int[] gajiPokokGuru5 = { 4000000, 5000000, 1000000, 2500000, 4000000 };
    static double[] pajakGuru5 = { 0.005, 0.0015, 0.002, 0.005, 0.005 };

    static void beriSalam() {
        System.out.println("------------------------------------------------");
        System.out.println("                                                ");
        System.out.println("                                                ");
        System.out.println("                  Selamat datang di             ");
        System.out.println("               Sistem Penggajian Guru           ");
        System.out.println("                                                ");
        System.out.println("                                                ");
        System.out.println("------------------------------------------------");
    }

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
                break;
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

    // case IV admin
    static void inputGuruData(Scanner sc, int jumlahGuru, String[] namaGuru, double[] gajiGuru, boolean[] gajiDitarik) {
        for (int i = 0; i < jumlahGuru; i++) {
            System.out.println("Guru ke-" + (i + 1));
            System.out.print("Nama guru: ");
            namaGuru[i] = sc.nextLine();
            System.out.print("Gaji guru: ");
            gajiGuru[i] = sc.nextDouble();
            gajiDitarik[i] = false; // Default status belum ditarik
            sc.nextLine(); // Membersihkan buffer newline
        }
    }

    static void displayGajiRiwayat(String[] namaGuru, double[] gajiGuru, boolean[] gajiDitarik) {
        for (int i = 0; i < namaGuru.length; i++) {
            System.out.println("\nRiwayat Gaji " + namaGuru[i] + ": ");
            System.out.println("Gaji: " + gajiGuru[i]);

            if (!gajiDitarik[i]) {
                System.out.println("Status: Belum ditarik");
                // Inputan untuk menarik gaji
                System.out.print("Apakah gaji sudah ditarik? (ya/tidak): ");
                String jawaban = new Scanner(System.in).nextLine().toLowerCase();
                if (jawaban.equals("ya")) {
                    gajiDitarik[i] = true;
                }
            } else {
                System.out.println("Status: Gaji sudah ditarik");
            }
        }
    }

    static void displayGajiDitarik(String[] namaGuru, double[] gajiGuru, boolean[] gajiDitarik) {
        System.out.println("\nDaftar Gaji yang Sudah Ditarik:");
        boolean adaGajiDitarik = false;
        for (int i = 0; i < namaGuru.length; i++) {
            if (gajiDitarik[i]) {
                System.out.println(namaGuru[i] + " - Gaji: " + gajiGuru[i]);
                adaGajiDitarik = true;
            }
        }
        if (!adaGajiDitarik) {
            System.out.println("Tidak ada gaji yang sudah ditarik.");
        }
    }

    // case V admin
    static void pencarian() {
        if (hasil != -1) { // hasil tidak sama dengan -1
            System.out.println("Nama: " + namaGuru3[hasil] + ", NIP: " + NIPGuru3[hasil] + ", Jabatan: "
                    + jabatanGuru3[hasil] + ", Golongan: " + golonganGuru3[hasil]);
        } else {
            System.out.println(
                    "Data guru dengan nama " + namaGuruCari + " tidak ditemukan. Menampilkan data keseluruhan:");
            for (int i = 0; i < namaGuru.length; i++) {
                System.out.println(
                        "Nama: " + namaGuru[i] + "( )" + NIPGuru[i] + "-" + jabatanGuru[i] + "Gol. " + golonganGuru[i]);
            }
        }
    }
    // case I guru

    // case II guru
    static double hitungGaji(int gajiPokok, double pajak, int jumlahTidakMasuk) {
        double gajiBersih = gajiPokok - (gajiPokok * pajak) - (jumlahTidakMasuk * 14400.0);
        return Math.max(gajiBersih, 0); // Ensure gajiBersih is not negative
    }

    static void printSlipGaji(int bulan, String nama, int nip, String jabatan, int golongan, int gajiPokok,
            double pajak,
            int jumlahTidakMasuk, double gajiBersih) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                    SLIP GAJI GURU BULAN KE-" + bulan);
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

    // case III guru
    // Fungsi untuk input absensi per minggu
    static int[] inputAbsensi(int bulan) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah kehadiran per minggu untuk bulan " + bulan + ":");
        int[] kehadiranPerMinggu = new int[4];

        for (int minggu = 1; minggu <= 4; minggu++) {
            System.out.print("Masukkan jumlah kehadiran minggu ke-" + minggu + ": ");
            kehadiranPerMinggu[minggu - 1] = sc.nextInt();
        }

        return kehadiranPerMinggu;
    }

    // Fungsi untuk menampilkan akumulasi absensi
    static void tampilkanAkumulasi(String namaGuru, int bulan, int[] kehadiranPerMinggu) {
        int totalKehadiran = hitungTotalKehadiran(kehadiranPerMinggu);
        int ketidakhadiran = 20 - totalKehadiran;

        // Tampilkan akumulasi absensi untuk bulan ini
        System.out.println("Absensi untuk " + namaGuru + " pada Bulan " + bulan + ":");
        System.out.println("Total Kehadiran: " + totalKehadiran + " hari");
        System.out.println("Ketidakhadiran: " + ketidakhadiran + " hari");
    }

    // Fungsi untuk menghitung total kehadiran
    static int hitungTotalKehadiran(int[] kehadiranPerMinggu) {
        int totalKehadiran = 0;
        for (int kehadiran : kehadiranPerMinggu) {
            totalKehadiran += kehadiran;
        }
        return totalKehadiran;
    }

    // Fungsi untuk menanyakan apakah lanjut ke bulan berikutnya
    static boolean lanjutKeBulanBerikutnya() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lanjut ke bulan berikutnya (y/n): ");
        char lanjut = sc.next().charAt(0);
        return lanjut == 'y' || lanjut == 'Y';

    }

    // case IV guru
    static void inputGajiGuru() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama guru: ");
        String namaGuru = sc.nextLine();

        System.out.print("Masukkan NIP guru: ");
        String NIP = sc.nextLine();

        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();

        // Array to store salary, tax, and deductions for each month
        double[] gajiPokok = new double[12];
        double[] tax = new double[12];
        double[] potongan = new double[12];

        // Input salary, tax, and deductions for each month
        for (int bulan = 0; bulan < 12; bulan++) {
            System.out.print("Masukkan gaji pokok untuk Bulan " + (bulan + 1) + ": ");
            gajiPokok[bulan] = sc.nextDouble();

            System.out.print("Masukkan pajak untuk Bulan " + (bulan + 1) + ": ");
            tax[bulan] = sc.nextDouble();

            System.out.print("Masukkan potongan untuk Bulan " + (bulan + 1) + ": ");
            potongan[bulan] = sc.nextDouble();
        }

        for (int bulan = 0; bulan < 12; bulan++) {
            // Menghitung total gaji berdasarkan gaji, pajak, dan potongan
            double totalGaji = gajiPokok[bulan] - tax[bulan] - potongan[bulan];

            System.out.println("Laporan Gaji Guru - Bulan " + (bulan + 1));
            System.out.println("Nama: " + namaGuru);
            System.out.println("NIP: " + NIP);
            System.out.println("Tahun: " + tahun);
            System.out.println("Gaji pokok: " + gajiPokok[bulan]);
            System.out.println("Pajak: " + tax[bulan]);
            System.out.println("Potongan: " + potongan[bulan]);
            System.out.println("Total gaji: " + totalGaji);
            System.out.println(); // Adding a line break for better readability
        }
    }

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

        String[][] usernames = { { "Devin" }, { "Meisy" }, { "Rahmalia" }, { "Belqis" }, { "Aqila" }, { "Admin1" } };
        String[][] passwords = { { "20040417" }, { "20040607" }, { "20050228" }, { "20040415" }, { "20040414" },
                { "12345" } };

        boolean loginSuccessful = false;
        boolean usernameFound = false;

        beriSalam();
        while (!loginSuccessful) {
            System.out.print("Masukkan username : ");
            String inputUsername = sc.nextLine();

            System.out.print("Masukkan password : ");
            String inputPassword = sc.nextLine();

            for (int i = 0; i < usernames.length; i++) {
                if (usernames[i][0].equals(inputUsername) && passwords[i][0].equals(inputPassword)) {
                    loginSuccessful = true;
                    break;
                }
            }

            if (loginSuccessful) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Login gagal!");
                System.out.println("Klik <enter> untuk coba lagi atau ketik 'exit' untuk keluar");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Terima kasih.");
                    return;
                }
            }
        }

        // Multi level Admin & Guru
        System.out.print("Masukkan sebagai siapa : ");
        String answer = sc.nextLine();

        // Login sebagai Admin
        if (answer.equals("Admin")) {
            int menu = 0;
            do {
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
                menu = sc.nextInt();

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

                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        String kembaliMenuUtama = sc.nextLine();
                        // Keluar dari program
                        if (kembaliMenuUtama.equalsIgnoreCase("t")) {
                            menu = 6;
                            System.out.println("Terima kasih! Keluar dari program.");
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
                            double gajiBerth = gajiPokokGuru[i] - (gajiPokokGuru[i] * pajakGuru[i])
                                    - potonganGajiGuru[i];
                            gajiBersihGuru[i] = gajiBerth;

                            System.out.println("Total potongan tidak hadir: " + potonganGajiGuru[i]);
                            System.out.println("Total gaji bersih: " + gajiBerth);
                            System.out.println();

                        }
                        printSalarySlips(namaGuru, nipGuru, jabatanGuru, golonganGuru, gajiPokokGuru, pajakGuru,
                                potonganGajiGuru, gajiBersihGuru);
                        // untuk mencetak struk gaji

                        sc.nextLine();
                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        kembaliMenuUtama = sc.nextLine();
                        // Keluar dari program
                        if (kembaliMenuUtama.equalsIgnoreCase("t")) {
                            menu = 6;
                            System.out.println("Terima kasih! Keluar dari program.");
                        }
                        break;
                    case 3:
                        // Update data guru
                        System.out.println("Menu Update Data Guru:");
                        System.out.println("1. Tambah Data Guru");
                        System.out.println("2. Ubah Data Guru");
                        System.out.print("Pilih menu (1/2): ");
                        int menu1 = sc.nextInt();

                        switch (menu1) {
                            case 1:
                                tambahDataGuru(namaGuru, NIPGuru, jabatanGuru, golonganGuru, gajiPokokGuru,
                                        pajakGuru);

                                sc.nextLine();
                                System.out.print("Apakah anda ingin kembali ? (y/t) ");
                                kembaliMenuUtama = sc.nextLine();
                                // Keluar dari program
                                if (kembaliMenuUtama.equalsIgnoreCase("t")) {
                                    menu = 6;
                                    System.out.println("Terima kasih! Keluar dari program.");
                                }
                                break;
                            case 2:
                                ubahDataGuru(sc);
                                sc.nextLine();
                                System.out.print("Apakah anda ingin kembali ? (y/t) ");
                                kembaliMenuUtama = sc.nextLine();
                                // Keluar dari program
                                if (kembaliMenuUtama.equalsIgnoreCase("t")) {
                                    menu = 6;
                                    System.out.println("Terima kasih! Keluar dari program.");
                                }
                                break;

                            default:
                                System.out.println("Menu tidak valid.");
                                break;
                        }
                    case 4: // Pelaporan riwayat gaji masing masing admin
                        System.out.print("Masukkan Jumlah Guru: ");
                        int jumlahGuru = sc.nextInt();
                        sc.nextLine(); // Membersihkan buffer newline

                        String[] namaGuru5 = new String[jumlahGuru];
                        double[] gajiGuru = new double[jumlahGuru];
                        boolean[] gajiDitarik = new boolean[jumlahGuru];

                        inputGuruData(sc, jumlahGuru, namaGuru5, gajiGuru, gajiDitarik);
                        displayGajiRiwayat(namaGuru5, gajiGuru, gajiDitarik);
                        displayGajiDitarik(namaGuru5, gajiGuru, gajiDitarik);

                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        kembaliMenuUtama = sc.nextLine();
                        // Keluar dari program
                        if (kembaliMenuUtama.equalsIgnoreCase("t")) {
                            menu = 6;
                            System.out.println("Terima kasih! Keluar dari program.");
                        }
                        break;
                    case 5:
                        // fitur pencarian
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Masukkan nama guru: ");
                        namaGuruCari = scan.nextLine();
                        sc.nextLine();
                        // Mencari data guru berdasarkan nama
                        for (int i = 0; i < namaGuru3.length; i++) {
                            if (namaGuru3[i].equalsIgnoreCase(namaGuruCari)) {
                                hasil = i; // Simpan indeks tempat data ditemukan
                                break;
                            }
                        }
                        pencarian();
                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        kembaliMenuUtama = sc.nextLine();
                        // Keluar dari program
                        if (kembaliMenuUtama.equalsIgnoreCase("t")) {
                            menu = 6;
                            System.out.println("Terima kasih! Keluar dari program.");
                        }
                        break;
                    case 6:
                        // Exit the program
                        main(args);
                    default:
                        break;
                }
            } while (menu != 6);
            // Login sebagai Guru
        } else if (answer.equals("Guru")) {
            while (loginSuccessful) {
                // tampilan menu pada halaman Guru
                System.out.println("--------------------------------------");
                System.out.println("|                                    |");
                System.out.println("|                MENU                |");
                System.out.println("|                                    |");
                System.out.println("--------------------------------------");
                System.out.println("|       1. Slip gaji                 |");
                System.out.println("|       2. Pelaporan bulanan         |");
                System.out.println("|       3. Pelaporan riwayat gaji    |");
                System.out.println("|       4. Ganti Akun                |");
                System.out.println("|       5. Keluar                    |");
                System.out.println("--------------------------------------");
                System.out.print("Pilihan menu 1-5: ");
                int pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 1:
                        // Slip gaji
                        // Memilih bulan
                        System.out.print("Masukkan bulan (1-12): ");
                        int bulanGaji = sc.nextInt();

                        // Memasukkan nama guru
                        System.out.print("Masukkan nama guru: ");
                        sc.next();

                        // Memasukkan NIP guru
                        System.out.print("Masukkan NIP guru: ");
                        int nip = sc.nextInt();

                        // Mencari indeks guru berdasarkan NIP
                        for (int i = 0; i < NIPGuru.length; i++) {
                            if (NIPGuru[i] == nip) {
                                indexGuru = i;
                                break;
                            }
                        }

                        // Validasi guru ditemukan
                        if (indexGuru == -1) {
                            System.out.println("Guru tidak ditemukan.");
                            break;
                        }

                        // Menampilkan informasi guru
                        System.out.println("Informasi Guru:");
                        System.out.println("Nama: " + namaGuru2[indexGuru]);
                        System.out.println("NIP: " + NIPGuru2[indexGuru]);
                        System.out.println("Jabatan: " + jabatanGuru2[indexGuru]);
                        System.out.println("Golongan: " + golonganGuru2[indexGuru]);
                        System.out.println("Gaji Pokok: " + gajiPokokGuru2[indexGuru]);
                        System.out.println("Pajak: " + (pajakGuru2[indexGuru] * 100) + "%");

                        // Memasukkan input ketidakhadiran
                        System.out.print("Masukkan jumlah ketidakhadiran: ");
                        int jumlahTidakMasuk = sc.nextInt();

                        // Menghitung gaji bersih
                        double gajiBersih = hitungGaji(gajiPokokGuru2[indexGuru], pajakGuru2[indexGuru],
                                jumlahTidakMasuk);

                        // Menampilkan output
                        System.out.println("=================================================");
                        String outputSlip = "Nama : " + namaGuru2[indexGuru] +
                                "\nNIP :" + NIPGuru2[indexGuru] +
                                "\nGaji Bulan Ke-" + bulanGaji +
                                "\nTotal potongan tidak hadir: Rp" + (jumlahTidakMasuk * 14400) +
                                "\nTotal gaji bersih: Rp" + gajiBersih;
                        System.out.println(outputSlip);
                        history[counter] = outputSlip;
                        counter++;
                        // Opsi untuk mencetak slip gaji
                        System.out.print("Cetak slip gaji (y/n): ");
                        char cetakSlip = sc.next().charAt(0);

                        if (cetakSlip == 'y' || cetakSlip == 'Y') {
                            printSlipGaji(bulanGaji, namaGuru2[indexGuru], NIPGuru2[indexGuru],
                                    jabatanGuru2[indexGuru],
                                    golonganGuru2[indexGuru], gajiPokokGuru2[indexGuru], pajakGuru2[indexGuru],
                                    jumlahTidakMasuk, gajiBersih);
                        }
                        sc.nextLine();

                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        String kembaliPilihan = sc.nextLine();
                        // Keluar dari program
                        if (kembaliPilihan.equalsIgnoreCase("t")) {
                            pilihan = 5;
                            System.out.println("Terima kasih! Keluar dari program.");
                        }
                        break;

                    case 2:
                        // Pelaporan semua karyawan bulanan
                        System.out.print("Masukkan nama guru: ");
                        String namaGuru6 = sc.next();

                        System.out.print("Masukkan NIP guru: ");
                        String nipGuru6 = sc.next();

                        // Lakukan input absensi untuk setiap bulan
                        for (int bulan2 = 1; bulan2 <= 12; bulan2++) {
                            int[] kehadiranPerMinggu = inputAbsensi(bulan2);
                            tampilkanAkumulasi(namaGuru6, bulan2, kehadiranPerMinggu);

                            // Opsi untuk melanjutkan ke bulan berikutnya
                            if (bulan2 < 12) {
                                if (!lanjutKeBulanBerikutnya()) {
                                    break; // Keluar dari loop jika tidak lanjut ke bulan berikutnya
                                }
                            }
                        }
                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        kembaliPilihan = sc.nextLine();
                        // Keluar dari program
                        if (kembaliPilihan.equalsIgnoreCase("t")) {
                            pilihan = 5;
                            System.out.println("Terima kasih! Keluar dari program.");
                        }
                        break;
                    case 3:
                        // Pelaporan riwayat gaji masing masing guru
                        inputGajiGuru();
                        System.out.print("Apakah anda ingin kembali ? (y/t) ");
                        kembaliPilihan = sc.nextLine();
                        // Keluar dari program
                        if (kembaliPilihan.equalsIgnoreCase("t")) {
                            pilihan = 5;
                            System.out.println("Terima kasih! Keluar dari program.");
                        }
                        break;
                    case 4:
                        loginSuccessful = false;
                        break;
                    case 5:
                        // Exit the program
                        main(args);
                    default:
                        break;
                }
            }

        } else
            System.out.println("Pilihan anda salah.");
    }
}
