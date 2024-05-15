package it.epicode.u5w1d1pratica.bean;

import it.epicode.u5w1d1pratica.enumeration.Stato;
import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int maxCoperti;
    private Stato stato;
    private double coperto;

}
