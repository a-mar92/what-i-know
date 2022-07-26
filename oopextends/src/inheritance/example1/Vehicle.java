package inheritance.example1;

public class Vehicle {
    public String type;
    public String manufacures;
    public float topSpeed;

    Vehicle(){
        type = "Unkown";
        manufacures = "Unkown";
        topSpeed= 0f     ;
    }
    public void printInfo(){
        System.out.println("type: " +type);
        System.out.println("Manufactures: "+manufacures);
        System.out.println("top speed: "+topSpeed);
    }

}
