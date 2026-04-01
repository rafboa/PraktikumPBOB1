public class Kendaraan {
    
    /***************ATRIBUT***************/
    private String noPlat;
    private String jenis;

    /***************METHOD***************/

    //konstruktor untuk membuat kendaraan tanpa parameter
    public Kendaraan() {
        noPlat = null;
        jenis = null;
    }

    //konstruktor untuk membuat kendaraan dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        if (jenis == "motor" || jenis == "mobil" || jenis == "" || jenis == "Motor" || jenis == "Mobil" ||
                jenis == "MOTOR" || jenis == "MOBIL") {
            this.jenis = jenis;
            this.noPlat = noPlat;
        } else {
            System.out.println("jenis tidak dikenal");
        }
    }

    //selektor untuk mengambil nilai no plat
    public String getNoPlat() {
        return noPlat;
    }

    //selektor untuk mengambil nilai jenis kendaraan
    public String getJenis() {
        return jenis;
    }

    //mutator untuk mengubah nilai no plat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    //mutator untuk mengubah nilai jenis kendaraan
    public void setJenis(String jenis) {
        if (jenis == "motor" || jenis == "mobil" || jenis == "Motor" || jenis == "Mobil" ||
                jenis == "MOTOR" || jenis == "MOBIL") {
        this.jenis = jenis;
        }
    }
}
