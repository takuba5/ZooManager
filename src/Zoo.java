import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animalsList;

    public Zoo(){
        animalsList = new ArrayList<>();
    }

    public void dodajZwierze(Animal animal){
        animalsList.add(animal);
    }
    public void wyswietlZwierzęta(){

        for (Animal animal : animalsList) {
            System.out.println(animal.info());
        }
    }

    public void usunZwierze(int index){

    }

}