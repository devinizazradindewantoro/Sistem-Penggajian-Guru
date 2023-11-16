import java.util.Scanner;

public class DemoProyekGajiGuru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk cetak slip gaji
        String[] namaGuru = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
        int[] nipGuru = { 20040417, 20040607, 20040416, 20040415, 20040414 };
        String[] jabatanGuru = new String[5];
        int[] golonganGuru = new int[5];
        int[] gajiPokokGuru = new int[5];
        double[] pajakGuru = new double[5];
        int[] jumlahTidakMasukGuru = new int[5];
        double[] gajiBersihGuru = new double[5]; // New array for gaji bersih

        // deklarasi
        double pajak = 0, gajiTotal = 0, potonganGaji1 = 0, gajiBersih1 = 0, totalGaji = 0, totalPajak = 0;
        int jumlahKaryawan;

        // Multi level Guru & Admin
        System.out.print("Masukkan sebagai siapa : ");
        String answer = sc.nextLine();

        // Login sebagai Guru
        if (answer.equals("Guru")) {

            // menu pilihan pada sistem guru
            System.out.println("--------------------------------------");
            System.out.println("|                                    |");
            System.out.println("|                MENU                |");
            System.out.println("|                                    |");
            System.out.println("--------------------------------------");
            System.out.println("|       1. Cetak Slip Gaji           |");
            System.out.println("|       2. Cek Data Guru             |");
            System.out.println("|       3. Cek Kehadiran Guru        |");
            System.out.println("|       4. Cek Gaji Guru             |");
            System.out.println("|       5. Exit                      |");
            System.out.println("--------------------------------------");
            System.out.print("Pilihan menu 1/2/3/4/5: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // untuk melakukan perulangan guru
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Guru ke-" + (i + 1) + " - " + namaGuru[i]);
                        System.out.print("Masukkan NIP Guru: ");
                        nipGuru[i] = sc.nextInt();
                        sc.nextLine();

                        // memilih golongan dan jabatan
                        System.out.print("Jabatan (PNS/HONORER): ");
                        jabatanGuru[i] = sc.nextLine();
                        System.out.print("Golongan (1/2): ");
                        golonganGuru[i] = sc.nextInt();
                        System.out.print("Gaji pokok: ");
                        gajiPokokGuru[i] = sc.nextInt();

                        // menghitung gaji berdasarkan jabatan dan golongan
                        if (jabatanGuru[i].equalsIgnoreCase("PNS")) {
                            if (golonganGuru[i] == 1) {
                                pajakGuru[i] = 0.05;
                                System.out.println("Pajak (Golongan 1): " + (pajakGuru[i] * 100) + "%");
                            } else if (golonganGuru[i] == 2) {
                                pajakGuru[i] = 0.015;
                                System.out.println("Pajak (Golongan 2): " + (pajakGuru[i] * 100) + "%");
                            } else {
                                System.out.println("Golongan PNS yang anda masukkan salah.");
                                break;
                            }
                        } else if (jabatanGuru[i].equalsIgnoreCase("HONORER")) {
                            if (golonganGuru[i] == 1) {
                                pajakGuru[i] = 0.02;
                                System.out.println("Pajak (Golongan 1): " + (pajakGuru[i] * 100) + "%");
                            } else if (golonganGuru[i] == 2) {
                                pajakGuru[i] = 0.015;
                                System.out.println("Pajak (Golongan 2): " + (pajakGuru[i] * 100) + "%");
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
                        jumlahTidakMasukGuru[i] = sc.nextInt();
                        double potonganGaji = jumlahTidakMasukGuru[i] * 14400.0;

                        // Menghitung gaji bersih
                        double gajiBersih = gajiPokokGuru[i] - (gajiPokokGuru[i] * pajakGuru[i]) - potonganGaji;
                        gajiBersihGuru[i] = gajiBersih;

                        System.out.println("Total potongan tidak hadir: " + potonganGaji);
                        System.out.println("Total gaji bersih: " + gajiBersih);
                        System.out.println();
                    }

                    System.out.println("------------------------------------------- SLIP GAJI GURU -------------------------------------------------");
                    System.out.println("| Nama Guru |     NIP    |   Jabatan  | Golongan | Gaji Pokok | Pajak | Potongan Tidak Hadir | Gaji Bersih |");
                    System.out.println("|-----------|------------|------------|----------|------------|-------|----------------------|-------------|");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(String.format("| %-9s | %-10s | %-10s | %-8s | %-10s | %-5s | %-20.2f | %-11s |",
                                                        namaGuru[i], nipGuru[i], jabatanGuru[i], golonganGuru[i], gajiPokokGuru[i],
                                                        (pajakGuru[i] * 100) + "%", jumlahTidakMasukGuru[i] * 14400.0, gajiBersihGuru[i]));
                    }
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    

                    break;
                case 2:
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
                    // Code for handling slip gaji
                    System.out.print("Masukkan jumlah guru : ");
                    jumlahKaryawan = sc.nextInt();
                    int i = 1;
                    while (i < jumlahKaryawan) { // nested loop
                        for (int k = 1; i <= jumlahKaryawan; k++) { // Jobsheet 11
                            for (int o = 1; o < k; o++) {
                                System.out.println("\nPilihan status pegawai - (PNS , HONORER)");
                                sc.nextLine();
                                System.out.print("Masukkan jabatan karyawan ke-" + (i) + " : ");
                                String statusGuru = sc.nextLine();
                                System.out.print("Masukkan nama : ");
                                String nama = sc.nextLine();
                                System.out.print("Masukkan penghasilan (1000000 - 5000000) : ");
                                int gajiPokok = sc.nextInt();
                                System.out.print("Masukkan golongan ( 1 atau 2 ) : ");
                                int golongan = sc.nextInt();
                                i++;
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
                                gajiTotal = gajiPokok - pajak;
                                System.out.println("gaji pokok : " + gajiPokok);
                                System.out.println("Gaji total : " + gajiTotal);
                                System.out.println("gaji yang diterima adalah : " + gajiTotal);

                                // Tambahkan kode untuk menghitung total gaji dan pajak
                                totalGaji += gajiPokok;
                                totalPajak += pajak * gajiPokok;

                            }
                        }
                        System.out.println("Total gaji semua guru: " + totalGaji);
                        System.out.println("Total pajak semua guru: " + totalPajak);
                    }
                    break;
                case 5:
                    // Exit the program
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            // Login sebagai admin
        } else if (answer.equals("Admin")) {

            // tampilan menu pada halaman admin
            System.out.println("--------------------------------------");
            System.out.println("|                                    |");
            System.out.println("|                MENU                |");
            System.out.println("|                                    |");
            System.out.println("--------------------------------------");
            System.out.println("|       1. Lihat daftar guru         |");
            System.out.println("|       2. Tambah guru               |");
            System.out.println("|       3. Ubah gaji guru            |");
            System.out.println("|       4. Hapus guru                |");
            System.out.println("|       5. Keluar                    |");
            System.out.println("--------------------------------------");
            System.out.println("Pilihan menu 1/2/3/4/5: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

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
