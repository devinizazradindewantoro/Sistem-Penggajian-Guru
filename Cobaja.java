import java.util.Scanner;

public class Cobaja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String nama;
        int golongan;
        int jamKerja;
        double upahPerJam;
        double gajiPokok;
        double tunjangan;
        double gajiLembur;
        double gajiTotal;

        // Input data
        System.out.println("Masukkan nama guru: ");
        nama = input.nextLine();

        System.out.println("Masukkan golongan guru: ");
        golongan = input.nextInt();

        System.out.println("Masukkan jumlah jam kerja guru: ");
        jamKerja = input.nextInt();

        // Hitung upah per jam
        switch (golongan) {
            case 1:
                upahPerJam = 30000;
                break;
            case 2:
                upahPerJam = 35000;
                break;
            case 3:
                upahPerJam = 40000;
                break;
            case 4:
                upahPerJam = 45000;
                gajiLembur = 90000;
                break;
            default:
                System.out.println("Golongan guru tidak valid!");
                return;
        }

        // Hitung gaji pokok
        gajiPokok = upahPerJam * 30;

        // Hitung tunjangan
        tunjangan = 0.1 * gajiPokok;

        // Hitung gaji lembur
        if (jamKerja > 173) {
            gajiLembur = (jamKerja - 173) * upahPerJam * 1.5;
        } else {
            gajiLembur = 90000;
        }

        // Hitung gaji total
        gajiTotal = gajiPokok + tunjangan + gajiLembur;

        // Tampilkan slip gaji
        System.out.println("n/________________________________");
        System.out.println("*****SLIP GAJI*****"               );
        System.out.println("Nama guru: " + nama                  );
        System.out.println("Golongan guru: " + golongan          );
        System.out.println("Jumlah jam kerja: " + jamKerja       );
        System.out.println("Upah per jam: " + upahPerJam         );
        System.out.println("Gaji pokok: " + gajiPokok            );
        System.out.println("Tunjangan: " + tunjangan             );
        System.out.println("Gaji lembur: " + gajiLembur          );
        System.out.println("Gaji total: " + gajiTotal            );
        System.out.println("__________________________________");
    }
}
    

