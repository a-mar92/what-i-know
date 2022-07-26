public class Employee {

    String name;
    String surname;
    Employee(){}

     Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printEmployee(){
        System.out.print("name : " +name + " surname : " + surname);
    }
}
