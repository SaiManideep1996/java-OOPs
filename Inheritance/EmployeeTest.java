public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 45000);
        Manager m1 = new Manager("Prathyusha", 70000, 10000);

        e1.displayInfo();
        m1.displayInfo();
    }
}
