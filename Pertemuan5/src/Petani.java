import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {

    /***************ATRIBUT***************/
    private String asalKota;
    private static int counterPetani = 0;
    private static final int C = 0; // digit ke-12 NIM: 24060124130085

    /***************METHOD***************/

    // konstruktor dengan alamat
    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // konstruktor tanpa alamat
    public Petani(String nama, String tglMulaiKerja, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // selektor asalKota
    public String getAsalKota() { 
        return asalKota; 
    }

    // selektor counter Petani
    public static int getCounterPetani() { 
        return counterPetani; 
    }

    // mutator asalKota
    public void setAsalKota(String asalKota) { 
        this.asalKota = asalKota; 
    }

    // menghitung masa kerja Petani: (now - tgl_mulai_kerja) + C tahun
    @Override
    public int hitungMasaKerja() {
        int tahun = (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
        return tahun + C;
    }

    // menghitung pajak Petani: 0 (bebas pajak)
    @Override
    public double hitungPajak() {
        return 0;
    }

    // mencetak semua informasi Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("Asal Kota : %s\n", asalKota);
        System.out.printf("Masa Kerja : %d tahun\n", hitungMasaKerja());
        System.out.printf("Pajak : Rp %.2f\n", hitungPajak());
    }
}
