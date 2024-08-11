package Task1;

public class Animal {
    public static int animalCount = 0;
    protected String name;

    public Animal(String name){
        this.name = name;
        animalCount++;
    }

    public void run(int distance){
        System.out.println("Животное" + name + " пробежало " + distance + " метров");
    }

    public void swim(int distance){
        System.out.println("Животное" + name + " пробежало " + distance + " метров");
    }
}
