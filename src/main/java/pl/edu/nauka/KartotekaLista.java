package pl.edu.nauka;

import java.util.ArrayList;
import java.util.List;

public class KartotekaLista implements Kartoteka {

    private List<Uczen> uczniowie = new ArrayList<>();


    public void dodajUcznia(Uczen uczen) {
        uczniowie.add(uczen);

    }

    public Uczen wyszukajUcznia(String imie, String nazwisko) {
        for (Uczen uczen : uczniowie) {
            if (uczen.getImie().equalsIgnoreCase(imie) && uczen.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return uczen;
            }
        }
        return null;
    }
    public Uczen wyszukajUcznia(Long id) {
        for (Uczen uczen : uczniowie) {
            if (uczen.getId()==id) {
                return uczen;
            }
        }
        return null;
    }




    @Override
    public void zmienDane(Uczen uczen) {

    }

    public  void usunUcznia(String imie, String nazwisko){
            var uczen  = wyszukajUcznia(imie,nazwisko);
            if(uczen != null){
                uczniowie.remove(uczen);


            }
        }



    public List<Uczen> getUczniowie() {
        return uczniowie;
    }
}
