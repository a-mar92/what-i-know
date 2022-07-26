public class Programmer extends Employee {
    String language;

    public Programmer(String name, String surname,String language){

        super(name,surname);
        this.language=language;

    }
    public Programmer(String language){


        this.language = language;
    }

    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println(" language code  :"+ language);
    }
}
