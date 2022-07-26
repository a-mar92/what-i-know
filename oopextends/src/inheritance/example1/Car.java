package inheritance.example1;

public class Car extends Vehicle{
    private  String model;

    Car(){}
    Car(String model, float topSpeed){

        this.model = model;
        this.topSpeed = topSpeed;


        }
    public void printInfo(){
       System.out.println("model: " + model);

    }
}
