/* Nama : MGaris.java
   Deskripsi : berisi main class untuk menguji class Garis
   Pembuat : Raffa Putra Nugroho
   Tanggal : 04-03-2026
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik untuk garis
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik(0, 0);
        Titik t4 = new Titik(4, 0);
        
        // Membuat objek garis G1 dengan titik awal dan titik akhir (0,0) ke (0,0)
        Garis G1 = new Garis();
        System.out.println("=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang garis: " + G1.getPanjangGaris());
        System.out.println("Gradien: " + G1.getGradien());
        System.out.print("Titik tengah: ");
        G1.getTitikTengah().printTitik();
        System.out.print("Persamaan garis: ");
        G1.printPersamaanGaris();
        System.out.println();
        
        // Membuat objek garis G2 dari titik (-2,0) ke (0,4)
        Garis G2 = new Garis(t1, t2);
        System.out.println("=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Panjang garis: " + G2.getPanjangGaris());
        System.out.println("Gradien: " + G2.getGradien());
        System.out.print("Titik tengah: ");
        G2.getTitikTengah().printTitik();
        System.out.print("Persamaan garis: ");
        G2.printPersamaanGaris();
        System.out.println();
        
        // Membuat objek garis G3 dari titik (0,0) ke (4,0)
        Garis G3 = new Garis(t3, t4);
        System.out.println("=== Garis G3 ===");
        G3.printGaris();
        System.out.println("Panjang garis: " + G3.getPanjangGaris());
        System.out.println("Gradien: " + G3.getGradien());
        System.out.print("Titik tengah: ");
        G3.getTitikTengah().printTitik();
        System.out.print("Persamaan garis: ");
        G3.printPersamaanGaris();
        System.out.println();
        
        // Mengecek apakah G2 dan G3 sejajar
        System.out.println("=== Pengujian Hubungan Garis ===");
        System.out.println("Apakah G2 sejajar dengan G3? " + G2.isSejajar(G3));
        
        // Mengecek apakah G2 dan G3 tegak lurus
        System.out.println("Apakah G2 tegak lurus dengan G3? " + G2.isTegakLurus(G3));
        System.out.println();
        
        // Membuat garis tegak lurus untuk pengujian
        Titik t5 = new Titik(0, 0);
        Titik t6 = new Titik(2, 4);
        Titik t7 = new Titik(0, 0);
        Titik t8 = new Titik(4, -2);
        
        Garis G4 = new Garis(t5, t6);
        Garis G5 = new Garis(t7, t8);
        
        System.out.println("=== Garis G4 ===");
        G4.printGaris();
        System.out.println("Gradien: " + G4.getGradien());
        System.out.print("Persamaan garis: ");
        G4.printPersamaanGaris();
        
        System.out.println("=== Garis G5 ===");
        G5.printGaris();
        System.out.println("Gradien: " + G5.getGradien());
        System.out.print("Persamaan garis: ");
        G5.printPersamaanGaris();
        System.out.println();
        
        System.out.println("Apakah G4 sejajar dengan G5? " + G4.isSejajar(G5));
        System.out.println("Apakah G4 tegak lurus dengan G5? " + G4.isTegakLurus(G5));
        System.out.println();
        
        // Menampilkan jumlah objek garis yang telah dibuat
        System.out.println("=== Counter Garis ===");
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
    }
}