import java.util.Scanner; 

public class Segitiga10{

    public static void main(String[] args) {
        Scanner dev = new Scanner (System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas: ");
        alas = dev.nextInt();
        System.out.print("Masukkan tinggi:  ");
        tinggi = dev.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);


    }
}


    

