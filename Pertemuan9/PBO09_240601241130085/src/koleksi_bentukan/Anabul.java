package koleksi_bentukan;
// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 05 Mei 2026
// Deskripsi   : Kelas induk abstrak Anabul (hewan peliharaan)

public abstract class Anabul {
    // Atribut 
    protected String nama;
    protected String panggilan; // nama panggilan hewan

    // Konstruktor default 
    public Anabul() {
        this.nama = null;
        this.panggilan = null;
    }

    // Konstruktor dengan parameter panggilan saja
    public Anabul(String panggilan) {
        this.nama = panggilan;
        this.panggilan = panggilan;
    }

    // Selektor untuk nama
    public String getNama() {
        return nama;
    }

    // Mutator untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode abstrak untuk gerak dan bersuara
    public abstract void gerak();
    public abstract void bersuara();


}
