// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas anak Kucing – bergerak melata, bersuara meong

public class Kucing extends Anabul {

    // Konstruktor default dan parameter
    public Kucing() {
        super("Kucing");
    }   

    // Konstruktor dengan nama
    public Kucing(String nama) {
        super(nama);
    }

    // Method gerak
    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan MELATA.");
    }

    // Method bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: MEONG!");
    }
}
