public class Matakuliah {
    /***************ATRIBUT***************/
    private String namaMatkul;
    private String idMatkul;
    private int sks;

    /***************METHOD***************/

    //konstruktor untuk membuat matakuliah tanpa parameter
    public Matakuliah() {
        namaMatkul = null;
        idMatkul = null;
        sks = 0;
    }

    //konstruktor untuk membuat matakuliah dengan parameter
    public Matakuliah(String namaMatkul, String idMatkul, int sks) {
        this.namaMatkul = namaMatkul;
        this.idMatkul = idMatkul;
        this.sks = sks;
    }

    //selektor untuk mengambil nilai nama matkul
    public String getNamaMatkul() {
        return namaMatkul;
    }

    //selektor untuk mengambil nilai kode matkul
    public String getIdMatkul() {
        return idMatkul;
    }

    //selektor untuk mengambil nilai sks matkul
    public int getSks() {
        return sks;
    }

    //mutator untuk mengubah nilai nama matkul
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    //mutator untuk mengubah nilai kode matkul
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    //mutator untuk mengubah nilai sks matkul
    public void setSks(int sks) {
        this.sks = sks;
    }


}
