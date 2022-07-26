package inheritance.example2.shop;

public class Keyboard  extends Product{
    int keyboardButtonNumber;


    Keyboard(){
        keyboardButtonNumber = 108;
        name = "logiteh";
        price = 50;
        manufactured ="3kw";
        yearProduction = 2022;

    }

    @Override
    public void printIformationAboutProtuct() {
        super.printIformationAboutProtuct();
        System.out.println("key: " + keyboardButtonNumber);
    }
}
