import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] list_of_employee = new Employee[5];
        list_of_employee[0] = new Employee("Иванов Иван Иванович", "Продавец", "ivanov123@mail.ru",
                "+79517254001", 30000, 23);
        list_of_employee[1] = new Employee("Петров Петр Петрович", "Охраник", "petrov123@mail.ru",
                "+79201234567", 25000, 45);
        list_of_employee[2] = new Employee("Семёнов Семён Семёнович", "Продавец", "semenov123@mail.ru",
                "+79087644421", 31000, 33);
        list_of_employee[3] = new Employee("Максимов Максим Максимович", "Бухгалтер", "maksimov123@mail.ru",
                "+79087650907", 30000, 29);
        list_of_employee[4] = new Employee("Андреев Андрей Андреевич", "Администратор", "andreev123@mail.ru",
                "+79207098782", 40000, 31);
    }
}