import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        FileManager fileManager = new FileManager();
        ArrayList<Animal> animals = fileManager.wczytajZwierzeta();

        for (Animal animal : animals) {
            zoo.dodajZwierze(animal);
        }

        Menu menu = new Menu(zoo);
        menu.start();



    }
}