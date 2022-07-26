package inheritance.example3_final;
class Employe{
    String name;
    String jobTitle;
    int salaary;
}
class Manager extends Employe{
    String responsibility;
}
class Director extends Manager{
    String departmeny;
}
class VicePresident extends Director{
    int jobExperience;
}
final class CEO extends VicePresident{
    String companyName;
}


public class Test {
    public static void main(String[] args) {
        CEO ceo = new CEO();
    }
}
