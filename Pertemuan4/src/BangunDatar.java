public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    public BangunDatar(){

    }
    public BangunDatar(int jmlSisi,String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }
    public void setJmlSisi(int sisi){
        this.jmlSisi = sisi; 
    }
    public String getWarna(){
        return warna;
    }
    void setWarna(String warna){
        this.warna = warna;
    }
    public String getBorder(){
        return border;
    }
    public void setBorder(String border){
        this.border = border;
    }
    public void printInfo(){
        System.out.println("Jumlah sisi:  " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

}
