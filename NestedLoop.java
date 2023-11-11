public class NestedLoop {

        public static void main(String[] args) {
            // Inisialisasi array untuk menyimpan data guru
            Guru[] guru = new Guru[3];
    
            // Isi data guru ke dalam array
            guru[0] = new Guru("Budi", 1000000);
            guru[1] = new Guru("Cici", 1200000);
            guru[2] = new Guru("Doni", 1500000);
    
            // Deklarasikan variabel untuk menyimpan total gaji guru
            int totalGaji = 0;
    
            // Loop luar untuk iterasi setiap guru
            for (Guru g : guru) {
                // Inisialisasi variabel untuk menyimpan total gaji per guru
                int totalGajiPerGuru = 0;
    
                // Loop dalam untuk iterasi setiap jenis tunjangan
                for (Tunjangan t : Tunjangan.values()) {
                    // Hitung total gaji per tunjangan
                    totalGajiPerGuru += g.getTunjangan(t);
                }
    
                // Tambahkan total gaji per guru ke total gaji keseluruhan
                totalGaji += totalGajiPerGuru;
            }
    
            // Print total gaji
            System.out.println("Total gaji guru: " + totalGaji);
        }
    }
    
    class Guru {
        private String nama;
        private int gajiPokok;
    
        public Guru(String nama, int gajiPokok) {
            this.nama = nama;
            this.gajiPokok = gajiPokok;
        }
    
        public String getNama() {
            return nama;
        }
    
        public int getGajiPokok() {
            return gajiPokok;
        }
    
        public int getTunjangan(Tunjangan tunjangan) {
            switch (tunjangan) {
                case TUNJANGAN_FUNGSIONAL:
                    return 100000;
                case TUNJANGAN_STRUKTUR:
                    return 200000;
                case TUNJANGAN_KESEJAHTERAAN:
                    return 300000;
                default:
                    return 0;
            }
        }
    }
    
    enum Tunjangan {
        TUNJANGAN_FUNGSIONAL,
        TUNJANGAN_STRUKTUR,
        TUNJANGAN_KESEJAHTERAAN
    }

