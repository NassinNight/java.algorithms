public class Main {
    public static void main(String[] args) {
        KsiazkaAdresowa ksiazkaAdresowa = new KsiazkaAdresowa();
        Osoba osoba = new Osoba("Kacper", "Srodawa", 783143328, "kacper.srodawa@gmail.com");
        ksiazkaAdresowa.dodajOsobe(osoba);
        ksiazkaAdresowa.dodajOsobe(new Osoba());
        ksiazkaAdresowa.wyswietl();
        ksiazkaAdresowa.usunOsobe(osoba);
        ksiazkaAdresowa.wyswietl();
        ksiazkaAdresowa.wyszukajOsobePoImieniu("Kacper");
        ksiazkaAdresowa.wyszukajOsobePoINazwisku("Kowalski");
    }
}