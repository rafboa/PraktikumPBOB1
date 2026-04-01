
public class Dosen {
    /***************ATRIBUT***************/
    private String namaDosen;
    private String NIP;
    private String prodi;

    /***************METHOD***************/

    //konstruktor untuk membuat dosen tanpa parameter
    public Dosen() {
        namaDosen = null;
        NIP = null;
        prodi = null;
    }

    //konstruktor untuk membuat dosen
    public Dosen(String namaDosen, String NIP, String prodi) {
        this.namaDosen = namaDosen;
        this.NIP = NIP;
        this.prodi = prodi;
    }

    //selektor untuk mengambil nilai nama dosen
    public String getNama() {
        return namaDosen;
    }

    //selektor untuk mengambil nilai nip dosen
    public String getNip() {
        return NIP;
    }

    //selektor untuk mengambil nilai prodi dosen
    public String getProdi() {
        return prodi;
    }

    //mutator untuk mengubah nilai nama dosen
    public void setNama(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    //mutator untuk mengubah nilai nip dosen
    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    //mutator untuk mengubah nilai prodi dosen
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}