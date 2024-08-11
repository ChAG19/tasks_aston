package Task1;

public class Cat extends Animal {
    public static final int MAX_RUN_DISTANCE = 200;
    public static int catCount = 0;
    private static int food = 0;
    private boolean satiety;

    public Cat(String name){
        super(name);
        catCount++;
        satiety = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE)
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
        else System.out.println("Котам лень бегать на такие дистанции!");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");
    }

    public void eat(int quantity){
        System.out.print(name + " подходит к миске. ");
        if (quantity <= food){
            food -= quantity;
            satiety = true;
            System.out.println("Успех");
        }
        else System.out.println("В миске недостаточно еды");
    }

    public static void addFood(int quantity){
        food += quantity;
    }


    public void isSatiety() {
        if(satiety)System.out.println(name + " сыт");
        else System.out.println(name + " голоден");
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
