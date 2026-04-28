// Nama    : Raffa Putra Nugroho
// NIM     : 24060124130085
// Tanggal : 25 April 2026
// Deskripsi: Program demo asersi untuk validasi jari-jari lingkaran tidak boleh nol

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* jawab pertanyaan:
Yang kurang tepat pada program ini:
Asersi (assert) seharusnya digunakan hanya untuk debugging internal,
bukan untuk validasi input pengguna atau logika bisnis.
Karena assertions dinonaktifkan secara default saat runtime,
jika program dijalankan tanpa -enableassertions, validasi ini
sepenuhnya dilewati dan program tetap menghitung keliling = 0
tanpa peringatan apapun.

Solusi yang tepat: gunakan throw new IllegalArgumentException(...)
agar validasi selalu aktif tanpa tergantung flag JVM.
*/