import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;

public class FileManager {
    private String plik = "zoo.txt";


    public void zapiszZwierzeta(ArrayList<Animal> animalArrayList){
        StringBuilder sb = new StringBuilder();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(plik));
            for(Animal animal: animalArrayList){
                if(animal instanceof Lion){
                    sb.append("Lion,");
                    sb.append(animal.getNazwa()).append(",");
                    sb.append(animal.getWiek()).append(",");
                    sb.append(animal.getWaga()).append(",");
                    sb.append(((Lion) animal).getGrzywa());


                } else if (animal instanceof  Elephant) {
                    sb.append("Elephant,");
                    sb.append(animal.getNazwa()).append(",");
                    sb.append(animal.getWiek()).append(",");
                    sb.append(animal.getWaga()).append(",");
                    sb.append(((Elephant) animal).getDlugosc_Traby());
                } else if (animal instanceof Penguin){
                    sb.append("Penguin,");
                    sb.append(animal.getNazwa()).append(",");
                    sb.append(animal.getWiek()).append(",");
                    sb.append(animal.getWaga()).append(",");
                    sb.append(((Penguin) animal).getGatunek());
                }
                writer.write(sb.toString());
                writer.newLine();
                sb.setLength(0);
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public ArrayList<Animal> wczytajZwierzeta(){
        ArrayList<Animal> animals = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(plik))) {
            String linia;

            while ((linia = br.readLine()) != null) {
                String[] dane = linia.split(",");


                if(dane[0].equals("Lion")){
                    Lion lion = new Lion(
                            dane[1],
                            Integer.parseInt(dane[2]),
                            Double.parseDouble(dane[3]),
                            Boolean.parseBoolean(dane[4])
                    );
                    animals.add(lion);

                } else if (dane[0].equals("Elephant")){
                    Elephant elephant = new Elephant(
                            dane[1],
                            Integer.parseInt(dane[2]),
                            Double.parseDouble(dane[3]),
                            Double.parseDouble(dane[4])
                    );
                    animals.add(elephant);

                } else if (dane[0].equals("Penguin")) {
                    Penguin penguin = new Penguin(
                            dane[1],
                            Integer.parseInt(dane[2]),
                            Double.parseDouble(dane[3]),
                            dane[4]
                    );

                    animals.add(penguin);

                }

            }

        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
        return animals;
    }


}