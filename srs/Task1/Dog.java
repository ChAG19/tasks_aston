package Task1;

public class Dog extends Animal {
    public static int dogCount = 0;
    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE)
            System.out.println("Собака " + name + " пробежал " + distance + " метров");
        else System.out.println("Собакам лень бегать на такие дистанции!");
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE)
            System.out.println("Собака " + name + " проплыл " + distance + " метров");
        else System.out.println("Собакам лень плавать на такие дистанции!");
    }
}
