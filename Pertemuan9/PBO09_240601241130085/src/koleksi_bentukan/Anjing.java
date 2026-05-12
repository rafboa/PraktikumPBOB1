package koleksi_bentukan;
// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas anak Anjing bergerak melata, bersuara guk-guk

public class Anjing extends Anabul {

    // Konstruktor default 
    public Anjing() {
        super("Anjing");
    }

    // Konstruktor dengan nama
    public Anjing(String nama) {
        super(nama);
    }

    // Method gerak
    @Override
    public void gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan MELATA.");
    }

    // Method bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) bersuara: GUK-GUK!");
    }

    // Method toString untuk menampilkan informasi Anjing
    @Override
    public String toString() {
        return "Anjing[nama=" + nama + "]";
    }
}
