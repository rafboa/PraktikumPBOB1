public class Persegi extends BangunDatar{
    private double sisi;


    //konstruktor default tidak berparameter
    public Persegi(){
        setJmlSisi(4);
    }

    //konstruktor persegi
    public Persegi(double sisi,String warna,String border){
        super(4,warna,border);
        this.sisi = sisi;
    }
    //mengeluarkan sisi dari persegi 
    public double getSisi(){
        return sisi;
    }
    //set sisi dari persegi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    //mendapatkan luas persegi
    public double getLuas(){
        return sisi*sisi;
    }
    //mendapatkan keliling persegi
    public double getKeliling(){
        return 2*sisi;
    }
    //mendapatkan diagonal persegi akar(sisi^2+sisi^2) 
    public double getDiagonal(){
        return 2*Math.sqrt(2);
    }
    //override print info dari parent 
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi persegi: " + sisi);
    }
}
