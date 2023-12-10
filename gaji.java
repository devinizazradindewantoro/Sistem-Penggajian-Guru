import java.util.Scanner;

    public static void main(String[] args) {
        // Create arrays to store information for 5 teachers
        String[] namaGuru = new String[5];
        int[] nipGuru = new int[5];
        String[] jabatanGuru = new String[5];
        int[] golonganGuru = new int[5];
        int[] gajiPokokGuru = new int[5];
        double[] pajakGuru = new double[5];
        int[] jumlahTidakMasukGuru = new int[5];
        double[] potonganGajiGuru = new double[5];
        double[] gajiBersihGuru = new double[5];

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input and processing function
        inputGuruData(namaGuru, nipGuru, jabatanGuru, golonganGuru, gajiPokokGuru,
                pajakGuru, jumlahTidakMasukGuru, potonganGajiGuru, gajiBersihGuru, sc);

        // Print the salary slips
        printSalarySlips(namaGuru, nipGuru, jabatanGuru, golonganGuru, gajiPokokGuru,
                pajakGuru, potonganGajiGuru, gajiBersihGuru);
    }

    static void inputGuruData(String[] namaGuru, int[] nipGuru, String[] jabatanGuru,
                              int[] golonganGuru, int[] gajiPokokGuru, double[] pajakGuru,
                              int[] jumlahTidakMasukGuru, double[] potonganGajiGuru,
                              double[] gajiBersihGuru, Scanner sc) {
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
                pajakGuru[i] = (golonganGuru[i] == 1) ? 0.05 : (golonganGuru[i] == 2) ? 0.015 : -1;
            } else if (jabatanGuru[i].equalsIgnoreCase("HONORER")) {
                pajakGuru[i] = (golonganGuru[i] == 1) ? 0.02 : (golonganGuru[i] == 2) ? 0.015 : -1;
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
    }

    static void printSalarySlips(String[] namaGuru, int[] nipGuru, String[] jabatanGuru,
                                  int[] golonganGuru, int[] gajiPokokGuru, double[] pajakGuru,
                                  double[] potonganGajiGuru, double[] gajiBersihGuru) {
        // Print the salary slips
        System.out.println("---------- SLIP GAJI GURU ----------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Guru: " + namaGuru[i]);
            System.out.println("NIP: " + nipGuru[i]);
            System.out.println("Jabatan: " + jabatanGuru[i]);
            System.out.println("Golongan: " + golonganGuru[i]);
            System.out.println("Gaji Pokok: " + gajiPokokGuru[i]);
            System.out.println("Pajak: " + (pajakGuru[i] * 100) + "%");
            System.out.println("Potongan Tidak Hadir: " + potonganGajiGuru[i]);
            System.out.println("Gaji Bersih: " + gajiBersihGuru[i]);
            System.out.println("      ");
        }
    }
}
 gaji {
    
}
