public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Сотрудник " + fio + " " + age + " лет, должность: " + position + " с зарплатой " + salary
                            + "\nКонтактная информация: " + phone + " " + email + "\n");
    }
}
