public class MPegawai {
    public static void main(String[] args) throws Exception {

        System.out.println("\n=== DATA DOSEN TETAP ===");
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap(
    "9545647549", "Ahmad Wijaya", "7 Agustus 1965", 
    "1 Januari 2020", "212212121", "STEI-Komputasi", 5000000.0
);
        dosenTetap.printInfo();

        System.out.println("\n=== DATA DOSEN TAMU ===");
        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
    "9545647550", "Siti Nurhaliza", "10 Oktober 1975", 
    "1 Agustus 2023", "212212122", "STEI-Rekayasa", "2027-01-01", 3000000.0
);
        dosenTamu.printInfo();
    }
}
