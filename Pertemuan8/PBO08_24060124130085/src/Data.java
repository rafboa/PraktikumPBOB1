// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 5 Mei 2026
// Deskripsi   : Kelas generik Data

public class Data<T> {

    // Atribut ruang sebagai array untuk menyimpan elemen generik, banyak untuk menghitung jumlah elemen efektif, dan KAPASITAS sebagai batas maksimum
    private Object[] ruang;
    private int banyak;
    private static final int KAPASITAS = 100;

    // Konstruktor
    public Data() {
        ruang  = new Object[KAPASITAS];
        banyak = 0;
    }

    // Method Mengisi elemen pada posisi pos (1..100) dengan nilai obj
    public void setIsi(int pos, T obj) {
        if (pos < 1 || pos > KAPASITAS) {
            System.out.println("  [setIsi] Posisi " + pos + " di luar rentang (1-100).");
            return;
        }
        ruang[pos - 1] = obj;
        if (pos > banyak) {
            banyak = pos;
        }
    }

    // Method untuk Mengembalikan elemen generik pada posisi pos (1..100)
    @SuppressWarnings("unchecked")
    public T getIsi(int pos) {
        if (pos < 1 || pos > KAPASITAS) {
            System.out.println("  [getIsi] Posisi " + pos + " di luar rentang (1-100).");
            return null;
        }
        return (T) ruang[pos - 1];
    }

 
    // Selektor untuk mengembalikan banyaknya elemen efektif
    public int getSize() {
        return banyak;
    }
}
