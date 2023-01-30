import java.util.ArrayList;

class Portal {

    private ArrayList<String> polaPolozenia;

    public void setPolaPolozenia(ArrayList<String> ppol) {
        polaPolozenia = ppol;
    }

    public String sprawdz(String ruch) {
        String wynik = "pudło";

        int indeks = polaPolozenia.indexOf(ruch);

        if (indeks >= 0) {
            polaPolozenia.remove(indeks);

            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }


        }
        return wynik;
    }
}







