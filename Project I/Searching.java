import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String[] namaGuru = {"Devin", "Meisy", "Rahmalia", "Belqis", "Aqila"};
        int[] NIPGuru = {20040417, 20040418, 20040419, 20040420, 20040421};
        String[] jabatanGuru = {"PNS", "PNS", "Honorer", "Honorer", "PNS"};
        int[] golonganGuru = {1, 2, 1, 2, 1};
        int hasil = -1; // Inisialisasi hasil dengan nilai -1
        String namaGuruCari;

        // Input nama guru
        System.out.print("Masukkan nama guru: ");
        namaGuruCari = sc.nextLine();

        // Mencari data guru berdasarkan nama
        for (int i = 0; i < namaGuru.length; i++) {
            if (namaGuru[i].equalsIgnoreCase(namaGuruCari)) {
                hasil = i; // Simpan indeks tempat data ditemukan
                break;
            }
        }

        // Menampilkan hasil pencarian atau data keseluruhan jika tidak ditemukan
        if (hasil != -1) { //hasil tidak sama dengan -1
            System.out.println("Nama: " + namaGuru[hasil] + ", NIP: " + NIPGuru[hasil] + ", Jabatan: " + jabatanGuru[hasil] + ", Golongan: " + golonganGuru[hasil]);
        } else {
            System.out.println("Data guru dengan nama " + namaGuruCari + " tidak ditemukan. Menampilkan data keseluruhan:");
            for (int i = 0; i < namaGuru.length; i++) {
                System.out.println("Nama: " + namaGuru[i] + "( )" + NIPGuru[i] + "-" + jabatanGuru[i] + "Gol. " + golonganGuru[i]);
            }
        }
    }
}