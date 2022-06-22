public class Truck {
    private String producent;
    private String model;
    private  int iloscKol;
    private String kolor;
    private final int topSpeed = 100;
    private int acceleration;

    public Truck(){
        this.producent= "Freighton";
        this.model = "9664";
        this.iloscKol = 6;
        this.acceleration =60;

 }

    public Truck(String kolor) {
    this();
      this.kolor=kolor;

    }
    public void info (){
        System.out.print(producent);
        System.out.print(model);
        System.out.println(kolor);
    }
}
