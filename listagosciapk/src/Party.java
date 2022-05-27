import com.sun.jdi.IntegerValue;

import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> guestsNumber = new HashMap<>();

    Scanner scanner = new Scanner(System.in);
    public void addUser (){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter your prefer meal");
        String meal = scanner.nextLine();
        System.out.println("enter your phone number");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("do you Vegan ? Y/N");
        String stringVegan = scanner.nextLine();
        boolean isVegan;
        if(stringVegan.equals("Y")){
            isVegan = true;
        }else {
            isVegan = false;
        }
        Guest guest = new Guest(name, phoneNumber, meal, isVegan);
        guests.add(guest);
        meals.add(meal);
        guestsNumber.put(phoneNumber,guest);
        ;

    }
    public void displayMeals (){
        for (String meal : meals){
            System.out.println(meal);
        }
    }
    public void findGuestsByPhoneNumber(){
        System.out.println("enter phone number");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        try{
        Guest guest = guestsNumber.get(phoneNumber);
        guest.displayGuestInformation();}
        catch (NullPointerException e ){
            System.out.println("Wrong phone number");        }

    }
     public void displayGuests(){
        for (Guest guest : guests){
       guest.displayGuestInformation();
            System.out.println();
    }}

    public void menuList() {
        System.out.println("Party Menu");
        System.out.println("Kebab");
        System.out.println("Pizza");
        System.out.println("woda");
        System.out.println("Kawa");
    }
    public void orderMeal(){
        System.out.println("Eneter name");
        String name = scanner.nextLine();
        System.out.println("enter meal from menu list");
        String menu = scanner.nextLine();
        Map<String,String> yourMeal = new HashMap<>();
        yourMeal.put(name,menu);
        System.out.println("You order: ");
        System.out.println(yourMeal.values());

    }
}
