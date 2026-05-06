// Nama         : Raffa Putra Nugroho
// NIM          : 24060124130085
// Tanggal      : 5 Mei 2026
// Deskripsi    : Kelas MainOperatorGenerik untuk demo penggunaan metode generik pada kelas OperatorGenerik 

public class MainOperatorGenerik {
    public static void main(String[] args) {
        
        // Tukar sesama Integer
        Integer[] a = {3};
        Integer[] b = {6};
        System.out.println("Tukar Integer:");
        System.out.println("  Sebelum: a=" + a[0] + ", b=" + b[0]);
        OperatorGenerik.Tukar(a, b);
        System.out.println("  Sesudah: a=" + a[0] + ", b=" + b[0]);

        System.out.println();

        // Tukar sesama String
        String[] s1 = {"Halo"};
        String[] s2 = {"Dunia"};
        System.out.println("Tukar String:");
        System.out.println("  Sebelum: s1=" + s1[0] + ", s2=" + s2[0]);
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("  Sesudah: s1=" + s1[0] + ", s2=" + s2[0]);

        System.out.println();

        // Tukar sesama Anabul (Anjing dan Kucing)
        Anabul[] x = {new Anjing("Bobby")};
        Anabul[] y = {new Kucing("Mimi", 2.5)};
        System.out.println("Tukar Anabul (Anjing <-> Kucing):");
        System.out.println("  Sebelum: x=" + x[0] + ", y=" + y[0]);
        OperatorGenerik.Tukar(x, y);
        System.out.println("  Sesudah: x=" + x[0] + ", y=" + y[0]);

        System.out.println();

        // Tukar sesama Kucing (Anggora <-> Kembangtelon)
        Kucing[] k1 = {new Anggora("Luna", 3.5)};
        Kucing[] k2 = {new Kembangtelon("Telo", 4.2)};
        System.out.println("Tukar Kucing (Anggora <-> Kembangtelon):");
        System.out.println("  Sebelum: k1=" + k1[0] + ", k2=" + k2[0]);
        OperatorGenerik.Tukar(k1, k2);
        System.out.println("  Sesudah: k1=" + k1[0] + ", k2=" + k2[0]);

        System.out.println();

        // Fungsi Bobot2
        Anggora anggora  = new Anggora("Bella", 3.2);
        Kembangtelon telo = new Kembangtelon("Kopi", 5.1);
        System.out.println("Bobot2 (Anggora + Kembangtelon):");
        System.out.println("  " + anggora.getNama() + " = " + anggora.getBobot() + " kg");
        System.out.println("  " + telo.getNama()    + " = " + telo.getBobot()    + " kg");
        double total = OperatorGenerik.Bobot2(anggora, telo);
        System.out.println("  Total bobot = " + total + " kg");

        System.out.println();

        // Bobot2 dengan dua Anggora
        Anggora ag2 = new Anggora("Mochi", 4.0);
        System.out.println("Bobot2 (dua Anggora):");
        System.out.println("  " + anggora.getNama() + " + " + ag2.getNama()
                + " = " + OperatorGenerik.Bobot2(anggora, ag2) + " kg");

    }
}
