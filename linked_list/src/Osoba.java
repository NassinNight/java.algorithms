import java.util.Objects;

public class Osoba extends KsiazkaAdresowa{
    private String imie;
    private String nazwisko;
    private int numer_telefonu;
    private String adres_email;

    public Osoba() {
        this.imie="Jan";
        this.nazwisko="Kowalski";
        this.numer_telefonu=123456789;
        this.adres_email="jan.kowalski@gmail.com";
    }

    public Osoba(String imie, String nazwisko, int numer_telefonu, String adres_email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_telefonu = numer_telefonu;
        this.adres_email = adres_email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(int numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public String getAdres_email() {
        return adres_email;
    }

    public void setAdres_email(String adres_email) {
        this.adres_email = adres_email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return numer_telefonu == osoba.numer_telefonu && Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(adres_email, osoba.adres_email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numer_telefonu, adres_email);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer_telefonu=" + numer_telefonu +
                ", adres_email='" + adres_email + '\'' +
                '}';
    }
}
