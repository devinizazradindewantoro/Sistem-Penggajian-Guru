import java.util.Scanner;
public class KehadiranGuru {
    public static void main(String[] args) {
        int[][] kehadiran = new int[5][4];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < kehadiran.length; i++) {
            System.out.println("Masukkan kehadiran untuk guru ke-" + (i + 1) + ":");
            for (int j = 0; j < kehadiran[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                kehadiran[i][j] = input.nextInt();
            }
        }

        int totalKehadiran[] = new int[5];
        for (int i = 0; i < kehadiran.length; i++) {
            for (int j = 0; j < kehadiran[i].length; j++) {
                totalKehadiran[i] += kehadiran[i][j];
            }
        }

        for (int i = 0; i < kehadiran.length; i++) {
            System.out.print("Kehadiran guru ke-" + (i + 1) + " pada minggu ke-: ");
            for (int j = 0; j < kehadiran[i].length; j++) {
                System.out.print((j + 1) + "=" + kehadiran[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < totalKehadiran.length; i++) {
            System.out.println("Total kehadiran Bulan untuk guru ke-" + (i + 1) + ": " + totalKehadiran[i]);
        }
    }
}