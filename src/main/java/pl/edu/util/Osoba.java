package pl.edu.util;


import pl.edu.service.Obiekt;


public class Osoba implements Obiekt {

    String imie;
    String nazwisko;

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String przedstawSie() {
        return imie + " " + nazwisko;
    }
}
