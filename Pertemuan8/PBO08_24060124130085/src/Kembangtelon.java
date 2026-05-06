// NIM         : 24060124130085
// Nama        : Raffa Putra Nugroho
// Tanggal     : 5 Mei 2026
// Deskripsi   : Kelas anak Kembangtelon turunan Kucing 

public class Kembangtelon extends Kucing {

    // Konstruktor default
    public Kembangtelon() {
        super("Kembangtelon", 0.0);
    }

    // Konstruktor dengan nama dan bobot
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    // Method gerak
    @Override
    public void gerak() {
        System.out.println("Kembangtelon bergerak dengan melata.");
    }

    // Method bersuara
    @Override
    public void bersuara() {
        System.out.println("Kembangtelon bersuara dengan ngeong yang khas.");
    }

    // Method toString untuk menampilkan informasi Kembangtelon
    @Override
    public String toString() {
        return "Kembangtelon[nama=" + nama + ", bobot=" + bobot + " kg]";
    }
}
    

