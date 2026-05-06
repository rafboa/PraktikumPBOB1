// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 5 Mei 2026
// Deskripsi   : Kelas Main untuk menguji kelas Datum

public class MainDatum {
    public static void main(String[] args) {

        // Datum berisi Integer
        Datum<Integer> datumInt = new Datum<>(42);
        System.out.println("Datum Integer:");
        System.out.println("  Isi awal   : " + datumInt.getIsi());
        datumInt.setIsi(99);
        System.out.println("  Isi setelah setIsi(99) : " + datumInt.getIsi());

        System.out.println();

        // Datum berisi String
        Datum<String> datumStr = new Datum<>("Halo Dunia");
        System.out.println("Datum String:");
        System.out.println("  Isi awal   : " + datumStr.getIsi());
        datumStr.setIsi("Generik itu keren!");
        System.out.println("  Isi setelah setIsi : " + datumStr.getIsi());

        System.out.println();

        // Datum berisi objek Anabul (Kucing Anggora)
        Anggora anggora = new Anggora("Luna", 3.5);
        Datum<Anabul> datumAnabul = new Datum<>(anggora);
        System.out.println("Datum Anabul (Anggora):");
        System.out.println("  Isi awal   : " + datumAnabul.getIsi());
        datumAnabul.getIsi().bersuara();

        // Ganti isi dengan Anjing
        Anjing anjing = new Anjing("Brownie");
        datumAnabul.setIsi(anjing);
        System.out.println("  Isi setelah setIsi (Anjing) : " + datumAnabul.getIsi());
        datumAnabul.getIsi().bersuara();

        System.out.println();

        // Datum berisi objek Kucing (Kembangtelon)
        Datum<Kucing> datumKucing = new Datum<>(new Kembangtelon("Telo", 4.2));
        System.out.println("Datum Kucing (Kembangtelon):");
        System.out.println("  Isi   : " + datumKucing.getIsi());
        System.out.println("  Bobot : " + datumKucing.getIsi().getBobot() + " kg");
        datumKucing.getIsi().gerak();
    }
}
