public class lingkaran extends BangunDatar {
    private double jari;
    private double phi = 3.14159;
    //default konstruktor bangundatar hanya set sisi
    lingkaran(){
        setJmlSisi(0);
    }
    //konstruktor lingkaran 
    lingkaran(double diameter,String warna,String border){
        super(0,warna,border);
        this.jari = diameter/2;
    
    }
    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){ 
        return phi*jari*jari;
    }
    public double getKeliling(){
        return 2*phi*jari;
    }
    //override parent prosedur
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-Jari lingkaran: " + jari);
    }

}
