// Nama    : Raffa Putra Nugroho
// NIM     : 24060124130085
// Tanggal : 25 April 2026
// Deskripsi: Kelas eksepsi buatan sendiri yang menolak angka 13 sebagai input

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
