package acces.example;

public class Product {
    private String name;


  public   Product(){
        this.name = "unknown";
    }
    public Product(String name){
        this.name = name;
    }
     void nameinfo() {
        System.out.println(name);
    }
}
