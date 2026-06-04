import java.util.ArrayList;
import java.util.Map;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Lambasa", "12345"));
        mahasiswaList.add(new Mahasiswa("Maria", "67890"));
        mahasiswaList.add(new Mahasiswa("Siti", "54321"));
        mahasiswaList.add(new Mahasiswa("Diddy", "09876"));

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((mhs) -> System.out.println(mhs.getNama()));

        Map<String, String> mapMhs = new java.util.HashMap<>();
        mapMhs.put("Lambasa", "12345");
        mapMhs.put("Maria", "67890");
        mapMhs.put("Siti", "54321");
        mapMhs.put("Diddy", "09876");
        // lamda ambil nama berdasarkan nim sebagai key
        mapMhs.forEach((nama, nim) -> System.out.println("Nama: " + nama + ", NIM: " + nim));
    }
}