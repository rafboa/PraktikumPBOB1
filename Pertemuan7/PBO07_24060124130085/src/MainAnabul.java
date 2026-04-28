// Nama        : Raffa Putra Nugroho
// NIM         : 24060124130085
// Tanggal     : 25 April 2026
// Deskripsi   : Program utama simulasi bunyi dan gerakan anabul 
public class MainAnabul {
    public static void main(String[] args) {

        // Membuat objek Kucing, Burung, dan Anjing
        Kucing kucing1 = new Kucing("Mimi");
        Burung burung1 = new Burung("Cici");
        Anjing anjing1 = new Anjing("Bobby");

        // Menampilkan gerakan dan suara Kucing
        kucing1.gerak();
        kucing1.bersuara();

        System.out.println(); // Tambahkan baris kosong untuk pemisah

        // Menampilkan gerakan dan suara Burung
        burung1.gerak();
        burung1.bersuara();

        System.out.println(); // Tambahkan baris kosong untuk pemisah

        // Menampilkan gerakan dan suara Anjing
        anjing1.gerak();
        anjing1.bersuara();
        
    
    }
}
