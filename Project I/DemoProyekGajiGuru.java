import java.util.Scanner;

public class DemoProyekGajiGuru {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        double pajak = 0, gajiTotal = 0, potonganGaji1 = 0, gajiBersih1 = 0, pajakGuru;

        String[][] username = { { "Devin" }, { "Meisy" }, { "Rahmalia" } };
        String[][] password = { { "20040417" }, { "20040418" }, { "20040419" } };
        // Multi level Guru & Admin
        System.out.print("Masukkan sebagai siapa : ");
        String answer = sc.nextLine();

        // Login sebagai Guru
        if (answer.equals("Admin")) {
            boolean login = false;

            do {
                System.out.print("Masukkan username: ");
                sc.nextLine();
                System.out.print("Masukkan password: ");
                sc.nextLine();

                for (int i = 0; i < username.length; i++) {
                    for (int j = 0; j < username[i].length; j++)
                        if (username.equals(username[i][j]) && password.equals(password[i][j])) {
                            login = true;
                            break;
                        }
                }

                if (!login) {
                    System.out.println("Username dan password anda salah!");
                }
            } while (!login);

            // menu pilihan pada sistem guru
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
            System.out.print("Pilihan menu 1/2/3/4/5/6: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // Input data guru ke data master
                    // untuk melakukan perulangan guru

                case 2:
                    // Perhitungan gaji guru
                    // Code for handling cek data guru
                    String[][] dataGuru = {
                            { "A001", "Devin", "PNS", "1", "4000000" },
                            { "A002", "Meisy", "PNS", "1", "4000000" },
                            { "A003", "Rahmalia", "PNS", "2", "5000000" },
                            { "B001", "Belqis", "HONORER", "2", "2500000" },
                            { "B002", "Aqila", "HONORER", "1", "1000000" }
                    };

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("| ID Guru | Nama Guru |       Jabatan     | Golongan |      Gaji Pokok      |");
                    System.out.println("-----------------------------------------------------------------------------");

                    for (int i = 0; i < dataGuru.length; i++) {
                        System.out.printf("| %-7s | %-9s | %-17s | %-8s | Rp %-17s |\n",
                                dataGuru[i][0], dataGuru[i][1], dataGuru[i][2], dataGuru[i][3], dataGuru[i][4]);
                    }

                    System.out.println("-----------------------------------------------------------------------------");

                case 3:
                    // Update data guru
                    // Code for handling kehadiran
                    while (true) { // Jobsheet 10
                        System.out.println("--------------------------------------");
                        System.out.println("|             1. Devin               |");
                        System.out.println("|             2. Meisy               |");
                        System.out.println("|             3. Rahmalia            |");
                        System.out.println("|             4. Belqis              |");
                        System.out.println("|             5. Aqila               |");
                        System.out.println("--------------------------------------");
                        System.out.print("Pilih nama guru 1/2/3/4/5 : ");
                        int kehadiran = sc.nextInt();
                        switch (kehadiran) {
                            case 1:
                                int jumlahTeacher = 0;
                                int[][] presence = new int[5][20];
                                System.out.print("Masukkan jumlah guru: ");
                                jumlahTeacher = sc.nextInt();
                                for (int p = 0; p < jumlahTeacher; p++) {
                                    for (int j = 0; j < 20; j++) {
                                        presence[p][j] = 0;
                                    }
                                }
                                for (int p = 0; p < jumlahTeacher; p++) {
                                    for (int j = 0; j < 20; j++) {
                                        System.out.print(
                                                "Masukkan kehadiran guru ke-" + (p + 1) + " hari ke-" + (j + 1) + ": ");
                                        presence[p][j] = sc.nextInt();
                                    }
                                }
                                for (int p = 0; p < jumlahTeacher; p++) {
                                    int jumlahPresence = 0;
                                    for (int j = 0; j < 20; j++) {
                                        jumlahPresence += presence[p][j];
                                    }
                                    System.out.println(
                                            "Jumlah kehadiran guru ke-" + (p + 1) + " adalah " + jumlahPresence);
                                }
                            case 2:
                            case 3:
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
                    // Code for handling slip gaji

                case 5:
                    // fitur pencarian
                    // Exit the program
                    break;
                case 6:
                    // Exit the program
                    main(args);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            // Login sebagai admin
        } else if (answer.equals("Guru")) {

            // tampilan menu pada halaman admin
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
            System.out.print("Pilihan menu 1/2/3/4/5: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    // Input kategori / golongan dan gaji
                    System.out.println("\nPilihan status pegawai - (PNS , HONORER)");
                    sc.nextLine();
                    System.out.print("Masukkan jabatan karyawan : ");
                    String statusGuru = sc.nextLine();
                    System.out.print("Masukkan nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan penghasilan (1000000 - 5000000) : ");
                    int gajiPokok = sc.nextInt();
                    System.out.print("Masukkan golongan ( 1 atau 2 ) : ");
                    int golongan = sc.nextInt();

                    if (statusGuru.equalsIgnoreCase("PNS")) { // Jobsheet 6
                        if (golongan == 1) {
                            gajiPokok = 4000000;
                            pajak = 0.500;

                        } else if (golongan == 2) {
                            gajiPokok = 5000000;
                            pajak = 0.150;

                        } else {
                            System.out.println("Golongan PNS yang anda masukkan salah.");
                        }
                    } else if (statusGuru.equalsIgnoreCase("HONORER")) {
                        if (golongan == 1) {
                            gajiPokok = 1000000;
                            pajak = 0.200;

                        } else if (golongan == 2) {
                            gajiPokok = 2500000;
                            pajak = 0.300;

                        } else {
                            System.out.println("Golongan honorer yang anda masukkan salah.");
                        }
                    } else {
                        System.out.println("Golongan yang anda masukkan salah");
                        break;
                    }

                    System.out.println(" MENGHITUNG GAJI KARYAWAN ");
                    System.out.println(" ======================== ");
                    System.out.println("Nama : " + nama);
                    System.out.println("Jabatan : " + statusGuru);
                    System.out.println("Golongan : " + golongan);
                    gajiTotal = gajiPokok - pajak;
                    System.out.println("Gaji pokok : " + gajiPokok);
                    System.out.println("Gaji total : " + gajiTotal);
                    System.out.println("Gaji yang diterima adalah : " + gajiTotal);

                    // Tambahkan kode untuk menghitung total gaji dan pajak

                    break;
                case 2:
                    // Slip gaji
                    System.out.print("Masukkan NIP Guru: ");
                    int nipGuru = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Masukkan nama guru: ");
                    String namaGuru = sc.nextLine();

                    // memilih golongan dan jabatan
                    System.out.print("Jabatan (PNS/HONORER): ");
                    String jabatanGuru = sc.nextLine();
                    System.out.print("Golongan (1/2): ");
                    int golonganGuru = sc.nextInt();
                    System.out.print("Gaji pokok: ");
                    int gajiPokokGuru = sc.nextInt();

                    // menghitung gaji berdasarkan jabatan dan golongan
                    if (jabatanGuru.equalsIgnoreCase("PNS")) {
                        if (golonganGuru == 1) {
                            pajakGuru = 0.05;
                            System.out.println("Pajak (Golongan 1): " + (pajakGuru * 100) + "%");
                        } else if (golonganGuru == 2) {
                            pajakGuru = 0.015;
                            System.out.println("Pajak (Golongan 2): " + (pajakGuru * 100) + "%");
                        } else {
                            System.out.println("Golongan PNS yang anda masukkan salah.");
                            break;
                        }
                    } else if (jabatanGuru.equalsIgnoreCase("HONORER")) {
                        if (golonganGuru == 1) {
                            pajakGuru = 0.02;
                            System.out.println("Pajak (Golongan 1): " + (pajakGuru * 100) + "%");
                        } else if (golonganGuru == 2) {
                            pajakGuru = 0.015;
                            System.out.println("Pajak (Golongan 2): " + (pajakGuru * 100) + "%");
                        } else {
                            System.out.println("Golongan honorer yang anda masukkan salah.");
                            break;
                        }
                    } else {
                        System.out.println("Jabatan yang anda masukkan salah");
                        break;
                    }
                    // Menghitung ketidakhadiran guru, 1400*8jam= 14400
                    System.out.print("Masukkan jumlah tidak hadir: ");
                    int jumlahTidakMasukGuru = sc.nextInt();
                    double potonganGaji = jumlahTidakMasukGuru * 14400.0;

                    // Menghitung gaji bersih
                    double gajiBersih = gajiPokokGuru - (gajiPokokGuru * pajakGuru) - potonganGaji;
                    double gajiBersihGuru = gajiBersih;

                    System.out.println("Total potongan tidak hadir: " + potonganGaji);
                    System.out.println("Total gaji bersih: " + gajiBersih);
                    System.out.println();

                    System.out.println(
                            "------------------------------------------- SLIP GAJI GURU -------------------------------------------------");
                    System.out.println(
                            "| Nama Guru |     NIP    |   Jabatan  | Golongan | Gaji Pokok | Pajak | Potongan Tidak Hadir | Gaji Bersih |");
                    System.out.println(
                            "|-----------|------------|------------|----------|------------|-------|----------------------|-------------|");

                    System.out.println(String.format(
                            "| %-9s | %-10s | %-10s | %-8s | %-10s | %-5s | %-20.2f | %-11s |",
                            namaGuru, nipGuru, jabatanGuru, golonganGuru, gajiPokokGuru,
                            (pajakGuru * 100) + "%", jumlahTidakMasukGuru * 14400.0, gajiBersihGuru));

                    System.out.println(
                            "------------------------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    // Pelaporan semua karyawan bulanan

                case 4:
                    // Pelaporan riwayat gaji masing masing guru

                case 5:
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
