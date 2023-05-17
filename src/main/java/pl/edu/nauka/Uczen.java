package pl.edu.nauka;

import lombok.Getter;
import lombok.ToString;
import pl.edu.util.Table;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.SignStyle;
@ToString
@Getter
@Table(name = "UCZEN")
public class Uczen extends Osoba1 {

    private String pesel;

    private LocalDate dataUrodzeia;

    public Uczen(Long id, String imie, String nazwisko, String pesel, LocalDate dataUrodzeia) {
        super(id, imie, nazwisko);
        this.pesel = pesel;
        this.dataUrodzeia = dataUrodzeia;
    }
    public Uczen( String imie, String nazwisko, String pesel, LocalDate dataUrodzeia) {
        super(null, imie, nazwisko);
        this.pesel = pesel;
        this.dataUrodzeia = dataUrodzeia;
    }
    public Uczen(Long id, String imie, String nazwisko, LocalDate dataUrodzeia) {
        super(id, imie, nazwisko);
        this.dataUrodzeia = dataUrodzeia;
    }

    public Uczen(Long id, String imie, String nazwisko, String pesel) {
        super(id, imie, nazwisko,pesel);
    }

/*
    private void peselNaDate(String pesel){
        if(pesel == null){
            throw new IllegalArgumentException("Nie podano Peselu");
        }
        if(pesel.length() != 11){
            throw new IllegalArgumentException("Prwaidłowy pesel powinien mieć 11 znaków");
        }

        var rok = "19" + pesel.substring(0,2);
        var miesiac = pesel.substring(2,4);
        //FIXME do obymslenia
        var dzien =   pesel.substring(4,6);
        dataUrodzeia = LocalDate.of(Integer.parseInt(rok), Integer.parseInt(miesiac), Integer.parseInt(dzien));
    }


 */








    @Override
    protected LocalDate peselNaDate(String pesel) {
        if(pesel == null){
            throw new IllegalArgumentException("Nie podano Peselu");
        }
        if(pesel.length() != 11){
            throw new IllegalArgumentException("Prwaidłowy pesel powinien mieć 11 znaków");
        }
        return null;
        //FIXME do obymslenia
    }
}
