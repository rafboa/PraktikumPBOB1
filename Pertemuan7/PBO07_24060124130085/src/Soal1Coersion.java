// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Polimorfisme Ad Hoc Coersion : konversi tipe data primitif dan String

public class Soal1Coersion {
    public static void main(String[] args) {

        //a. Coersion: konversi tipe data primitif
        int nilai = 65;
        double NilaiIntToDouble = (double) nilai; // Coersion: int ke double
        char NilaiIntToChar = (char) nilai; // Coersion: int ke char
        String NilaiIntToString = Integer.toString(nilai); // Coersion: int ke String
        double StringToDouble = Double.parseDouble(NilaiIntToString); // Coersion: String ke double
        Integer StringToInteger = Integer.valueOf(NilaiIntToString); // Coersion: String ke Integer

        // Output hasil coersion
        System.out.println("Nilai int: " + nilai);
        System.out.println("Nilai int ke double: " + NilaiIntToDouble);
        System.out.println("Nilai int ke char: " + NilaiIntToChar);
        System.out.println("Nilai int ke String: " + NilaiIntToString);
        System.out.println("Nilai String ke double: " + StringToDouble);
        System.out.println("Nilai String ke Integer: " + StringToInteger + "\n");

        //b. Ilustrasi pengubhan tipe data primitif ke String dan sebaliknya
        System.out.println("=== Konversi dan Operasi pada String ===");
        int angka = 123;
        String angkaString = Integer.toString(angka); // int ke String
        int angkaKembali = Integer.parseInt(angkaString); // String ke int

        System.out.println("Angka: " + angka);
        System.out.println("Angka sebagai String: " + angkaString);
        System.out.println("Angka kembali sebagai int: " + angkaKembali + "\n");

        //c. String X dan Y masing-masing bernilai "1234" dan "5678" dan lakukan konkatenasi dan penjumlahan angka dari String tersebut
        System.out.println("=== Konversi dan Operasi pada String ===");
        String X = "1234";
        String Y = "5678";
        String S = X + Y; 
        int Z = Integer.parseInt(X) + Integer.parseInt(Y); 

        System.out.println("\nString X: " + X);
        System.out.println("String Y: " + Y);
        System.out.println("Konkatenasi X dan Y (S): " + S);
        System.out.println("Penjumlahan angka dari X dan Y (Z): " + Z + "\n");

        //d.  String P dan Q masing-masing bernilai "12.34" dan "56.78". Lakukan konkatenasi dan penjumlahan angka dari String tersebut
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q); 

        System.out.println("\nString P: " + P);
        System.out.println("String Q: " + Q);
        System.out.println("Konkatenasi P dan Q (R): " + R);
        System.out.println("Penjumlahan angka dari P dan Q (D): " + D + "\n");

        //e.  Objek Integer A yang diisi hasil konversi nilai S! Tampilkan A
        System.out.println("String S: " + S);
        Integer A = Integer.valueOf(S); 
        System.out.println("\nObjek Integer A hasil konversi nilai S: " + A + "\n");  

        //f. Objek String T yang diisi hasil konversi nilai A! Tampilkan T!
        System.out.println("Objek Integer A: " + A);
        String T = A.toString(); 
        System.out.println("Objek String T hasil konversi nilai A: " + T + "\n");

    }
}
