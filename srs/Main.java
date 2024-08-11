import Task1.Animal;
import Task1.Cat;
import Task1.Dog;
import Task2.Circle;
import Task2.Figure;
import Task2.Rectangle;
import Task2.Triangle;

public class Main
{
    public static void main (String[] args)
    {
        //1 часть

        Animal cat1 = new Cat("Барсик");
        Animal dog1 = new Dog("Барбос");

        cat1.run(210);
        cat1.swim(32);
        dog1.run(200);
        dog1.swim(30);

        System.out.println();

        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++)
            cats[i] = new Cat("Кот " + (i + 1));

        Cat.addFood(100);
        for (Cat cat : cats){
            cat.eat(20);
        }

        System.out.println();

        for (Cat cat : cats){
            cat.isSatiety();
        }

        System.out.println();

        System.out.println("Всего животных " + Animal.animalCount + ". Из них котов - " + Cat.catCount + ", собак - " + Dog.dogCount);
        System.out.println();
        //2 часть

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(4, "Зелёный", "Салатовый");
        figures[1] = new Rectangle(12, 23, "Синий", "Голубой");
        figures[2] = new Triangle(3, 4, 5, "Чёрный", "Белый");

        for (Figure figure : figures){
            figure.getPerimetr();
            figure.getArea();
            figure.getBorderColor();
            figure.getFillColor();
            System.out.println();
        }
    }
}