package koleksi_dasar;
public class MainTeman {
    public static void main(String[] args) {
        Teman<String> teman = new Teman<>();

        // Menambahkan beberapa nama teman
        teman.addNama("Alice Anderson");
        teman.addNama("Bobby Brown");
        teman.addNama("Charlie Davis");
        teman.addNama("Bobby King");
        teman.addNama("David Wilson");
        teman.addNama("Bobby Rubin");

        // Menampilkan jumlah teman
        System.out.println("Jumlah teman: " + teman.getNbelm());

        // Menampilkan nama teman pada indeks tertentu
        System.out.println("Nama teman pada indeks 1: " + teman.getNama(1));

        // Mengubah nama teman pada indeks tertentu
        teman.setNama(1, "Bobby Brown Jr.");
        System.out.println("Nama teman pada indeks 1 setelah perubahan: " + teman.getNama(1));

        // Menghapus nama teman tertentu
        teman.delNama("Alice Anderson");
        System.out.println("Jumlah teman setelah penghapusan: " + teman.getNbelm());

        // Mengecek apakah nama teman tertentu ada dalam koleksi
        System.out.println("Apakah Charlie adalah teman? " + teman.isMember("Charlie"));

        // Menggantikan nama teman tertentu dengan nama baru
        teman.gantiNama("Charlie Davis", "Charles Wilson");
        System.out.println("Nama teman pada indeks 0 setelah penggantian: " + teman.getNama(0));


        // Menghitung jumlah teman dengan nama tertentu
        teman.countNama("Bobby Brown");

        // Menampilkan semua nama teman dalam koleksi
        teman.showTeman();
    }
}
