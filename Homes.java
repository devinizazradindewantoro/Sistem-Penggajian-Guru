import java.util.Scanner;

public class Homes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Login
        String[] usernames = {"Devin", "Meisy", "Rahmalia"};
        String[] passwords = {"10", "19", "27"};
        
        // Login
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (username.equals(usernames) && password.equals(passwords)) {
            System.out.println("Login berhasil!");
            // Lanjutkan ke halaman berikutnya setelah login
        } else {
            System.out.println("Nama pengguna atau kata sandi salah.");
            System.out.println("Kembali ke halaman login.");
            // Kode untuk mengarahkan kembali ke halaman login
        
             
        }
        //Deklarasi Variabel
        String namaPegawai, jabatan ;
        int golongan, NIK, bulan, tahun;
        double gajiPokok;
        double tunjanganTransportasi;
        double uangMakan;
        double potongan;
        double gajiTotal;

        //Input Data
        System.out.print("masukkan nama: ");
        namaPegawai = input.nextLine();

        System.out.print("masukkan jabatan: ");
        jabatan = input.nextLine();

        System.out.print("masukkan golongan: ");
        golongan = input.nextInt();

        System.out.print("masukkan NIK: ");
        NIK = input.nextInt();

        System.out.print("masukkan bulan: ");
        bulan = input.nextInt();

        System.out.print("masukkan tahun: ");
        tahun = input.nextInt();

        //Hitung gaji
        switch(golongan){
            case 1 :
            gajiPokok = 1000000;
            break;

            case 2 :
            gajiPokok = 2000000;
            break;

            case 3 :
            gajiPokok = 3000000;
            break;

            case 4 :
            gajiPokok = 4000000;
            break;

            case 5 :
            gajiPokok = 5000000;
            break;

            default:
                System.out.println("Golongan guru tidak valid!");
                return;
        }

            //hitung tunjangan transportasi
            tunjanganTransportasi = gajiPokok * 10;
            
            //hitung uang makan
            uangMakan = gajiPokok * 30;

            //hitung potongan
            potongan = gajiPokok - 20;

            // Hitung gaji total
            gajiTotal = gajiPokok + tunjanganTransportasi + potongan + uangMakan;

            // Tampilkan slip gaji
            System.out.println("| ------------------------------------------------ ");
            System.out.println("| ********************SLIP GAJI*******************");
            System.out.println("|   Nama\t: " + namaPegawai        );
            System.out.println("|   NIK\t\t: " + NIK                         );
            System.out.println("|   Jabatan\t: "  + jabatan                );
            System.out.println("|   Bulan\t: "  + bulan                    );
            System.out.println("|   Tahun\t: "  + tahun                    );
            System.out.println("| ________________________________________________ ");
            System.out.println("|   Tunjangan Transportasi\t: " + tunjanganTransportasi );
            System.out.println("|   Potongan\t\t\t: " + potongan               );
            System.out.println("|   Uang Makan\t\t\t: " + uangMakan            );
            System.out.println("|   Gaji Total\t\t\t: " + gajiTotal                 );
            System.out.println("| ------------------------------------------------ ");
    }
    
}
