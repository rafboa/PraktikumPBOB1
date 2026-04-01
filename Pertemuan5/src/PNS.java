import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {

    /***************ATRIBUT***************/
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 5; // digit ke-14 NIM: 24060124130085

    /***************METHOD***************/

    // konstruktor dengan alamat
    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // konstruktor tanpa alamat
    public PNS(String nama, String tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // selektor nip
    public String getNip(){
         return nip; 
        }

    // selektor counter PNS (static)
    public static int getCounterPNS(){ 
        return counterPNS; 
    }

    // mutator nip
    public void setNip(String nip){ 
        this.nip = nip; 
    }

    //fungsi menghitung masa kerja PNS: (now - tgl_mulai_kerja) + A tahun
    @Override
    public int hitungMasaKerja() {
        int tahun = (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
        return tahun + A;
    }

    //fungsi menghitung pajak PNS: 10% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // mencetak semua informasi PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("NIP  : " + getNip() + "\n");
        System.out.printf("Masa Kerja : " + hitungMasaKerja() + " tahun\n");
        System.out.printf("Pajak : Rp %.2f\n", hitungPajak());
    }
}
