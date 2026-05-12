package koleksi_bentukan;
// NIM         : 24060124130085
// Nama        : Raffa Putra Nugroho
// Tanggal     : 5 Mei 2026
// Deskripsi   : Kelas Anggora turunan Kucing

public class Anggora extends Kucing {

    // Konstruktor default
    public Anggora() {
        super("Anggora", 0.0);
    }

    // Konstruktor dengan nama dan bobot
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    // Method gerak
    @Override
    public void gerak() {
        System.out.println("Anggora bergerak dengan lincah.");
    }

    // Method bersuara
    @Override
    public void bersuara() {
        System.out.println("Anggora bersuara dengan meow yang lembut.");
    }

    // Method toString untuk menampilkan informasi Anggora
    @Override
    public String toString() {
        return "Anggora[nama=" + nama + ", bobot=" + bobot + " kg]";
    }
}
