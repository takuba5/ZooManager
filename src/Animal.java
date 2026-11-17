public class Animal {
    private String nazwa;
    private int wiek;
    private double waga;


    public Animal(String nazwa, int wiek, double waga){
        this.nazwa = nazwa;
        this.waga = waga;
        this.wiek = wiek;

    }

    public String info(){
        return "Nazwa: " + nazwa + " wiek: " + wiek + " lat, Waga: " + waga + "kg";
    }

    public String getNazwa(){
        return nazwa;
    }
    public int getWiek(){
        return wiek;
    }
    public double getWaga(){
        return waga;
    }

    public void setNazwa(String nazwa){
        if(nazwa.isBlank() || nazwa == null){
            System.out.println("Nazwa nie moze byc pusta ");
            return;
        }
        this.nazwa = nazwa;
    }
    public void setWiek(int wiek){
        if(wiek<0){
            System.out.println("Wiek nie moze byc mniejszy niz 0 lat");
            return;
        }
        this.wiek = wiek;
    }
    public void setWaga(double waga){
        if(waga<=0){
            System.out.println("Waga nie moze byc mniejsza od 0 kg");
            return;
        }
        this.waga = waga;
    }
}