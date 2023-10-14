import java.util.Scanner;

public class SistemPenggajianGuru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String statusPegawai;
        int penghasilan = 0, golongan = 0, gajiBersih, jumlahKaryawan;
        double pajak;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();


        int i = 0;
        while (i <= jumlahKaryawan) {
            System.out.println("Pilihan status pegawai - (PNS , HONORER)");
            String konfirmasi = sc.nextLine();
            System.out.println("Masukkan jabatan karyawan ke-" + (i=1) + ": ");
            statusPegawai = sc.nextLine();
            System.out.println("Masukkan penghasilan :");
            penghasilan = sc.nextInt();
            System.out.println("Masukkan golongan ( 1 atau 2 ) :");
            golongan = sc.nextInt();
            i++;

            if (statusPegawai.equalsIgnoreCase("PNS")) {
                if (golongan == 1) {
                    penghasilan = 4000000;
                    pajak = 0.005 * penghasilan;
                } else if (golongan == 2) {
                    penghasilan = 5000000;
                    pajak = 0.0005 * penghasilan;
                } else {
                    System.out.println("Golongan PNS yang anda masukkan salah.");
                }
            } else if (statusPegawai.equalsIgnoreCase("HONORER")) {
                if (golongan == 1) {
                    penghasilan = 1000000;
                    pajak = 0.002 * penghasilan;
                } else if (golongan == 2) {
                    penghasilan = 2500000;
                    pajak = 0.0015 * penghasilan;
                } else {
                    System.out.println("Golongan honorer yang anda masukkan salah.");
                }
            } else {
                System.out.println("Golongan yang anda masukkan salah");
                break;
            } 

            System.out.println(" MENGHITUNG GAJI KARYAWAN ");
            System.out.println(" ======================== ");
            System.out.println("Jabatan: " + statusPegawai);
            System.out.println("Pengahasilan: " + penghasilan);

             System.out.printf("gaji yang diterima adalah \n" + penghasilan );
        }
        //i++;
    }   
}
