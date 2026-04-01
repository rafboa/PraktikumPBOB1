public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Matakuliah
        Matakuliah PBO = new Matakuliah("Pemrograman Berorientasi Objek", "PBO", 3);
        Matakuliah MBD = new Matakuliah("Manajemen Basis Data", "MBD", 3);
        
        // Membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("Citra", "234", "Informatika");
        
        // Membuat objek Dosen
        Dosen D1 = new Dosen("Andi", "123", "Informatika");
        
        // Membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        
        // Mengatur dosen wali dan kendaraan mahasiswa
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        
        // Menambahkan matakuliah ke mahasiswa
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        
        // Mencetak detail mahasiswa
        M1.printDetailMhs();
        
        // Mencetak jumlah matakuliah dan SKS
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSks());
    }
}