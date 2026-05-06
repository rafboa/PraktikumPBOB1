// Nama         : Raffa Putra Nugroho
// NIM          : 24060124130085
// Tanggal      : 5 Mei 2026
// Deskripsi    : Kelas OperatorGenerik sebagai kelas untuk Operasi prosedur pada kelas generik Datum

public class OperatorGenerik {

    // Metode generik Tukar untuk menukar isi dua Datum menggunakan array sebagai referensi
    public static <T> void Tukar(T[] a, T[] b) {
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    // Metode generik Bobot2 untuk menjumlahkan bobot dua objek keturunan Kucing
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
    
}
