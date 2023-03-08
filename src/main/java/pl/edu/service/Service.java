package pl.edu.service;

import lombok.extern.java.Log;
import pl.edu.util.Wyliczenia;
import pl.edu.util.Osoba;

import java.util.ArrayList;
@Log

public class Service {
    public static void main(String[] args) {
var osoby = new ArrayList<Obiekt>();
osoby.add(new Firma("Dupa"));
osoby.add(new Osoba("Kacper", "Miłykijek"));
osoby.forEach(o -> System.out.println(o.przedstawSie()));

    }
}
