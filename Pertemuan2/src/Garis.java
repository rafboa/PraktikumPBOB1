/* Nama : Garis.java
   Deskripsi : berisi atribut dan method untuk garis
   Pembuat : Raffa Putra Nugroho
   Tanggal : 04-03-2026
 */

public class Garis {
    /************ATRIBUT************/
    
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;
    
    /************METHOD************/
    
    // Konstruktor membuat garis 
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(0, 0);
        counterGaris++;
    }
    
    // Konstruktor membuat garis dengan titik awal dan titik akhir tertentu
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    
    // Mengembalikan titik awal garis
    public Titik getTitikAwal() {
        return titikAwal;
    }
    
    // Mengembalikan titik akhir garis
    public Titik getTitikAkhir() {
        return titikAkhir;
    }
    
    // Mengembalikan jumlah objek garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }
    
    // Mengubah titik awal garis
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }
    
    // Mengubah titik akhir garis
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }
    
    // Menghitung panjang garis
    public double getPanjangGaris() {
        return titikAwal.getJarak(titikAkhir);
    }
    
    // Menghitung gradien garis
    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        
        if (deltaX == 0) {
            return Double.POSITIVE_INFINITY; // Garis vertikal
        }
        return deltaY / deltaX;
    }
    
    // Menghitung titik tengah garis
    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }
    
    // Mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis g) {
        // Dua garis sejajar jika gradiennya sama
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        
        // Toleransi untuk perbandingan floating point
        double epsilon = 0.0001;
        return Math.abs(gradien1 - gradien2) < epsilon;
    }
    
    // Mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis g) {
        // Dua garis tegak lurus jika perkalian gradiennya = -1
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        
        // Kasus khusus: garis horizontal dan vertikal
        if (Double.isInfinite(gradien1) && gradien2 == 0) {
            return true;
        }
        if (gradien1 == 0 && Double.isInfinite(gradien2)) {
            return true;
        }
        
        // Toleransi untuk perbandingan floating point
        double epsilon = 0.0001;
        return Math.abs(gradien1 * gradien2 + 1) < epsilon;
    }
    
    // Menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik();
        System.out.print(" ke ");
        titikAkhir.printTitik();
    }
    
    // Menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        
        // Kasus garis vertikal
        if (Double.isInfinite(m)) {
            return "x = " + titikAwal.getAbsis();
        }
        
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        
        String persamaan = "y = ";
        
        if (m == 0) {
            persamaan += c;
        } else if (m == 1) {
            persamaan += "x";
        } else if (m == -1) {
            persamaan += "-x";
        } else {
            persamaan += m + "x";
        }
        
        if (c > 0 && m != 0) {
            persamaan += " + " + c;
        } else if (c < 0) {
            persamaan += " - " + Math.abs(c);
        }
        
        return persamaan;
    }
    
    // Menampilkan persamaan garis ke layar
    public void printPersamaanGaris() {
        System.out.println(getPersamaanGaris());
    }
    
    //akhir dari class Garis
}