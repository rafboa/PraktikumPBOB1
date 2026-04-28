// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas Dosen – turunan Civitasakademika, memiliki komponen NIP

public class Dosen extends Civitasakademika {

    // Atribut tambahan untuk Dosen
    private String nip;

    // Konstruktor default dan parameter
    public Dosen() {
        super();
        this.nip = null;
    }

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    // Selektor untuk NIP
    public String getNip() { return nip; }

    // Metode getNomor untuk Dosen mengembalikan NIP
    @Override
    public String getNomor() { return nip; }
    
}
