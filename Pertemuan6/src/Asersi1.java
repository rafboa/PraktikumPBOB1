
// Nama    : Raffa Putra Nugroho
// NIM     : 24060124130085
// Tanggal : 25 April 2026
// Deskripsi: Program untuk menunjukkan penggunaan dasar asersi di Java
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

/* jawab pertanyaan:
assert(x<0) akan GAGAL karena x=0, bukan negatif.
Saat dijalankan dengan -enableassertions, program akan
melempar AssertionError dengan pesan "ada kesalahan kode".
Saat dijalankan tanpa -enableassertions, assert diabaikan
dan program mencetak "x bilangan negatif" (salah secara logika).*/