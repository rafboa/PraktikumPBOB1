// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Program utama simulasi registrasi Seminar dengan Civitas Akademika (Dosen dan Mahasiswa)

public class MainSeminar {
    public static void main(String[] args) {

        // Membuat 2 objek Dosen
        Dosen d1 = new Dosen("198501012010011001", "Dr. Budi Santoso");
        Dosen d2 = new Dosen("197803152005012002", "Dr. Ani Lestari");

        // Membuat 5 objek MahasiswaSeminar
        MahasiswaSeminar m1 = new MahasiswaSeminar("2301001", "Andi Pratama", d1);
        MahasiswaSeminar m2 = new MahasiswaSeminar("2301002", "Bella Cahya", d1);
        MahasiswaSeminar m3 = new MahasiswaSeminar("2301003", "Candra Wijaya", d2);
        MahasiswaSeminar m4 = new MahasiswaSeminar("2301004", "Dita Sari", d2);
        MahasiswaSeminar m5 = new MahasiswaSeminar("2301005", "Eko Prasetyo", null);

        // Memasang nama dosen wali untuk mahasiswa yang belum memiliki dosen wali
        m5.setWali(d1);

        // Buat objek Seminar
        Seminar seminar = new Seminar();

        // Meregistrasi ketujuh peserta
        System.out.println(" Registrasi Peserta Seminar ");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // Menghitung total peserta seminar
        System.out.println("\nTotal peserta   : " + seminar.countPeserta());

        // Menampilkan daftar peserta seminar
        seminar.tampilPeserta();

        // Menghitung jumlah peserta bertipe MahasiswaSeminar
        System.out.println("\nJumlah mahasiswa: " + seminar.countMahasiswa());

        // Mengatur dosen wali untuk setiap mahasiswa
        System.out.println("\n Set Dosen Wali ");
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);
        System.out.println("Dosen wali berhasil di-set.");

        // Menampilkan data setiap mahasiswa beserta dosen walinya
        System.out.println("\n Data Mahasiswa ");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
