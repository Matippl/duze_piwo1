package pl.edu.nauka;

import java.util.Scanner;

public class Kalkulator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A;
        int B;
        double c;
        double d;
        System.out.println("Program kalkulator co chcesz zrobic?");
        System.out.println("Dodawanie -wcisnij 1");
        System.out.println("odejmowanie - wcisjnij 2");
        System.out.println("Mnozenie - wcisjnij 3");
        System.out.println("Dzielenie - wcisnij 4");

        int wybor = scanner.nextInt();
        if (wybor > 4 || wybor < 1) {
            System.out.println("NIe poprawny wybor");
            return;
        }
        if (wybor == 1) {
            System.out.println("Podaj pierwszą liczbę");
            A = scanner.nextInt();
            System.out.println("Podaj drugą liczbę");
            B = scanner.nextInt();
            int dodawanie = A + B;
            System.out.println("Suma wynosi = " + dodawanie);
            return;
        }
        if (wybor == 2) {
            System.out.println("Podaj pierwszą liczbę");
            A = scanner.nextInt();
            System.out.println("Podaj drugą liczbę");
            B = scanner.nextInt();
            int odejmowanie = A - B;
            System.out.println("Suma wynosi = " + odejmowanie);
        }
        if (wybor == 3) {
            System.out.println("Podaj pierwszą liczbę");
            A = scanner.nextInt();
            System.out.println("Podaj drugą liczbę");
            B = scanner.nextInt();
            int mnozenie = A * B;
            System.out.println("Suma wynosi = " + mnozenie);
        }
        if (wybor == 4) {
            System.out.println("Podaj pierwszą liczbę");
            c = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę");
            d = scanner.nextDouble();
            double dzielenie = c / d;
            System.out.println("Suma wynosi = " + dzielenie);

        }

    }
}

