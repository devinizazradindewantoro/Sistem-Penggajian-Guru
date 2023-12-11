public class ArrayKelompok {

    public static void main(String[] args) {

        String jabatanGuru[] = {"PNS", "Honorer"};
        int golonganGuru[][] = {{1, 2}, {1, 2}};
        int gajiGuru[][] = {{4000000, 5000000}, {1000000, 2500000}};

        for (int i = 0; i < jabatanGuru.length; i++) {
            System.out.println("Jabatan: " + jabatanGuru[i]);

            for (int j = 0; j < golonganGuru[i].length; j++) {
                System.out.println("Golongan: " + golonganGuru[i][j]);
                System.out.println("Gaji: " + gajiGuru[i][j]);
            }
        }
    }
}