import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyekAkhirGajiGuru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaGuru = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
        int[] nipGuru = { 20040417, 20040607, 20040416, 20040415, 20040414 };
        String[] jabatanGuru = new String[5];
        
        int[] golonganGuru = new int[5];
        int[] gajiPokokGuru = new int[5];
        double[] pajakGuru = new double[5];
        int[] jumlahTidakMasukGuru = new int[5];
        double[] gajiBersihGuru = new double[5]; // New array for gaji bersih

        System.out.println("-----------------MENU-----------------");
        System.out.println("1. Cek Gaji Guru");
        System.out.println("2. Cek Data Guru");
        System.out.println("3. Cek Kehadiran Guru");
        System.out.println("4. Cetak Slip Gaji");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------");
        System.out.print("Pilihan menu 1/2/3/4/5: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println("Guru ke-" + (i + 1) + " - " + namaGuru[i]);
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
        
                    System.out.print("Masukkan jumlah tidak hadir: ");
                    jumlahTidakMasukGuru[i] = sc.nextInt();
                    double potonganGaji = jumlahTidakMasukGuru[i] * 14400.0;
        
                    // Calculate gaji bersih
                    double gajiBersih = gajiPokokGuru[i] - (gajiPokokGuru[i] * pajakGuru[i]) - potonganGaji;
                    gajiBersihGuru[i] = gajiBersih;
        
                    System.out.println("Total potongan tidak hadir: " + potonganGaji);
                    System.out.println("Total gaji bersih: " + gajiBersih);
                    System.out.println();
                }
        
                System.out.println("---------- SLIP GAJI GURU ----------");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Guru: " + namaGuru[i]);
                    System.out.println("NIP: " + nipGuru[i]);
                    System.out.println("Jabatan: " + jabatanGuru[i]);
                    System.out.println("Golongan: " + golonganGuru[i]);
                    System.out.println("Gaji Pokok: " + gajiPokokGuru[i]);
                    System.out.println("Pajak: " + (pajakGuru[i] * 100) + "%");
                    System.out.println("Potongan Tidak Hadir: " + jumlahTidakMasukGuru[i] * 14400.0);
                    System.out.println("Gaji Bersih: " + gajiBersihGuru[i]);
                }
                break;
            case 2:
                // Code for handling cek data guru
            case 3:
                // Code for handling kehadiran
                break;
            case 4:
                // Code for handling slip gaji
                break;
            case 5:
                // Exit the program
                
            default:
        }
    }
}