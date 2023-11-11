import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.IOException;

public class SearchingKelompok {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        List<String> namaGuru = new ArrayList<>();
        namaGuru.add("Devin");
        namaGuru.add("Meisy");
        namaGuru.add("Rahmalia");
        namaGuru.add("Renald");
        namaGuru.add("Belqis");
        namaGuru.add("Aqila");

        List<String> mataPelajaran = new ArrayList<>();
        mataPelajaran.add("Bahasa Inggris");
        mataPelajaran.add("Akuntansi");
        mataPelajaran.add("Seni Budaya");
        mataPelajaran.add("Olahraga");
        mataPelajaran.add("Matematika");
        mataPelajaran.add("Bahasa Indonesia");

        List<Integer> kodeGuru = new ArrayList<>();
        kodeGuru.add(20040417);
        kodeGuru.add(20040607);
        kodeGuru.add(20050528);
        kodeGuru.add(20040416);
        kodeGuru.add(20040415);
        kodeGuru.add(20040414);

        for (int i = 0; i < namaGuru.size(); i++) {
            System.out.println("nama guru: " + namaGuru.get(i) + ", mata pelajaran: " + mataPelajaran.get(i) + ", kode guru: " + kodeGuru.get(i));


          System.out.println("SLIP GAJI");
            System.out.print("Nama guru: ");
                String name = sc.nextLine();
                System.out.print("NIP: ");
                String nip = sc.nextLine();
                System.out.print("Jabatan: ");
                String jabatan = sc.nextLine();
                System.out.print("Gaji pokok: ");
                int gajiaman = sc.nextInt();
                System.out.print("Pajak: ");
                int tax = sc.nextInt();

                int totalGaji = gajiaman - tax;

                File file = new File("slip_gaji_" + name + ".txt");
                FileWriter writer = new FileWriter(file);

                writer.write("Slip Gaji Guru");
                writer.write("\n");
                writer.write("Nama: " + name);
                writer.write("\n");
                writer.write("NIP: " + nip);
                writer.write("\n");
                writer.write("Jabatan: " + jabatan);
                writer.write("\n");
                writer.write("Gaji pokok: Rp" + gajiaman);
                writer.write("\n");
                writer.write("Total gaji: Rp" + totalGaji);
                writer.write("\n");

                writer.close();

                System.out.println("Slip gaji telah berhasil dicetak");

           
        }
        sc.close();
    }
}