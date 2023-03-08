package pl.edu.nauka;

import java.util.Arrays;
import java.util.Random;

public class Tablice {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        for(int i =0; i<10; i++){
            tab[i] = random.nextInt(20);


        }
        System.out.println("Tablica przed sortowaniem "+ Arrays.toString(tab));
        for(int i =0; i<10; i++){
            for(int j =i; j<10; j++){
                if(tab[i]>tab[j]){
                    int tmp = tab[i];
                    tab[i] = tab[j];
                    tab[j] =tmp;
                }
            }
        }
        System.out.println("Tablica po sortowaniem "+ Arrays.toString(tab));
    }
}
