package pl.edu.nauka;

public class Polekwadratu {
    public static void main(String[] args) {

        int liczba = 100;
        liczba -= 10;
        liczba += 5;
        liczba *= 2;
        liczba /= 3;
        liczba++;
        System.out.println(liczba);
        System.out.println(Math.pow(8, 3));
        System.out.println(poleK(3, 5));
        System.out.println(dzielenie( -50.0, -25.0));
    }

    static int poleK(int a, int b) {
        return a * b;

    }

    static double dzielenie(double c, double d) {
        if(c < 0 || d < 0){
            System.out.print("c nie moze byc mniejsze od 0");
        }

        if (d == 0) {
            throw new IllegalArgumentException("Nie dziel przez 0 !!!");
        }
        return c / d;

    }
}
