// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 05 Mei 2026
// Deskripsi   : Kelas induk abstrak Anabul (hewan peliharaan)

public abstract class Anabul {
    // Atribut nama 
    protected String nama;

    // Konstruktor default 
    public Anabul() {
        this.nama = null;
    }

    // Konstruktor dengan parameter nama 
    public Anabul(String nama) {
        this.nama = nama;
    }


    // Selektor untuk nama
    public String getNama() { return nama; }

    // Metode abstrak untuk gerak dan bersuara
    public abstract void gerak();
    public abstract void bersuara();

    // Method toString untuk menampilkan informasi Anabul
    @Override
    public String toString() {
        return "Anabul[nama=" + nama + "]";
    }
}
