public class MManusia {
    public static void main(String[] args) {

        // Membuat objek PNS p1 (dengan alamat)
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");

        // Membuat objek Pengusaha pe1 (dengan alamat)
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5");

        // Membuat objek Petani pt1 (dengan alamat)
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");

        // Membuat objek PNS p2 (tanpa alamat, lalu di-set)
        PNS p2 = new PNS("Panji", "01-04-2010", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Menampilkan jumlah counter setiap jenis
        System.out.println("Jumlah Manusia    = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS        = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha  = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani     = " + Petani.getCounterPetani());

        // Menampilkan pajak masing-masing
        System.out.println("\nPajak PNS p1         = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1  = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1     = " + pt1.hitungPajak());

        // Menampilkan masa kerja masing-masing
        System.out.println("\nMasa Kerja p1   = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1  = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1  = " + pt1.hitungMasaKerja());

        // Mencetak info lengkap masing-masing objek
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
