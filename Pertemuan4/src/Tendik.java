import java.time.LocalDate;

public class Tendik extends Pegawai {

    /****************ATRIBUT***************/

     private String bidang; 
     private static final int BUP = 55;
     private static final double tunjangan = 0.01;

    /****************METHOD***************/

     //konstruktor tendik
     public Tendik(String NIP, String Nama, String TanggalLahir, String TanggalMulaiKerja, double GajiPokok, String bidang){
        super(NIP, Nama, TanggalLahir, TanggalMulaiKerja, GajiPokok);
        this.bidang = bidang;
    }

    //selektor untuk mengeluarkan bidang yang ditekuni tendik
    public String getBidang(){
        return bidang;
    }

    //selektor untuk mengeluarkan bonus tunjangan berdasarkan berapa lama telah bekerja
    public double getTunjangan() {
        return tunjangan * getMasaKerja().getYears() * getGajiPokok();
    }
    
    //selektor untuk mengeluarkan tanggal pensiun
    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }
    
    //mutator untuk mengubah bidang

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    //menampilkan informasi tendik
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + getMasaKerja().getYears() + " tahun");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun());
        System.out.println("Tunjangan: Rp " + getTunjangan());
    }
}
