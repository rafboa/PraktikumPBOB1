// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas induk abstrak Civitasakademika dengan atribut Nama dan metode getNomor

public abstract class Civitasakademika {

    // Atribut
    protected String nama;

    // Konstruktor
    public Civitasakademika() {
        this.nama = null;
    }

    // Konstruktor dengan parameter nama
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // Selektor 
    public String getNama() { 
        return nama; 
    }

    
    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode abstrak 
    public abstract String getNomor();
}
