public class Karta {
    private Kolor kolorKarty;
    private WartoscKart wartoscKart;

    public Karta(Kolor kolor, WartoscKart wartosc) {
        kolorKarty = kolor;
        wartoscKart = wartosc;
    }

    public Kolor getKolorKarty() {
        return kolorKarty;
    }

    public WartoscKart getWartoscKart() {
        return wartoscKart;
    }
    public String toString(){
        return wartoscKart.toString()+" " + kolorKarty.toString();
    }
}
