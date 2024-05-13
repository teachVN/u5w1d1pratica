package it.epicode.u5w1d1pratica.bean;

import lombok.Data;

import java.util.List;

@Data
public class Pizza extends VoceDiMenu{
    private String nome;
    private List<Ingrediente> ingredienti;
    private boolean xl;
}
