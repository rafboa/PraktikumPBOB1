// NIM         : 24060124130085
// Nama        : Raffa Putra Nugroho
// Tanggal     : 5 Mei 2026
// Deskripsi   : Kelas generik Datum

public class Datum<T> {
    // Atribut isi bertipe generik
    private T isi;

    // Konstruktor default
    public Datum() {
        this.isi = null;
    }

    // Konstruktor dengan parameter
    public Datum(T isi) {
        this.isi = isi;
    }

    // Selektor untuk mengembalikan nilai isi
    public T getIsi() {
        return isi;
    }

    // Method untuk mengubah isi menjadi isibaru
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    // Method toString untuk menampilkan informasi Datum
    @Override
    public String toString() {
        return "Datum[isi=" + isi + "]";
    }   
    
}
