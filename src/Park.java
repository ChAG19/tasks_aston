import java.util.Scanner;

public class Park {
    String park_name;
    private Attraction[] attractions;

    public Park(String park_name, int length){
        this.park_name = park_name;
        this.attractions = new Attraction[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++){
            System.out.print("Название аттракциона: ");
            String name = scanner.nextLine();
            System.out.print("Время работы: ");
            String time = scanner.nextLine();
            System.out.print("Цена: ");
            int cost = Integer.parseInt(scanner.nextLine());
            attractions[i] = new Attraction(name, time, cost);

        }
    }

    public class Attraction{
        private String name;
        private String timeRange;
        private int price;
        public Attraction(String name, String timeRange, int price){
            this.name = name;
            this.timeRange = timeRange;
            this.price = price;
        }
        public void getInfo(){
            System.out.println("Парк "+ park_name + ", Аттракцион: " + name + ", Время работы: " +
                    timeRange + ", Цена: " + price + " руб.");
        }
    }

    public void getAttractions() {
        for (int i = 0; i < attractions.length; i++) {
            attractions[i].getInfo();
        }
    }
}
