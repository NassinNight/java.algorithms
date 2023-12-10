import javax.swing.text.html.parser.Element;
import java.util.List;

public class KsiazkaAdresowa {

    MyLinkedList<Osoba> ListaOsob = new MyLinkedList<>();


    public void dodajOsobe(Osoba newOsoba) {
        ListaOsob.add(newOsoba);

    }

    public void usunOsobe(Osoba osoba) {
        ListaOsob.remove(osoba);
    }

    public void wyswietl(){
        ListaOsob.wyswietl();
    }

    public void wyszukajOsobePoImieniu(String imie) {
        for (int i = 0; i < ListaOsob.lenght(); i++) {
            if (ListaOsob.getElement(i).getImie().equals(imie)) {
                System.out.println(ListaOsob.getElement(i));
            }
        }
    }
    public void wyszukajOsobePoINazwisku(String nazwisko) {
        for (int i = 0; i < ListaOsob.lenght(); i++) {
            if (ListaOsob.getElement(i).getNazwisko().equals(nazwisko)) {
                System.out.println(ListaOsob.getElement(i));
            }
        }
    }



    @Override
    public String toString() {
        return "KsiazkaAdresowa{" +
                "ListaOsob=" + ListaOsob +
                '}';
    }


}
