public class Administrator extends Employee{
    String certyficate;

    public Administrator(String name, String surname, String certyficate) {
        super(name, surname);
        this.certyficate = certyficate;
    }

    public Administrator(String certyficate) {
        this.certyficate = certyficate;
    }

    @Override
    public void printEmployee() {
        System.out.println();
        super.printEmployee();
        System.out.println( " certyficate : " + certyficate);
    }
}
