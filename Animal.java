import java.util.Scanner;
import java.util.Random;

public class Animal 
{
    private String animalName;
    private String animalType;
    private int animalID;
    private int userID;
    private int traitID;

    public void readOutput()
    {
        Scanner user = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Let's adopt a new pet!");
        System.out.println();
        System.out.println("First, please choose your preferred animal type from the list below: ");

        System.out.println("[Cat, Dog, Wolf, Rabbit, Duck, squirrel, Ferret, Fox, Eagle, Dragon, Phoenix, Turtle, Snake]");
        animalType = user.nextLine();

        animalID = rand.nextInt(1000);
        traitID = rand.nextInt(20);
        System.out.println();
        
        System.out.println( "Now, let's give your pet a name!");
        animalName = user.nextLine();        
    }

    public void setAnimalName(String newAnimalName)
    {
        animalName = newAnimalName;
    }

    public void setAnimalType(String newAnimalType)
    {
        animalType = newAnimalType;
    }

    public void setAnimalID(int newAnimalID)
    {
        animalID = newAnimalID;
    }

    public void setTraitID(int newTraitID)
    {
        traitID = newTraitID;
    }

    public String getAnimalName()
    {
        return animalName;
    }

    public String getAnimalType()
    {
        return animalType;
    }

    public int getAnimalID()
    {
        return animalID;
    }

    public int getTraitID()
    {
        return traitID;
    }
}

