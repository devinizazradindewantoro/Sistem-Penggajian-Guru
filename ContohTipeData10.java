import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ContohTipeData10 {
    public static void main(String [] args) {

        char golonganDarah = 'A';
        byte jarak = (byte) 250;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesmial = 0x10;

        System.out.println("Golongan darah\t\t\t\t\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t\t\t\t: " + jumlahPendudukDalamSatuDusun ) ;
        System.out.println("Suhu\t\t\t\t\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t\t\t\t\t: " + (float) berat) ;
        System.out.println("Saldo\t\t\t\t\t\t\t\t: " + saldo);
        System.out.println("Angka desimal                                                   : " + angkaDesmial);

    }
}
