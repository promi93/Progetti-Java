package com.gestione.incendi.project.model;

import java.util.ArrayList;
import java.util.List;

import com.gestione.incendi.project.interfaccia.RilevatoreSonda;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Sonda {
    private String id_Sonda;
    private double latitudine;
    private double longitudine;
    private int smokeLevel;
    private RilevatoreSonda rilevatore;

   
    public Sonda(String id_Sonda, double latitudine, double longitudine) {
        this.id_Sonda = id_Sonda;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }


    public void setRilevatore(RilevatoreSonda rilevatore) {
        this.rilevatore = rilevatore;
    }

    public void rilevaFuoco(int smokeLevel) {
        this.smokeLevel = smokeLevel;
        if (smokeLevel > 5) {
            for (RilevatoreSonda rileva : rilevatori) {
            	rileva.rilevaIncendio(this);
            }
        }
    }

    public void inviaAllarme() {
        if (rilevatore != null) {
        	rilevatore.segnaleAllarme(this);
        }
    }
    
    private List<RilevatoreSonda> rilevatori = new ArrayList<>();
    
    public void addRilevatore(RilevatoreSonda rileva) {
    	rilevatori.add(rileva);
    }
    
    public void removeListener(RilevatoreSonda rileva) {
    	rilevatori.remove(rileva);
    }
    
  



}
