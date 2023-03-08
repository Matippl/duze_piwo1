package pl.edu.nauka;

import java.time.LocalDate;

public abstract class Osoba1 {
    private Long id;

    private String imie;

    private String nazwisko;

    private LocalDate dataUrodzenia;

    private String pesel;


    public Osoba1(Long id, String imie, String nazwisko) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba1(Long id, String imie, String nazwisko,String pesel) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = peselNaDate(pesel);
        this.pesel = pesel;
    }

    protected abstract LocalDate peselNaDate(String pesel);



    public Long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}



