package koleksi_dasar;
// Nama         : Raffa Putra Nugroho
// NIM          : 24060124130085
// Tanggal      : 6 Mei 2026
// Deskripsi    : Kelas Teman yang berisi koleksi nama teman (String) dengan berbagai operasi.
import java.util.ArrayList;
import java.util.List;

public class Teman<T> {
    
    // Atribut 
    private int nbelm; // jumlah elemen
    private List<String> Lnama; // list untuk menyimpan nama teman

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }
    
    // Selektor untuk mendapatkan jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Selektor untuk mendapatkan nama teman pada indeks tertentu
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    // Mutator untuk mengubah nama teman pada indeks tertentu
    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    // Method untuk menambahkan nama teman baru
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // Method untuk menghapus nama teman tertentu
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // Method untuk mengecek apakah nama teman tertentu ada dalam koleksi
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Method untuk menggantikan nama teman tertentu dengan nama baru
    public void gantiNama(String nama, String namaBaru){
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namaBaru);
        }
    }

    // Method untuk menghitung jumlah teman dengan nama tertentu
    public void countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        System.out.println("Jumlah teman dengan nama '" + nama + "': " + count);
    }

    // Method untuk menampilkan semua nama teman dalam koleksi
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}
