public class Penguin extends Animal{
    private String gatunek;

    public Penguin(String nazwa, int wiek, double waga, String gatunek) {
        super(nazwa, wiek, waga);
        this.gatunek = gatunek;
    }

    public void slide(){
        System.out.println("Pingwin " + getNazwa() + " slizga sie na brzuchu!");
    }
}