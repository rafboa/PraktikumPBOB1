import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.Period;



public class Pegawai {

    /***************ATRIBUT***************/
    private String Nama;
    private String NIP;
    LocalDate TanggalLahir, TanggalMulaiKerja;
    private double GajiPokok;
    private String jenisPegawai;
    static DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    /***************METHOD***************/
    //konstruktor untuk membuat pegawai tanpa parameter
    public Pegawai() {
        Nama = null;
        NIP = null;
        TanggalLahir = null;
        TanggalMulaiKerja = null;
        GajiPokok = 0.0;
    }

    //konstruktor untuk membuat pegawai dengan parameter
    public Pegawai(String nama, String NIP, String TanggalLahir, String TanggalMulaiKerja, double GajiPokok) {
        this.Nama = nama;
        this.NIP = NIP;
        this.TanggalLahir = LocalDate.parse(TanggalLahir, format);
        this.TanggalMulaiKerja = LocalDate.parse(TanggalMulaiKerja, format);
        this.GajiPokok = GajiPokok;
    }

    //selektor untuk mengambil nilai nama pegawai
    public String getNama() {
        return Nama;
    }

    //selektor untuk mengambil nilai nip pegawai
    public String getNIP() {
        return NIP;
    }

    //selektor untuk mengambil nilai tanggal lahir pegawai
    public LocalDate getTanggalLahir() {
        return TanggalLahir;
    }       

    //selektor untuk mengambil nilai tanggal mulai kerja pegawai
    public LocalDate getTanggalMulaiKerja() {
        return TanggalMulaiKerja;
    }

    //selektor untuk mengambil nilai gaji pokok pegawai
    public double getGajiPokok() {
        return GajiPokok;
    }

    //selektor untuk mengambil nilai jenis pegawai
    public String getJenisPegawai() {
        return jenisPegawai;
    }

    //mutator untuk mengubah nilai jenis pegawai
    public void setJenisPegawai(String jenisPegawai) {
        this.jenisPegawai = jenisPegawai;
    }


    //mutator untuk mengubah nilai nama pegawai
    public void setNama(String nama) {
        this.Nama = nama;
    }   

    //mutator untuk mengubah nilai nip pegawai
    public void setNIP(String NIP) {            
        this.NIP = NIP;
    }

    //mutator untuk mengubah nilai tanggal lahir pegawai
    public void setTanggalLahir(LocalDate TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    //mutator untuk mengubah nilai tanggal mulai kerja pegawai
    public void setTanggalMulaiKerja(LocalDate TanggalMulaiKerja) {
        this.TanggalMulaiKerja = TanggalMulaiKerja;
    }

    //mutator untuk mengubah nilai gaji pokok pegawai
    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

     //mengeluarkan berapa lama pegawai telah bekerja   
    public Period getMasaKerja() {
        return Period.between(TanggalMulaiKerja, LocalDate.now());
    }

    //menampilkan informasi pegawai
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir.format(format));
        System.out.println("Tanggal Mulai Kerja: " + TanggalMulaiKerja.format(format));

    }
    


    
}
