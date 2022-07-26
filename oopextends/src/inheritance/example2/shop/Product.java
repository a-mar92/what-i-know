package inheritance.example2.shop;

public class Product {
    public String name;
    public int price;
    public String manufactured ;
    public int yearProduction;

    Product(){
        name= "test";
        price=0;
        manufactured= null;
        yearProduction= 0;
    }

    public void printIformationAboutProtuct(){
        System.out.print("Name: "+name +" price: "+price+" manufactured :"+ manufactured +" Year production: "+ yearProduction);
    }

}
