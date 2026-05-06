// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas anak Burung bergerak terbang, bersuara cuit

public class Burung extends Anabul {

    // Konstruktor default dan parameter
    public Burung() {
        super("Burung");
    }

    // Konstruktor dengan nama
    public Burung(String nama) {
        super(nama);
    }

    // Method gerak
    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak dengan TERBANG.");
    }

    // Method bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara: CUIT!");
    }

    // Method toString untuk menampilkan informasi Burung
    @Override
    public String toString() {
        return "Burung[nama=" + nama + "]";
    }
}
