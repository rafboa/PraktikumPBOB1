import java.util.ArrayList;

public class Mahasiswa {

    /***************ATRIBUT***************/
    private String namaMahasiswa;
    private String NIM;
    private String prodi;
    private ArrayList<Matakuliah> listMatkul; //arraylist statik ukuran 50
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    /***************METHOD***************/

    //konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    //konstruktor untuk membuat mahasiswa dengan parameter
    public Mahasiswa(String namaMahasiswa, String NIM, String prodi) {
        this.namaMahasiswa = namaMahasiswa;
        this.NIM = NIM;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    //selektor untuk mengambil nilai nama mahasiswa
    public String getNama() {
        return namaMahasiswa;
    }

    //selektor untuk mengambil nilai nim mahasiswa
    public String getNim() {
        return NIM;
    }

    //selektor untuk mengambil nilai prodi mahasiswa
    public String getProdi() {
        return prodi;
    }

    //selektor untuk mengambil nilai dosen wali mahasiswa
    public Dosen getDosenWali() {
        return dosenwali;
    }

    //selektor untuk mengambil nilai kendaraan mahasiswa
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //selektor untuk mengambil nilai jumlah sks
    public int getJumlahSks() {
        return hitungJumlahSks();
    }

     //selektor untuk mengambil nilai jumlah matkul
    public int getJumlahMatkul() {
        return hitungJumlahMatkul();
    }

    //mutator untuk mengubah nilai nama mahasiswa
    public void setNama(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    //mutator untuk mengubah nilai nim mahasiswa
    public void setNim(String NIM) {
        this.NIM = NIM;
    }

    //mutator untuk mengubah nilai prodi mahasiswa
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    //mutator untuk mengubah nilai dosen wali mahasiswa
    public void setDosenWali(Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }

    //mutator untuk mengubah nilai kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //method untuk menghitung jumlah SKS mahasiswa
    public int hitungJumlahSks() {
        int totalSks = 0;
        for (Matakuliah matkul : listMatkul) {
            totalSks += matkul.getSks();
        }
        return totalSks;
    }

    //method untuk menghitung jumlah matkul mahasiswa
    public int hitungJumlahMatkul() {
        return listMatkul.size();
    }

    //method untuk menambahkan matakuliah ke dalam list matkul mahasiswa
    public void addMatkul(Matakuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    

    // Menampilkan data dasar mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Prodi: " + prodi);
    }

    // Menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Prodi: " + prodi);
        System.out.println("Nama Dosen Wali: " + dosenwali.getNama());

        int i;

        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Nama Mata Kuliah ke-" + (i + 1) + ": " + listMatkul.get(i).getNamaMatkul());
        }

        System.out.println("No Plat: " + kendaraan.getNoPlat());
    }

}
