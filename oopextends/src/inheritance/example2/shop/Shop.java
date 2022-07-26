package inheritance.example2.shop;

public class Shop {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();

        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        Mouse mouse1 = new Mouse(2,"ttttt");
        Computer computer1 = new Computer(mouse1,monitor,keyboard);


        //mouse.printIformationAboutProtuct();
        //monitor.printIformationAboutProtuct();
        //keyboard.printIformationAboutProtuct();
        computer.komputerInfo();
        computer1.komputerInfo();
        System.out.println(computer.monitor.price);
        System.out.println();
        System.out.println(computer.price);
        System.out.println(computer1.price);
    }
}
