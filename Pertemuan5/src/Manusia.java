import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {

    /***************ATRIBUT***************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    static DateTimeFormatter format = DateTimeFormatter.ofPattern("d-MM-yyyy", new Locale("id", "ID"));

    /***************METHOD***************/

    // konstruktor tanpa alamat
    public Manusia(String nama, String tglMulaiKerja, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, format);
        this.alamat = null;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // konstruktor dengan alamat
    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, format);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // selektor nama
    public String getNama() { return nama; }

    // selektor tglMulaiKerja
    public LocalDate getTglMulaiKerja() { return tglMulaiKerja; }

    // selektor alamat
    public String getAlamat() { return alamat; }

    // selektor pendapatan
    public double getPendapatan() { return pendapatan; }

    // selektor counter manusia (static)
    public static int getCounterMns() { return counterMns; }

    // mutator nama
    public void setNama(String nama) { this.nama = nama; }

    // mutator tglMulaiKerja
    public void setTglMulaiKerja(String tglMulaiKerja) {
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, format);
    }

    // mutator alamat
    public void setAlamat(String alamat) { this.alamat = alamat; }

    // mutator pendapatan
    public void setPendapatan(double pendapatan) { this.pendapatan = pendapatan; }

    // abstract method hitungMasaKerja (setiap subclass punya offset berbeda)
    public abstract int hitungMasaKerja();

    // mencetak semua informasi manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja.format(format));
        System.out.println("Alamat: " + (alamat != null ? alamat : "-"));
        System.out.printf("Pendapatan: Rp %.2f%n", pendapatan);
    }
}
