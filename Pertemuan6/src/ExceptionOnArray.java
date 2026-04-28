/**
 * File        : ExceptionOnArray.java
 * Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
 */
// Nama    : Raffa Putra Nugroho
// NIM     : 24060124130085
// Tanggal : 25 April 2026
// Deskripsi: Program penggunaan eksepsi ArrayIndexOutOfBoundsException dengan try-catch-finally
public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4]; // index valid: 0,1,2,3

        try {
            arrayInteger[2] = 11; // valid, index 2 ada
            arrayInteger[4] = 10; // TIDAK valid! index 4 di luar batas -> exception!
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            // blok finally selalu dieksekusi, baik ada exception maupun tidak
            System.out.println("clean up code...");
        }
    }
}
