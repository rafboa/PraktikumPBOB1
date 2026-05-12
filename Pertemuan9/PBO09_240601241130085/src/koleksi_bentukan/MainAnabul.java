package koleksi_bentukan;

// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 6 Mei 2026
// Deskripsi   : Kelas MainAnabul untuk menguji kelas Piaraan dan Anabul dengan berbagai operasi menggunakan LinkedList.

public class MainAnabul {

    public static void main(String[] args) {
        // Membuat objek Piaraan
        Piaraan piaraan = new Piaraan();

        Anabul a1 = new Anjing("Locky");
        Anabul a2 = new Kucing("Minty", 4.5);
        Anabul a3 = new Burung("Swifty");
        Anabul a4 = new Anggora("Snowball", 3.2);
        Anabul a5 = new Kembangtelon("Pholly", 2.8);

        // Menambahkan anabul ke dalam piaraan
        piaraan.enqueueAnabul(a1);
        piaraan.enqueueAnabul(a2);
        piaraan.enqueueAnabul(a3);
        piaraan.enqueueAnabul(a4);
        piaraan.enqueueAnabul(a5);

        // Menampilkan daftar anabul
        System.out.println("Daftar Anabul:");
        piaraan.showAnabul();

        // Menampilkan jumlah kucing dalam piaraan
        System.out.println("\nJumlah kucing dalam piaraan: " + piaraan.countKucing());

        // Menampilkan jenis anabul dalam piaraan
        System.out.println("\nJenis Anabul dalam piaraan:");
        piaraan.showJenisAnabul();

        // Menampilkan total bobot semua kucing dalam piaraan
        System.out.println("\nTotal bobot semua kucing dalam piaraan: " + piaraan.bobotKucing() + " kg");

        // Mengecek apakah anabul tertentu ada dalam piaraan
        String namaCek = "Minty";
        Anabul cekAnabul = new Kucing(namaCek, 0.0);
        if (piaraan.isMember(cekAnabul)) {
            System.out.println("\n" + cekAnabul.getNama() + " ada dalam piaraan.");
        } else {
            System.out.println("\n" + cekAnabul.getNama() + " tidak ada dalam piaraan.");
        }

        // Menampilkan anabul pertama dalam piaraan 
        System.out.println("\nAnabul pertama dalam piaraan :");
        piaraan.getAnabul();

        // Mengeluarkan anabul pertama dari piaraan
        Anabul keluar = piaraan.dequeueAnabul();
        System.out.println("\nAnabul yang keluar: " + keluar.getNama());

        // Menampilkan daftar anabul setelah satu keluar
        System.out.println("\nDaftar Anabul setelah satu keluar:");
        piaraan.showAnabul();

        // Menampilkan sisa elemen dalam piaraan setelah satu keluar
        System.out.println("\nSisa elemen dalam piaraan: " + piaraan.getNbelm());

        

    }
}