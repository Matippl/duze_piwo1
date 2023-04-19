package pl.edu.nauka;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Sekretariat {
   static Kartoteka kartoteka = new KartotekaDb();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Dodaj ucznia");
            System.out.println("2 - Wyszukaj ucznia");
            System.out.println("3 - Usun ucznia");
            System.out.println("4 - Zmien dane");
            System.out.println("5 -Wyswietl uczniow");
            System.out.println("6- Wyszukaj ucznia po imieniu i nazwisku");
            System.out.println("7 -Koniec");
            int opcja = scanner.nextInt();
            try {
                switch (opcja) {
                    case 1:
                        var uczen = nowyUczen();
                        kartoteka.dodajUcznia(uczen);
                        break;
                    case 2:
                        wyszukajUcznia();
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
                      System.out.println("Wyszukiwanie po imieniu i nazwisku");
                      break;
                    case 7:
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
        System.out.println("Podaj pesel");
        var pesel = scanner.nextLine();
        return new Uczen(imie, nazwisko,pesel, LocalDate.parse(dataUrodzeia));
        /*
        //FIXME do przeniesienia do implementacji kartoteka lista
        try {
            var id= GeneratorId.generuj(kartoteka.getUczniowie());
            return new Uczen(id,imie, nazwisko, LocalDate.parse(dataUrodzeia));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Nieprawidlowa data", e);
        }

         */
    }

    private static void walidujDane(String dane, String komunikat) {
        if (dane == null || dane.trim().equals("")) {
            throw new IllegalArgumentException(komunikat);
        }
    }

    private static void wyszukajUcznia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id");
        var id = scanner.nextLong();
        var uczen = kartoteka.wyszukajUcznia(id);
        if(uczen!=null){
            System.out.println(uczen);
        }
        else{
            System.out.println("Nie znaleziono ucznia!!!");
        }
    }


    private static void wyszukajUcznia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        var imie = scanner.nextLine();
        System.out.println("Podaj Nazwisko");
        var nazwisko = scanner.nextLine();
        var uczen = kartoteka.wyszukajUcznia(imie,nazwisko);
        if(uczen!=null){
            System.out.println(uczen);
        }
        else{
            System.out.println("Nie znaleziono ucznia!!!");
        }
    }
}














