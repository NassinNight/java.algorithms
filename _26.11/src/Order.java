import java.util.ArrayList;

public class Order {
    private int kwota;
    private String nazwa_produktu;
    private int key;


    public Order() {
        kwota = 100;
        nazwa_produktu = "Klawiatura";
        key = 109376629;
    }
    public Order(int kwota, String nazwa_produktu, int key) {
        this.kwota=kwota;
        this.nazwa_produktu = nazwa_produktu ;
        this.key = key;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public String getNazwa_produktu() {
        return nazwa_produktu;
    }

    public void setNazwa_produktu(String nazwa_produktu) {
        this.nazwa_produktu = nazwa_produktu;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Order{" +
                "kwota=" + kwota +
                ", nazwa_produktu='" + nazwa_produktu + '\'' +
                ", key=" + key +
                '}';
    }
}

