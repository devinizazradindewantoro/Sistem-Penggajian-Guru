import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemPenggajianGuru {
    static void beriSalam() {
        System.out.println("Selamat Datang Di Sistem Penggajian Guru");
        System.out.println("                                        ");
    }

    public static void main(String[] args) {
        beriSalam();
        Scanner sc = new Scanner(System.in);

        // Deklarasi
        String[] namaGuru = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
        int[] nipGuru = { 20040417, 20040607, 20040416, 20040415, 20040414 };
        String[] jabatanGuru = new String[5];
        int[] golonganGuru = new int[5];
        int[] gajiPokokGuru = new int[5];
        double[] pajakGuru = new double[5];
        int[] jumlahTidakMasukGuru = new int[5];
        double[] gajiBersihGuru = new double[5]; // New array for gaji bersih

        double pajak = 0, gajiTotal = 0, potonganGaji = 0, gajiBersih = 0, totalGaji = 0, totalPajak = 0;
        int jumlahKaryawan, kehadiran;

        System.out.print("Masukkan sebagai siapa : ");
        String answer = sc.nextLine();

        // Login Program sebagai guru
        if (answer.equals("Guru")) {
            String[] username = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
            String[][] password = { { "20040417" }, { "20040607" }, { "20050228" }, { "20040415" }, { "20040414" } };
            System.out.print("Masukkan username : ");
            sc.nextLine();
            System.out.print("Masukkan password : ");
            sc.nextLine();
            boolean loginSuccessful = false;
            for (int i = 0; i < username.length; i++) {
                if (username[i].equals(username) && password[i].equals(password[i][0])) {
                    loginSuccessful = true;
                    break;
                }
            }
            if (!loginSuccessful) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Login gagal!");
                System.out.println("Klik <enter> untuk kembali ke halaman login");
                sc.nextLine();
            }

            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Cek Gaji Guru");
            System.out.println("2. Cek Data Guru");
            System.out.println("3. Cek Kehadiran Guru");
            System.out.println("4. Cetak Slip Gaji");
            System.out.println("5. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Pilihan menu 1/2/3/4/5: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jumlah guru : ");
                    jumlahKaryawan = sc.nextInt();
                    int i = 1;
                    while (i < jumlahKaryawan) {
                        for (int k = 1; i <= jumlahKaryawan; k++) {
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
                                if (statusGuru.equalsIgnoreCase("PNS")) {
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
                                System.out.println("gaji pokok : " + gajiPokok);
                                System.out.println("Gaji total : " + gajiTotal);
                                gajiTotal = gajiPokok - pajak;
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

                case 2: // Code for handling cek data guru
                    List<String> namaTeacher = new ArrayList<>();
                    namaTeacher.add("Devin");
                    namaTeacher.add("Meisy");
                    namaTeacher.add("Rahmalia");
                    namaTeacher.add("Belqis");
                    namaTeacher.add("Aqila");
                    List<String> mataPelajaran = new ArrayList<>();
                    mataPelajaran.add("Bahasa Inggris");
                    mataPelajaran.add("Akuntansi");
                    mataPelajaran.add("Seni Budaya");
                    mataPelajaran.add("Matematika");
                    mataPelajaran.add("Bahasa Indonesia");
                    List<Integer> kodeGuru = new ArrayList<>();
                    kodeGuru.add(20040417);
                    kodeGuru.add(20040607);
                    kodeGuru.add(20050528);
                    kodeGuru.add(20040415);
                    kodeGuru.add(20040414);
                    for (int j = 0; j < namaTeacher.size(); j++) {
                        System.out.println(
                                "nama guru: " + namaTeacher.get(j) + ", mata pelajaran: " + mataPelajaran.get(j)
                                        + ", kode guru: " + kodeGuru.get(j));
                    }
                    break;

                case 3: // Code for handling kehadiran
                    while (true) {
                        System.out.println("----------KEHADIRAN GURU-----------");
                        System.out.println("1. Devin ");
                        System.out.println("2. Meisy ");
                        System.out.println("3. Rahmalia ");
                        System.out.println("4. Belqis ");
                        System.out.println("5. Aqila ");
                        System.out.println("6. Exit ");
                        System.out.println("-----------------------------------");
                        System.out.print("Pilih nama guru 1/2/3/4/5/6 : ");
                        kehadiran = sc.nextInt();
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
                                System.out.println("kembali ke halaman utama");
                                main(args);
                                break;
                            default:
                        }
                    }

                case 4: // Code for handling slip gaji
                    for (int k = 0; k < 5; k++) {
                        System.out.println("Guru ke-" + (k + 1) + " - " + namaGuru[k]);
                        System.out.print("Masukkan NIP Guru: ");
                        nipGuru[k] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Jabatan (PNS/HONORER): ");
                        jabatanGuru[k] = sc.nextLine();
                        System.out.print("Golongan (1/2): ");
                        golonganGuru[k] = sc.nextInt();
                        System.out.print("Gaji pokok: ");
                        gajiPokokGuru[k] = sc.nextInt();

                        // Calculate pajak based on jabatan and golongan
                        if (jabatanGuru[k].equalsIgnoreCase("PNS")) {
                            if (golonganGuru[k] == 1) {
                                pajakGuru[k] = 0.05;
                                System.out.println("Pajak (Golongan 1): " + (pajakGuru[k] * 100) + "%");
                            } else if (golonganGuru[k] == 2) {
                                pajakGuru[k] = 0.015;
                                System.out.println("Pajak (Golongan 2): " + (pajakGuru[k] * 100) + "%");
                            } else {
                                System.out.println("Golongan PNS yang anda masukkan salah.");
                                break;
                            }
                        } else if (jabatanGuru[k].equalsIgnoreCase("HONORER")) {
                            if (golonganGuru[k] == 1) {
                                pajakGuru[k] = 0.02;
                                System.out.println("Pajak (Golongan 1): " + (pajakGuru[k] * 100) + "%");
                            } else if (golonganGuru[k] == 2) {
                                pajakGuru[k] = 0.015;
                                System.out.println("Pajak (Golongan 2): " + (pajakGuru[k] * 100) + "%");
                            } else {
                                System.out.println("Golongan honorer yang anda masukkan salah.");
                                break;
                            }
                        } else {
                            System.out.println("Jabatan yang anda masukkan salah");
                            break;
                        }

                        System.out.print("Masukkan jumlah tidak hadir: ");
                        jumlahTidakMasukGuru[k] = sc.nextInt();
                        double potGaji = jumlahTidakMasukGuru[k] * 14400.0;

                        // Calculate gaji bersih
                        double gajiClean = gajiPokokGuru[k] - (gajiPokokGuru[k] * pajakGuru[k]) - potonganGaji;
                        gajiBersihGuru[k] = gajiBersih;

                        System.out.println("Total potongan tidak hadir: " + potonganGaji);
                        System.out.println("Total gaji bersih: " + gajiBersih);
                        System.out.println();
                    }

                    System.out.println("---------- SLIP GAJI GURU ----------");
                    for (int p = 0; p < 5; p++) {
                        System.out.println("Guru: " + namaGuru[p]);
                        System.out.println("NIP: " + nipGuru[p]);
                        System.out.println("Jabatan: " + jabatanGuru[p]);
                        System.out.println("Golongan: " + golonganGuru[p]);
                        System.out.println("Gaji Pokok: " + gajiPokokGuru[p]);
                        System.out.println("Pajak: " + (pajakGuru[p] * 100) + "%");
                        System.out.println("Potongan Tidak Hadir: " + jumlahTidakMasukGuru[p] * 14400.0);
                        System.out.println("Gaji Bersih: " + gajiBersihGuru[p]);
                    }
                case 5: // Exit the program
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
                default:
                    System.out.println("INVALID");
                    break;
            }

            // Login Program sebagai admin
        } else if (answer.equals("Admin")) {

            String[] username = { "Devin", "Meisy", "Rahmalia" };
            String[][] password = { { "20040417" }, { "20040607" }, { "20050228" } };
            System.out.print("Masukkan username : ");
            sc.nextLine();
            System.out.print("Masukkan password : ");
            sc.nextLine();
            boolean loginSuccessful = false;
            for (int i = 0; i < username.length; i++) {
                if (username[i].equals(username) && password[i].equals(password[i][0])) {
                    loginSuccessful = true;
                    break;
                }
            }
            if (!loginSuccessful) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Login gagal!");
                System.out.println("Klik <enter> untuk kembali ke halaman login");
                sc.nextLine();
            }

            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Lihat daftar guru");
            System.out.println("2. Tambah guru");
            System.out.println("3. Ubah gaji guru");
            System.out.println("4. Hapus guru");
            System.out.println("5. Keluar");
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
                    break;
            }

        } else
            System.out.println("Pilihan anda salah.");
        sc.close();
    }
}