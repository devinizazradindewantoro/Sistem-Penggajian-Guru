import java.util.Scanner;

public class SlipGaji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data guru
        String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
        String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
        int[] golonganGuru = {1, 2, 1, 2, 1};
        int[] gajiPokokGuru = {4000000, 5000000, 1000000, 2500000, 4000000};
        double[] pajakGuru = {0.005, 0.0015, 0.002, 0.005, 0.005};

        // Display menu and get user input for the teacher's name
        System.out.println("Pilih guru yang ingin dicari:");
        for (int i = 0; i < namaGuru.length; i++) {
            System.out.println((i + 1) + ". " + namaGuru[i]);
        }

        System.out.print("Masukkan NIP guru: ");
        int pilihanGuru = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Display information based on user input
        System.out.println((pilihanGuru) + ". Masukkan Nama: " + namaGuru[pilihanGuru - 1]);
        System.out.println("Jabatan: " + jabatanGuru[pilihanGuru - 1]);
        System.out.println("Golongan(1/2): " + golonganGuru[pilihanGuru - 1]);
        System.out.println("Gaji pokok: " + gajiPokokGuru[pilihanGuru - 1]);
        System.out.println("Pajak: " + (pajakGuru[pilihanGuru - 1] * 100) + "%");

        // Input jumlah ketidakhadiran
        System.out.print("Ketidakhadiran (hari): ");
        int ketidakhadiran = sc.nextInt();

        // Hitung gaji bersih
        double potonganKetidakhadiran = ketidakhadiran * 14400.0;
        double gajiBersih = gajiPokokGuru[pilihanGuru - 1] - (gajiPokokGuru[pilihanGuru - 1] * pajakGuru[pilihanGuru - 1]) - potonganKetidakhadiran;

        // Tampilkan output
        System.out.println("Ketidakhadiran: " + ketidakhadiran + " hari (*14.400)");
        System.out.println("Gaji Bersih: " + gajiBersih);

        // Print slip gaji
        System.out.print("Print slip gaji? (y/t): ");
        char printOption = sc.next().charAt(0);
        if (printOption == 'y' || printOption == 'Y') {
            printSlipGaji(namaGuru[pilihanGuru - 1], jabatanGuru[pilihanGuru - 1], golonganGuru[pilihanGuru - 1], gajiPokokGuru[pilihanGuru - 1], pajakGuru[pilihanGuru - 1], ketidakhadiran, gajiBersih);
        sc.close();
        }
    }

    static void printSlipGaji(String namaGuru, String jabatanGuru, int golonganGuru, int gajiPokokGuru, double pajakGuru, int ketidakhadiran, double gajiBersih) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                           SLIP GAJI GURU                             ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Masukkan Nama: " + namaGuru);
        System.out.println("Jabatan: " + jabatanGuru);
        System.out.println("Golongan(1/2): " + golonganGuru);
        System.out.println("Gaji pokok: " + gajiPokokGuru);
        System.out.println("Pajak: " + (pajakGuru * 100) + "%");
        System.out.println("Ketidakhadiran: " + ketidakhadiran + " hari (*14.400)");
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}