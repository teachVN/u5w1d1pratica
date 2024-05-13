package it.epicode.u5w1d1pratica.bean;

import lombok.Data;

@Data
public class Bevanda extends VoceDiMenu{
    private int ml;
    private String nome;
    private int gradoAlcohol;
}
