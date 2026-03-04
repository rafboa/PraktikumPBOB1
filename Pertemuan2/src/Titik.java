/* Nama : Titik.java
   Deskripsi : berisi atribut dan method untuk titik
   Pembuat : Raffa Putra Nugroho
   Tanggal : 25-02-2026
 */
public class Titik {
    /************ATRIBUT************/

    private double absis;
    private double ordinat;
    public static int counterTitik = 0;

    /************METHOD************/
    // Konstruktor membuat titik di koordinat (absis, ordinat) 
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++; 
    }

    // Konstruktor membuat titik di koordinat (0,0)
    public Titik() {
        this(0, 0);
    }

    //mengembalikan absis pada titik tertentu   
    public double getAbsis() {
        return absis;
    }

    //mengembalikan ordinat pada titik tertentu
    public double getOrdinat() {
        return ordinat;
    }

    //mengembalikan jumlah objek titik yang telah dibuat
    public static int getCounterTitik() {
        return counterTitik;
    }
    
    //mengubah absis pada titik tertentu
    public void setAbsis(double x) {
        absis = x;
    }

    //mengubah ordinat pada titik tertentu
    public void setOrdinat(double y) {
        ordinat = y;
    }
    
    //menggeser titik sejauh (x,y)
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //menampilkan koordinat titik ke layar
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //menentukan kuadran dari titik
    public double getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }
    
    //menghitung jarak titik ke pusat koordinat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //menghitung jarak titik ke titik lain
    public double getJarak(Titik t) {
        double x = absis - t.getAbsis();
        double y = ordinat - t.getOrdinat();
        return Math.sqrt(x * x + y * y);
    }

    //merefleksikan titik terhadap sumbu X 
    public void refleksiX() {
        ordinat = -ordinat;
    }

    //merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        absis = -absis;
    }

    //mengembalikan koordinat titik setelah direfleksikan terhadap sumbu X
    public double getRefleksiX() {
        return -ordinat;
    }

    //mengembalikan koordinat titik setelah direfleksikan terhadap sumbu Y
    public double getRefleksiY() {
        return -absis;
    }

    //menampilkan koordinat titik setelah direfleksikan terhadap sumbu X dan Y
    public void printTitik(double x, double y) {
        System.out.println("Titik (" + x + "," + y + ")");
    }

    //menampilkan jumlah objek titik yang telah dibuat
    public void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    //akhir dari class Titik

}
