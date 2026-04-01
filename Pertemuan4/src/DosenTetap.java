import java.time.LocalDate;

public class DosenTetap extends Dosen {
    
    /***************ATRIBUT***************/
    private String NIDN;
    private static final int BUP = 65;
    private static final double tunjangan = 0.02;

    /***************METHOD***************/

    //konstruktor dosen tetap
    public DosenTetap(String NIP, String Nama, String TanggalLahir, 
        String TanggalMulaiKerja, String NIDN, String fakultas, 
        double GajiPokok) { 
    super(NIP, Nama, TanggalLahir, TanggalMulaiKerja, GajiPokok, fakultas);
    this.NIDN = NIDN;
}

    //selektor untuk mengeluarkan nidn dari dosen tetap
    public String getNIDN() {
        return NIDN;
    }

    //selektor untuk mengeluarkan berapa banyak tunjangan dari dosen tetap
    public double getTunjangan(){
        return tunjangan * getMasaKerja().getYears() * getGajiPokok();
    }

    //selektor untuk mengeluarkan tanggal pensiun
    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    //menampilkan informasi dosen tetap
    @Override
    public void printInfo() {   
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Masa Kerja: " + getMasaKerja().getYears() + " tahun");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun());
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println("Tunjangan: Rp " + getTunjangan());
    }
    
}
