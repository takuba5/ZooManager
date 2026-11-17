import java.util.Scanner;

public class Menu {

    private Zoo zoo = new Zoo();
    private FileManager fileManager = new FileManager();
    private Scanner scanner = new Scanner(System.in);
    public Menu(Zoo zoo){
        this.zoo = zoo;
    }

    public void start(){



        while (true){
            System.out.println("+---------------------------+");
            System.out.println("|      Zoo Manager 3000     |");
            System.out.println("+---------------------------+");

            System.out.println("| 1. Dodaj zwierzę           |\n" +
                    "| 2. Wyświetl wszystkie      |\n" +
                    "| 3. Usuń zwierzę            |\n" +
                    "| 4. Edytuj zwierzę          |\n" +
                    "| 5. Wykonaj czynność        |\n" +
                    "| 6. Wyjście                 |\n" +
                    "+---------------------------+\n"
            );
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();
            switch (wybor){
                case "1":
                    dodajZwierze();

                    break;
                case "2":
                    zoo.wyswietlZwierzęta();
                    break;
                case "3":
                    zoo.usunZwierze();
                    fileManager.zapiszZwierzeta(zoo.getAnimalsList());
                    break;
                case "4":
                    zoo.edytujZwierze();
                    fileManager.zapiszZwierzeta(zoo.getAnimalsList());
                    break;
                case "5":
                    zoo.wykonajCzynnosc();
                    break;

                case "6":
                    fileManager.zapiszZwierzeta(zoo.getAnimalsList());
                    System.out.println("Zapisano dane!");
                    return;


                default:
                    System.out.println("Zly wybor!");


            }

        }




    }
    public void dodajZwierze() {
        System.out.println("+---------------------------+");
        System.out.println("|      Dodaj zwierzę        |");
        System.out.println("+---------------------------+");
        System.out.println("| 1. Lew                    |");
        System.out.println("| 2. Pingwin                |");
        System.out.println("| 3. Słoń                   |");
        System.out.println("+---------------------------+");

        System.out.print("Wybierz gatunek: ");
        String gatunek = scanner.nextLine();

        System.out.print("Podaj nazwę: ");
        String nazwa = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = Integer.parseInt(scanner.nextLine());

        System.out.print("Podaj wagę: ");
        double waga = Double.parseDouble(scanner.nextLine());

        switch (gatunek) {
            case "1":
                System.out.print("Czy lew ma grzywę? (tak/nie): ");
                String grzywa = scanner.nextLine();

                Lion lion = new Lion(
                        nazwa,
                        wiek,
                        waga,
                        grzywa.equalsIgnoreCase("tak")
                );

                zoo.dodajZwierze(lion);
                break;

            case "2":
                System.out.print("Podaj gatunek pingwina: ");
                String gatunekPingwina = scanner.nextLine();

                Penguin penguin = new Penguin(
                        nazwa,
                        wiek,
                        waga,
                        gatunekPingwina
                );

                zoo.dodajZwierze(penguin);
                break;

            case "3":
                System.out.print("Podaj długość trąby (metry): ");
                double dlugoscTraby = Double.parseDouble(scanner.nextLine());

                Elephant elephant = new Elephant(
                        nazwa,
                        wiek,
                        waga,
                        dlugoscTraby
                );

                zoo.dodajZwierze(elephant);
                break;



            default:
                System.out.println("Nieprawidłowy gatunek!");
                return;
        }

        fileManager.zapiszZwierzeta(zoo.getAnimalsList());

        System.out.println("+---------------------------+");
        System.out.println("| Zwierzę zostało dodane!   |");
        System.out.println("+---------------------------+");
    }

}