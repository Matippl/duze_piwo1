package pl.edu.nauka;

import java.util.List;

public interface Kartoteka {
    @Deprecated
    void dodajUcznia(Uczen uczen);

    Uczen wyszukajUcznia(String imie, String nazwisko);

    Uczen wyszukajUcznia(Long id);




    void  zmienDane(Uczen uczen);

    void usunUcznia(String imie, String nazwisko);

    List<Uczen> getUczniowie();

}
