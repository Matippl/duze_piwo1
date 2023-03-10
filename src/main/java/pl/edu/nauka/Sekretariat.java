package pl.edu.nauka;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Sekretariat {
   static Kartoteka kartoteka = new KartotekaLista();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Dodaj ucznia");
            System.out.println("2 - Wyszukaj ucznia");
            System.out.println("3 - Usun ucznia");
            System.out.println("4 - Zmien dane");
            System.out.println("5 -Wyswietl uczniow");
            System.out.println("6- Koniec");
            int opcja = scanner.nextInt();
            try {
                switch (opcja) {
                    case 1:
                        var uczen = nowyUczen();
                        kartoteka.dodajUcznia(uczen);
                        break;
                    case 2:
                        //FIXME
                        // kartoteka.wyszukajUcznia();
                        break;
                    case 3:
                        System.out.println("usune ucznia");
                        break;
                    case 4:
                        System.out.println("zmienie ucznia");
                        break;
                    case 5:
                      kartoteka.getUczniowie().forEach(System.out::println);
                      System.out.println();
                      break;
                    case 6:
                      System.out.println("Koniec");
                      return;
                    default:
                        System.out.println("Nieprawidłowa opcja");
                        return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();


            }


        }

    }

    private static Uczen nowyUczen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        var imie = scanner.nextLine();
        walidujDane(imie, "Nieprwaidlowe imie");
        System.out.println("Podaj nazwisko");
        var nazwisko = scanner.nextLine();
        walidujDane(nazwisko, "Nieprwaidlowe nazwisko");
        System.out.println("Podaj date urodenia");
        var dataUrodzeia = scanner.nextLine();
        walidujDane(dataUrodzeia, "Nieprwaidlowe dataurodzenia");


        try {
            var id= GeneratorId.generuj(kartoteka.getUczniowie());
            return new Uczen(id,imie, nazwisko, LocalDate.parse(dataUrodzeia));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Nieprawidlowa data", e);
        }
    }

    private static void walidujDane(String dane, String komunikat) {
        if (dane == null || dane.trim().equals("")) {
            throw new IllegalArgumentException(komunikat);
        }
    }
}














