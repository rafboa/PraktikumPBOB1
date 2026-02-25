  /* Nama : Titik.java
   * Deskripsi : berisi atribut dan method untuk merepresentasikan sebuah titik dalam bidang 2D
   * Pembuat : Raffa Putra Nugroho
   * Tanggal : 25-02-2026*/  


public class Titik {
    /*************** ATRIBUT ****************/
    private double absis;   // x-coordinate
    private double ordinat; // y-coordinate

    /*************** KONSTRUKTOR ****************/
    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    // konstruktor untuk membuat titik dengan koordinat tertentu
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }

    /*************** METHOD ****************/
    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; 
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
// end class Titik

