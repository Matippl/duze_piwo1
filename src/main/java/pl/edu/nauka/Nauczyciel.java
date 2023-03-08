package pl.edu.nauka;

import java.time.LocalDate;

public class Nauczyciel extends Osoba1{

    private Przedmiot przedmiot;

    public Nauczyciel(Long id, String imie, String nazwisko, Przedmiot przedmiot) {
        super(id, imie, nazwisko);
        this.przedmiot = przedmiot;
    }


    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void test(){
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "id" + getId() +
                "imie" + getImie()+
                "nazwisko" + getNazwisko() +
                "przedmiot=" + przedmiot +
                '}';
    }

    @Override
    protected LocalDate peselNaDate(String pesel) {
        return null;
    }
}
