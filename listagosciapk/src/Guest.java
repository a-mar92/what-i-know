import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Guest {
    private String name;
    private int phoneNumber;
    private String meal;
    boolean isVegan;



    public Guest(String name, int phoneNumber, String meal,boolean isVegan) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.meal = meal;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public String getMeal() {
        return meal;
    }
    public void displayGuestInformation(){
        System.out.println("Name "+ name);
        System.out.println("phone "+ phoneNumber);
        System.out.println("meal "+ meal);

        String isVeganString = isVegan ? "yes": "no";
    System.out.println("vegan "+ isVeganString);

    }


}
