import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void usunZwierze() {
        if(animalsList.isEmpty()){
            System.out.println("Nie ma nic do usuwania");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie zwierze chcesz usunac?: ");

        int indexx = 1;
        for (Animal animal : animalsList) {
            System.out.println(indexx + ". " + animal.getNazwa());
            indexx++;
        }
        int wybor = scanner.nextInt();scanner.nextLine();
        if(wybor >= 1 && wybor<=animalsList.size()){
            animalsList.remove(wybor-1);
        }else {
            System.out.println("Zly numer");
        }


    }
    public void edytujZwierze(){

        Animal zwierze;
        if(animalsList.isEmpty()){
            System.out.println("Nie ma nic do edytowania");
            return;
        }

        int indexx = 1;
        for(Animal animal : animalsList){
            System.out.println(indexx + ". " + animal.getNazwa());
            indexx++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie zwierze chcesz edytowac?: ");
        int wybor = scanner.nextInt();scanner.nextLine();

        if(wybor >= 1 && wybor<=animalsList.size()){
            zwierze = animalsList.get(wybor-1);
            System.out.println("Podaj nowa nazwe (Jezeli nie chcesz jej zmieniac wcisnij enter): ");
            String nazwa = scanner.nextLine();
            if(!nazwa.isBlank()){
                zwierze.setNazwa(nazwa);
            }
            System.out.println("Podaj nowy wiek (Jezeli nie chcesz jej zmieniac wcisnij enter): ");
            String wiek = scanner.nextLine();
            if(!wiek.isBlank()){
                zwierze.setWiek(Integer.parseInt(wiek));
            }
            System.out.println("Podaj nową wagę (Jezeli nie chcesz jej zmieniac wcisnij enter): ");
            String waga = scanner.nextLine();
            if(!waga.isBlank()){
                zwierze.setWaga(Double.parseDouble(waga));
            }
            if(zwierze instanceof Lion){
                System.out.println("Czy ma grzywe (tak/nie) (Jezeli nie chcesz jej zmieniac wcisnij enter): ");
                String czyMaGrzywe = scanner.nextLine().toLowerCase();

                if(!czyMaGrzywe.isBlank()){
                    switch (czyMaGrzywe){
                        case "tak":
                            ((Lion) zwierze).setGrzywa(true);
                            break;
                        case "nie":
                            ((Lion) zwierze).setGrzywa(false);
                            break;
                        default:
                            System.out.println("Zly warunek!");
                            break;

                    }
                }
            } else if (zwierze instanceof Elephant){
                System.out.println("Podaj dlugosc traby (Jezeli nie chcesz jej zmieniac wcisnij enter): ");
                String traba = scanner.nextLine();

                if(!traba.isBlank()){
                    double dlugoscTraby = Double.parseDouble(traba);

                    if(dlugoscTraby>=0){
                        ((Elephant) zwierze).setDlugosc_Traby(dlugoscTraby);
                    }
                }
                

            } else if (zwierze instanceof Penguin) {
                System.out.println("Podaj gatunek (Jezeli nie chcesz jej zmieniac wcisnij enter): ");
                String gatunek = scanner.nextLine();
                if(!gatunek.isBlank()){
                    ((Penguin) zwierze).setGatunek(gatunek);
                }

            }


        }else {
            System.out.println("Zly numer");
        }

    }
}