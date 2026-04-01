import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {

    /***************ATRIBUT***************/
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 8; // digit ke-13 NIM: 24060124130085

    /***************METHOD***************/

    // konstruktor dengan alamat
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // konstruktor tanpa alamat
    public Pengusaha(String nama, String tglMulaiKerja, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // selektor npwp
    public String getNpwp() { return npwp; }

    // selektor counter Pengusaha (static)
    public static int getCounterPengusaha() { return counterPengusaha; }

    // mutator npwp
    public void setNpwp(String npwp) { this.npwp = npwp; }

    // menghitung masa kerja Pengusaha: (now - tgl_mulai_kerja) + B tahun
    @Override
    public int hitungMasaKerja() {
        int tahun = (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
        return tahun + B;
    }

    // menghitung pajak Pengusaha: 15% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // mencetak semua informasi Pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("NPWP  : %s\n", npwp);
        System.out.printf("Masa Kerja : %d tahun\n", hitungMasaKerja());
        System.out.printf("Pajak : Rp %.2f\n", hitungPajak());
    }
}
