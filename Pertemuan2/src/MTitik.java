/* Nama : MTitik.java
   Deskripsi : berisi main class untuk menguji class Titik
   Pembuat : Raffa Putra Nugroho
   Tanggal : 25-02-2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 
        Titik T1 = new Titik();
        // Mengubah absis T1 dengan nilai 3
        T1.setAbsis(3);
        // Mengubah ordinat T1 dengan nilai 4
        T1.setOrdinat(4);
        // Mencetak koordinat T1 ke layar
        T1.printTitik();   
        // Menggeser T1 sejauh (3,4)
        T1.geser(3,4);
        // Menampilkan koordinat T1 setelah digeser
        T1.printTitik();   

        Titik T2 = T1;      
        T2.printTitik(); 
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5 );

        System.out.print("Jumlah Objek Titik = " + Titik.getCounterTitik());
         System.out.print("Jumlah Objek Titik = " + T4.getCounterTitik());

    }
}
