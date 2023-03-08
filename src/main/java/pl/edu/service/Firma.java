package pl.edu.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Firma implements Obiekt{

    String nazwa;

    public String przedstawSie() {
        return nazwa;
    }
}
