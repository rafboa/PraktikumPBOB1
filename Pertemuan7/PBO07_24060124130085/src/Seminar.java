// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : mengelola registrasi peserta dengan array statis maksimal 100 orang

public class Seminar {
    

    // Atribut
    private static final int MAX_PESERTA = 100;
    Civitasakademika[] pesertas = new Civitasakademika[MAX_PESERTA]; 
    int banyakPeserta;

    // Konstruktor 
    public Seminar() {
        banyakPeserta = 0;
    }

    // Method countPeserta 
    public int countPeserta() {
        return banyakPeserta;
    }

    // Method registrasi 
    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta >= MAX_PESERTA) {
            System.out.println("Seminar sudah penuh! " + peserta.getNama() + " tidak bisa mendaftar.");
            return;
        }
        pesertas[banyakPeserta] = peserta;
        banyakPeserta++;
        System.out.println(peserta.getNama() + " berhasil diregistrasi.");
    }

    // Method  menampilkan daftar peserta seminar dengan format nomor dan nama
    public void tampilPeserta() {
        System.out.println("\n Daftar Peserta Seminar ");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.printf("%-20s | %s%n",
                pesertas[i].getNomor(), pesertas[i].getNama());
        }
    }

    // Method  menghitung peserta bertipe MahasiswaSeminar
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }
}
