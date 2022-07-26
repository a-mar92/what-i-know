package inheritance.example2.shop;

public class Computer extends Product{
   public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;
    Computer(){
      keyboard = new Keyboard();
      monitor = new Monitor();
      mouse = new Mouse();

    }

 public Computer(Mouse mouse, Monitor monitor, Keyboard keyboard) {
  this.mouse = mouse;
  this.monitor = monitor;
  this.keyboard = keyboard;
  price = monitor.price+ keyboard.price + mouse.price;
 }

 public void komputerInfo(){
     System.out.println("Your Computer: ");
     System.out.print("Keyboard:");
     keyboard.printIformationAboutProtuct();
     System.out.print("mouse:");
     mouse.printIformationAboutProtuct();
     System.out.print("Monitor:");
     monitor.printIformationAboutProtuct();


    }

}
