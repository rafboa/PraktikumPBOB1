// Nama    : Raffa Putra Nugroho
// NIM     : 24060124130085
// Tanggal : 25 April 2026
// Deskripsi: Program penggunaan eksepsi buatan sendiri dengan klausa throw dan throws
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); // langsung keluar dari method
        }
        System.out.println(angka + " bukan angka sial");
    }

/* jawab pertanyaan:
BARIS 12 - System.out.println(angka + " bukan angka sial"):
TIDAK dieksekusi ketika angka == 13.
Karena saat 'throw' dipanggil di atas, eksekusi method langsung
berhenti dan kontrol diserahkan ke blok catch di pemanggil.
Baris ini hanya dieksekusi jika angka != 13.
*/

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10); // angka 10 -> normal, cetak "10 bukan angka sial"
            as.cobaAngka(13); // angka 13 -> throw AngkaSialException!
            as.cobaAngka(12); // TIDAK dieksekusi karena exception sudah terjadi
        }
        catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}


/* jawab pertanyaan:
BARIS 21 - }catch(AngkaSialException ase){
YA, dieksekusi. Blok catch ini aktif tepat saat exception
AngkaSialException dilempar oleh as.cobaAngka(13).
Program langsung masuk ke sini, menjalankan getMessage() dan
mencetak pesan peringatan. as.cobaAngka(12) di baris 20
tidak pernah sempat dijalankan.
*/