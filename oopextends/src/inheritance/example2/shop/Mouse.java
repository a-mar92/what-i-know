package inheritance.example2.shop;

public class Mouse extends Product {
    int mouseButtonNumber ;

    public Mouse(int mouseButtonNumberm,String name) {
        this.name=name;
        this.mouseButtonNumber = mouseButtonNumber;
        price = 25;
    }

    public Mouse() {
        mouseButtonNumber= 3;
        name = "logiteh";
        price = 25;
        manufactured ="3kw";
        yearProduction = 2022;


    }
    public void printIformationAboutProtuct(){
        super.printIformationAboutProtuct();
        System.out.println("button number" + mouseButtonNumber);
    }
}
