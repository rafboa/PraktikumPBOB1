// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas anak Kucing bergerak melata, bersuara meong

public class Kucing extends Anabul {
    // Atribut bobot
    protected double bobot;

    // Konstruktor default dan parameter
    public Kucing() {
        super("Kucing");
        this.bobot = 0.0;
    }   

    // Konstruktor dengan nama dan bobot
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Selektor untuk bobot
    public double getBobot() { return bobot; }

    // Method untuk mengubah bobot
    public void setBobot(double bobot) {
        this.bobot = bobot;
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

    // Method toString untuk menampilkan informasi Kucing
    @Override
    public String toString() {
        return "Kucing[nama=" + nama + ", bobot=" + bobot + "]";
    }
}
