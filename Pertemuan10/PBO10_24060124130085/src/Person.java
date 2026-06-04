public class Person {
    private int id;
    private String nama;

    public Person(String nama){
        this.nama = nama;
    }

    public Person(int id, String nama){
        this.id = id;
        this.nama = nama;
    }   

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }


}
