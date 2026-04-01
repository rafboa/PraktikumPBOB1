public class Dosen extends Pegawai
{
    /***************ATRIBUT***************/

    private String fakultas;

    /***************METHOD***************/
    
    //konstruktor dosen
    public Dosen(String NIP, String Nama, String TanggalLahir, String TanggalMulaiKerja, double GajiPokok, String fakultas)
    {
        super(NIP, Nama, TanggalLahir, TanggalMulaiKerja, GajiPokok);
        this.fakultas = fakultas;
    }

    //selektor untuk mengeluarkan fakultas
    public String getFakultas() { 
        return fakultas;
    }

    //mutator untuk mengubah fakultas
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }

    //menampilkan fakultas dan informasi dari parent
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
    
}
