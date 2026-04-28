// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Polimorfisme Ad Hoc Overloading, kelas Mahasiswa dengan overloading metode dan konstruktor

public class Mahasiswa {

    // Atribut
    private String nim;
    private String nama;
    private String programStudi;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim          = "-999";
        this.nama         = "n/a";
        this.programStudi = "n/a";
    }

    // Konstruktor tiga parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
    }

    // Konstruktor copy
    public Mahasiswa(Mahasiswa other) {
        this.nim          = other.nim;
        this.nama         = other.nama;
        this.programStudi = other.programStudi;
    }

    // Getter & Setter dasar
    public String getNim()          { return nim; }
    public String getNama()         { return nama; }
    public String getProgramStudi() { return programStudi; }

    public void setNim(String nim)   { this.nim  = nim; }
    public void setNama(String nama) { this.nama = nama; }

    // Method setProgramStudi overloading, tiga varian
    // Varian 1: tanpa parameter -> null
    public void setProgramStudi() {
        this.programStudi = null;
    }

    // Varian 2: satu parameter String
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    // Varian 3: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa other) {
        this.programStudi = other.programStudi;
    }

    // Method Tampil data
    public void tampilData() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Program Studi: " + programStudi);
    }

    // aplikasi semua varian
    public static void main(String[] args) {

        // Konstruktor default         
        Mahasiswa m0 = new Mahasiswa();
        m0.tampilData();

        // Konstruktor 3 parameter        
        Mahasiswa m1 = new Mahasiswa("2301001", "Andi Pratama", "Informatika");
        m1.tampilData();

        // Konstruktor kloning         
        Mahasiswa m2 = new Mahasiswa(m1);
        m2.setNim("2301002");
        m2.setNama("Budi Santoso");
        m2.tampilData();

        //Aplikasi tiga varian setProgramStudi       
        // Varian 1 : tanpa parameter
        Mahasiswa mA = new Mahasiswa("2301003", "Citra Dewi", "Sistem Informasi");
        mA.setProgramStudi();          // → null
        System.out.print("Varian 1 (tanpa param): ");
        mA.tampilData();

        // Varian 2 : satu parameter String
        Mahasiswa mB = new Mahasiswa("2301004", "Dedi Kurniawan", "n/a");
        mB.setProgramStudi("Teknik Elektro");
        System.out.print("Varian 2 (string param): ");
        mB.tampilData();

        // Varian 3 : satu parameter objek Mahasiswa
        Mahasiswa mC = new Mahasiswa("2301005", "Eka Putri", "n/a");
        mC.setProgramStudi(m1);        // salin dari m1 → "Informatika"
        System.out.print("Varian 3 (objek param): ");
        mC.tampilData();
    }
}
