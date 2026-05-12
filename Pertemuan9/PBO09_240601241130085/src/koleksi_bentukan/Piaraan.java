package koleksi_bentukan;
// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 6 Mei 2026
// Deskripsi   : Kelas Piaraan yang berisi koleksi anabul (hewan peliharaan) dengan berbagai operasi menggunakan LinkedList.

import java.util.LinkedList;


public class Piaraan {
    // Atribut 
    private int nbelm; // jumlah elemen
    private LinkedList<Anabul> Lanabul; // koleksi antrean Anabul

    // Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // Selektor untuk mendapatkan jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Mutator untuk menambahkan anabul ke akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        nbelm++;
    }

    // Mutator untuk mengecek apakah anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // Selektor untuk mengambil data anabul pertama (tanpa dikeluarkan)
    public Anabul getAnabul() {
        return Lanabul.getFirst();
    }

    // Mutator untuk mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            nbelm--;
            return Lanabul.removeFirst();
        }
        return null;
    }

    // Mutator untuk menampilkan nama panggilan semua anabul dalam antrean
    public void showAnabul() {
        int i = 1;
        for (Anabul a : Lanabul) {
            System.out.println("  " + i + ". " + a.getNama());
            i++;
        }
    }

    // Selektor untuk menghitung jumlah anabul yang merupakan kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // Selektor untuk mengitung jumlah bobot semua kucing dalam antrean
    public double bobotKucing() {
        double total = 0.0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        int i = 1;
        for (Anabul a : Lanabul) {
            String jenis = a.getClass().getName();
            System.out.println("  " + i + ". " + a.getNama() + " [" + jenis + "]");
            i++;
        }
    }


}
