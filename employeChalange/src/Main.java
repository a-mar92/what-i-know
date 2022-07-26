public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Andrzej", "Kowalski");
        Administrator administrator = new Administrator("TEST", "TSET","ISO 800");
        Programmer programmer = new Programmer( "Jaro","Kieł", "DUPA");
        Programmer programmer2 = new Programmer("JAVA");

        employee.printEmployee();
        administrator.printEmployee();
        programmer.printEmployee();
        programmer2.printEmployee();



    }
}