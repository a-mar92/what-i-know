import java.util.Scanner;

public class Gra {


    Scanner scanner;
    Talia talia;
    Gracz gracz;
    Gracz kupier;


    public Gra() {
        scanner = new Scanner(System.in);
        talia = new Talia();
        talia.tasowanie();
        gracz = new Gracz("Ja");
        kupier = new Gracz("Komputer");
    }

    public void rozpoczecieGry() {
        System.out.println("Witamy w Black Jack");

        gracz.dodajKarteDoReki(talia.pierwszaKartawRece());
        kupier.dodajKarteDoReki(talia.pierwszaKartawRece());

        gracz.dodajKarteDoReki(talia.pierwszaKartawRece());
        kupier.dodajKarteDoReki(talia.pierwszaKartawRece());

        System.out.println();

        gracz.wyscwietlKarty(true);
        kupier.wyscwietlKarty(false);

        boolean graczWGrze = true;
        boolean komputerWGrze = true;
        String odp;
        while (graczWGrze || komputerWGrze) {
            if (graczWGrze) {
                System.out.println("dobrać kartę ? T/N");
                odp = scanner.next();
                if (odp.compareToIgnoreCase("T") == 0) {
                    System.out.println("dobierasz Karte");

                    gracz.dodajKarteDoReki(talia.pierwszaKartawRece());
                    graczWGrze = !gracz.czyPrzegrany();
                    gracz.wyscwietlKarty(true);
                } else {
                    System.out.println("niedobierasz karty");
                    graczWGrze = false;
                }
            }
            if (komputerWGrze) {
                if (kupier.liczeniePunktow() < 17) {
                    System.out.println("Kupier dobiera Karte ");
                    kupier.dodajKarteDoReki(talia.pierwszaKartawRece());
                    komputerWGrze = !kupier.czyPrzegrany();
                    kupier.wyscwietlKarty(false);

                } else {
                    System.out.println("Kupier nie dobiera karty");
                    komputerWGrze = false;
                }
            }

        }
        scanner.close();
        System.out.println("Koniec Gry");
        gracz.wyscwietlKarty(true);
        kupier.wyscwietlKarty(true);
        int sumaGracza = gracz.liczeniePunktow();
        int sumaKupier = kupier.liczeniePunktow();

        if (sumaGracza>sumaKupier && sumaGracza <=21|| sumaKupier>21) {
            System.out.println("Wygrałeś");
        }else {
            System.out.println("Kupier wygrał");
        }
    }}

