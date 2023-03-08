package pl.edu.nauka;

import java.util.List;

public interface Kartoteka {
    void dodajUcznia(Uczen uczen);

    Uczen wyszukajUcznia(String imie, String nazwisko);

    void  zmienDane(Uczen uczen);

    void usunUcznia(String imie, String nazwisko);

    List<Uczen> getUczniowie();

}
