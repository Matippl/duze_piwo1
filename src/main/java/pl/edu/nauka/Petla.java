package pl.edu.nauka;

import java.util.Random;

public class Petla {
    public static void main(String[] args) {
        Random generator = new Random();
        int losowania = 10, los = 0, najmniejsza = 100,najwieksza = 0,iteracje = 0;
                double suma =0;
        do{
            los = generator.nextInt(100);
                    iteracje++;
                    if(los > najwieksza){
                        najwieksza = los;
                    }
                    if(los < najmniejsza)
                        najmniejsza = los;
                    suma = suma + los;
        }while (iteracje < 10);
        System.out.println("Najwieksza wylosowana liczba to" + " " + najwieksza);
        System.out.println("Najmniejsza wylosowana liczba to" + " " + najmniejsza);
        System.out.println("Srednia " + suma/10);
    }
}
