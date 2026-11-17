public class Elephant extends  Animal{

    private double dlugosc_Traby;
    public Elephant(String nazwa, int wiek, double waga, double dlugosc_Traby) {
        super(nazwa, wiek, waga);
        this.dlugosc_Traby = dlugosc_Traby;
    }
    public void trumpet(){
        System.out.println("Slon " + getNazwa() + " trabi!");
    }


    public void setDlugosc_Traby(double dlugosc_Traby){
        this.dlugosc_Traby = dlugosc_Traby;
    }
    public double getDlugosc_Traby(){
        return dlugosc_Traby;
    }
}

