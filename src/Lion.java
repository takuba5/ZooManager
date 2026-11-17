public class Lion extends Animal{

    private boolean grzywa;

    public Lion(String nazwa, int wiek, double waga, boolean grzywa) {
        super(nazwa, wiek, waga);
        this.grzywa = grzywa;
    }

    public void roar(){
        System.out.println("Lew " + getNazwa() + " ryczy!");

    }


}