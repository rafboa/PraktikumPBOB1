import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen
{
    /***************ATRIBUT***************/
    private String NIDK;
    private LocalDate tglBerakhirKontrak;
    private static final double tunjangan = 0.025;


    /***************METHOD***************/
    //konstruktor dosen tamu
    public DosenTamu(String NIP, String Nama, String TanggalLahir,
                 String TanggalMulaiKerja, String NIDK,
                 String fakultas, String tglBerakhirKontrak, 
                 double GajiPokok) { 
    super(NIP, Nama, TanggalLahir, TanggalMulaiKerja, GajiPokok, fakultas);
    this.NIDK = NIDK;
    this.tglBerakhirKontrak = LocalDate.parse(tglBerakhirKontrak);
}

    //selektor untuk mengeluarkan berapa bulan lagi dosen tamu akan berakhir
    public double getMasaKontrakBerakhir() {
        return ChronoUnit.MONTHS.between(LocalDate.now(), this.tglBerakhirKontrak);
    }

    //selektor untuk mengeluarkan nidk dari dosen tamu
    public String getNIDK() {
        return NIDK;
    }

    //selektor untuk mengeluarkan berapa banyak tunjangan dari dosen tamu
    public double getTunjangan() {
        return tunjangan * getGajiPokok();
    }

    //selektor untuk mengeluarkan date dari tanggal berakhir dosen tamu
    public LocalDate getTglBerakhirKontrak() {
        return tglBerakhirKontrak;
    }


    //mutator untuk mengubah tanggal berakhir kontrak
    public void setTglBerakhirKontrak(String tglBerakhirKontrak) {
        this.tglBerakhirKontrak = LocalDate.parse(tglBerakhirKontrak);
    }

    
    @Override
    //menampilkan informasi dosen tamu
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Masa Kontrak berakhir: " + getMasaKontrakBerakhir() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + getTglBerakhirKontrak());
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println("Tunjangan: Rp " + getTunjangan());
    }
    
}
