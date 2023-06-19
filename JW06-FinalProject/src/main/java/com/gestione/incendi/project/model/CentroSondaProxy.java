package com.gestione.incendi.project.model;

import com.gestione.incendi.project.interfaccia.RilevatoreSonda;

public class CentroSondaProxy implements RilevatoreSonda {
    private Sonda sonda;
    private CentroControllo centroControllo;

    public CentroSondaProxy(Sonda sonda, CentroControllo centroControllo) {
        this.sonda = sonda;
        this.centroControllo = centroControllo;
        this.sonda.addRilevatore(this);
    }

    @Override
    public void rilevaIncendio(Sonda sonda) {
    }

    @Override
    public void segnaleAllarme(Sonda sonda) {
    	centroControllo.segnaleAllarme(sonda);
    }

    public String getIdSonda() {
        return sonda.getId_Sonda();
    }

    public double getLatitudine() {
        return sonda.getLatitudine();
    }

    public double getLongitudine() {
        return sonda.getLongitudine();
    }

    public int getSmokeLevel() {
        return sonda.getSmokeLevel();
    }
}
