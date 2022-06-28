import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 
        black Jack:
        -ZASADY-
        kto bliżej 21  
        W Blackjacka gra się przeciwko krupierowi.
        Gracz i krupier dostają po dwie karty.
        Obydwie karty gracza są odkryte, natomiast tylko jedna karta krupiera jest pokazana graczowi.
        Gracz teraz może podjąć decyzje o swoim następnym ruchu.
        Gracz ma następujące możliwości:
        Dobrać kartę (T).
        Nie dobierać kart (n).
        
        
        Jeżeli gracz po dobraniu kart ma więcej niż 21 punktów, przegrywa
        Jeżeli natomiast gracz ma 21 punktów lub mniej, krupier odkrywa swoją zakrytą kartę
        Wygrywa ten, który ma sumę punktów bliższą lub równą 21.

        -PUNKTOWANIE-
         2-10, wlet, dama, król (10) as (1/11) -> z korzyścią dla gracza

                */
        Gra gra = new Gra();
        gra.rozpoczecieGry();


    }
}