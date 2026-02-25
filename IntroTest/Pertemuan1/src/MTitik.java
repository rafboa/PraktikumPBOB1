  /* Nama : MTitik.java
   * Deskripsi : berisi atribut dan method dalam class Titik 
   * Pembuat : Raffa Putra Nugroho
   * Tanggal : 25-02-2026*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();   // (0,0)
        T1.setAbsis(3);           // x = 3
        T1.setOrdinat(4);         // y = 4
        T1.printTitik();          // prints (3.0,4.0)

        T1.geser(3,4);            // shift by (3,4)
        T1.printTitik();          // prints (6.0,8.0)
    }
}

