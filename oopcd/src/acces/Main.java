package acces;

import acces.package1.BasicClass;
import acces.package2.OtherClass;

public class Main {
    public static void main(String[] args) {
        OtherClass otherClass = new OtherClass();
        BasicClass basicClass = new BasicClass();
        otherClass.setName("other tomek");
        basicClass.setName("tomek");
        System.out.println(basicClass.getName());
        System.out.println(otherClass.getName());




    }



}