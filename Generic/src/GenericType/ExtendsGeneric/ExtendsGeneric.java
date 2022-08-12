package GenericType.ExtendsGeneric;

public class ExtendsGeneric {
    public static void main(String[] args) {
        Organisation<Employee> employeeOrganisation = new Organisation<>();
        employeeOrganisation.addParticipans(new Employee("Kuba","Java"));
        employeeOrganisation.addParticipans(new Employee("Kasia","Sekretariat"));
        employeeOrganisation.addParticipans(new Employee("Tadeo","Grafika"));
        employeeOrganisation.addParticipans(new Contractor("Paweł","Monter","Philips"));


        employeeOrganisation.printParticipants();

    }
}
