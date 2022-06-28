import java.util.ArrayList;

public class Gracz {
    private String imie;
    private ArrayList<Karta> kartaWDloni;

    public Gracz(String imie) {
        kartaWDloni = new ArrayList<>();
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void dodajKarteDoReki(Karta nowaKarta) {
        kartaWDloni.add(nowaKarta);
    }

    public int liczeniePunktow() {
        int sumaPunktów = 0;
        int wartoscJednejKarty;
        int iloscAsów = 0;

        for (int i = 0; i < kartaWDloni.size(); i++) {
            wartoscJednejKarty = kartaWDloni.get(i).getWartoscKart().getValue();

            if (wartoscJednejKarty == 11) {
                iloscAsów++;
                sumaPunktów += 11;
            } else {
                sumaPunktów += wartoscJednejKarty;
            }
        }
        while (sumaPunktów > 21 && iloscAsów > 0) {
            sumaPunktów -= 10;
            iloscAsów--;
        }
        return sumaPunktów;
    }

    public void wyscwietlKarty(boolean piewszaKarta) {
        System.out.println(imie + ":");
        System.out.println(" "+getKartyWRece(piewszaKarta) + " ");

        if (piewszaKarta) {
            System.out.println("Punkty: " + liczeniePunktow());
        } else {
            System.out.println("Punkty : ?");
        }
    }

    public String getKartyWRece(boolean piewszaKarta) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kartaWDloni.size(); i++) {
            if (i == 0 && !piewszaKarta) {
                sb.append("Katra Ukryta  ");
            } else {
                sb.append(" " +kartaWDloni.get(i).toString());
            }
        }
        return sb.toString();
    }

    public boolean czyPrzegrany() {
        if (liczeniePunktow() < 22) {
            return false;
        }
        return true;
    }

}
