package inheritance.example2.shop;

public class Monitor extends Product{
   int resolution;
    ;
    Monitor(){
        resolution= 1080;
        name = "samsung";
       price = 500;
       manufactured ="4kMMM";
       yearProduction = 2022;


    }

    @Override
    public void printIformationAboutProtuct() {
        super.printIformationAboutProtuct();
        System.out.println(" resolution : " + resolution);
    }
}
