package GenericType.ExtendsGeneric;

public class Contractor extends Employee{
    private String nameCompany;

    public Contractor(String name, String jobTitle, String nameCompany) {
        super(name, jobTitle);
        this.nameCompany = nameCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name Company='" + nameCompany + '\'' +
                 "name =" + this.getName()+
                " job Title" + this.getJobTitle()+
                '}';
    }
}
