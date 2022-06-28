import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Talia {
    private ArrayList<Karta> karty;

    public Talia(){
        karty= new ArrayList<>();
        for (int kolor = 0; kolor < 4; kolor++) {
            for (int wartosc = 0; wartosc <13 ; wartosc++) {
                karty.add(new Karta(Kolor.values()[kolor], WartoscKart.values()[wartosc]));
            }
        }

    }
    public void tasowanie(){
        Collections.shuffle(karty);
    }

    public Karta pierwszaKartawRece(){
        return karty.remove(0);

    }

}
