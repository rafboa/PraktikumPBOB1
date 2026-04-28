// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Kelas MahasiswaSeminar – turunan Civitasakademika, memiliki NIM dan Dosen Wali

public class MahasiswaSeminar extends Civitasakademika {
    // Atribut tambahan untuk MahasiswaSeminar
    private String nim;
    private Dosen  dosenWali;

    // Konstruktor default
    public MahasiswaSeminar() {
        super();
        this.nim       = null;
        this.dosenWali = null;
    }   

    // Konstruktor dengan parameter NIM, Nama, dan Dosen Wali
    public MahasiswaSeminar(String nim, String nama, Dosen dosenWali) {
        super(nama);
        this.nim       = nim;
        this.dosenWali = dosenWali;
    }

    // Selektor untuk NIM
    public String getNim() { return nim; }

    // Selektor untuk Dosen Wali    
    public Dosen getDosenWali() { return dosenWali; }

    // Metode getNomor untuk MahasiswaSeminar mengembalikan NIM
    @Override
    public String getNomor() { return nim; }

    // Method untuk mengubah isian komponen dosenWali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // Method untuk menampilkan NIM, Nama, dan Nama Dosen Wali
    public void tampilDataMahasiswa() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Dosen Wali   : " + dosenWali.getNama());
    }
}
