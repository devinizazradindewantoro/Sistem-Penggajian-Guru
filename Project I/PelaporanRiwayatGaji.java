import java.util.Scanner;

public class PelaporanRiwayatGaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Guru: ");
        int jumlahGuru = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer newline

        String[] namaGuru = new String[jumlahGuru];
        double[] gajiGuru = new double[jumlahGuru];
        boolean[] gajiDitarik = new boolean[jumlahGuru];

        for (int i = 0; i < jumlahGuru; i++) {
            System.out.println("Guru ke-" + (i + 1));
            System.out.print("Nama guru: ");
            namaGuru[i] = sc.nextLine();
            System.out.print("Gaji guru: ");
            gajiGuru[i] = sc.nextDouble();
            gajiDitarik[i] = false; // Default status belum ditarik
            sc.nextLine(); // Membersihkan buffer newline
        }

        // Menampilkan riwayat gaji
        for (int i = 0; i < jumlahGuru; i++) {
            System.out.println("\nRiwayat Gaji " + namaGuru[i] + ": ");
            System.out.println("Gaji: " + gajiGuru[i]);

            if (gajiDitarik[i]) {
                System.out.println("Status: Gaji sudah ditarik");
            } else {
                System.out.println("Status: Belum ditarik");
                // Inputan untuk menarik gaji
                System.out.print("Apakah gaji sudah ditarik? (ya/tidak): ");
                String jawaban = sc.nextLine().toLowerCase();
                if (jawaban.equals("ya")) {
                    gajiDitarik[i] = true;
                }
            }
        }

        // Menampilkan daftar gaji yang sudah ditarik
        System.out.println("\nDaftar Gaji yang Sudah Ditarik:");
        boolean adaGajiDitarik = false;
        for (int i = 0; i < jumlahGuru; i++) {
            if (gajiDitarik[i]) {
                System.out.println(namaGuru[i] + " - Gaji: " + gajiGuru[i]);
                adaGajiDitarik = true;
            }
        }
        if (!adaGajiDitarik) {
            System.out.println("Tidak ada gaji yang sudah ditarik.");
        }

        sc.close();
    }
}
