public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;

    // Konstruktor
    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

}