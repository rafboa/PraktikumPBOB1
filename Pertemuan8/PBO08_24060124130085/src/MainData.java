// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085 
// Tanggal     : 5 Mei 2026
// Deskripsi   : Kelas MainData untuk menguji kelas Data

public class MainData {
    public static void main(String[] args) throws Exception {

        // Data berisi Integer
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);
        dataInt.setIsi(3, 30);
        System.out.println("Data<Integer>:");
        System.out.println("  getSize() = " + dataInt.getSize());
        for (int i = 1; i <= dataInt.getSize(); i++) {
            System.out.println("  getIsi(" + i + ") = " + dataInt.getIsi(i));
        }

        System.out.println();

        // Data berisi keluarga Anabul
        Data<Anabul> dataAnabul = new Data<>();

        // Isi dengan berbagai Anabul
        dataAnabul.setIsi(1, new Kucing("Mimi", 3.0));
        dataAnabul.setIsi(2, new Anjing("Bobby"));
        dataAnabul.setIsi(3, new Burung("Cici"));
        dataAnabul.setIsi(4, new Anggora("Luna", 3.5));
        dataAnabul.setIsi(5, new Kembangtelon("Telo", 4.2));

        System.out.println("Data<Anabul>:");
        // Soal 4d: getSize
        System.out.println("  getSize() = " + dataAnabul.getSize());

        // Soal 4c: getIsi untuk setiap elemen
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul hewan = dataAnabul.getIsi(i);
            System.out.print("  getIsi(" + i + ") -> " + hewan + " | ");
            hewan.bersuara();
        }

        System.out.println();

        // Data berisi keluarga Kucing saja
        Data<Kucing> dataKucing = new Data<>();
        dataKucing.setIsi(1, new Anggora("Bella",  3.2));
        dataKucing.setIsi(2, new Kembangtelon("Kopi", 5.1));
        dataKucing.setIsi(3, new Kucing("Garfield", 6.0));

        System.out.println("Data<Kucing>:");
        System.out.println("  getSize() = " + dataKucing.getSize());
        for (int i = 1; i <= dataKucing.getSize(); i++) {
            Kucing k = dataKucing.getIsi(i);
            System.out.println("  getIsi(" + i + ") -> " + k
                    + " | bobot = " + k.getBobot() + " kg");
        }

        System.out.println();

        // Uji batas posisi di luar rentang
        System.out.println("Uji posisi tidak valid:");
        dataKucing.setIsi(0,   new Kucing("Spike", 3.0));   // posisi terlalu kecil
        dataKucing.setIsi(101, new Kucing("Fluffy", 4.5));   // posisi terlalu besar
        System.out.println("  getIsi(0)   = " + dataKucing.getIsi(0));
        System.out.println("  getIsi(101) = " + dataKucing.getIsi(101));

    }
}
