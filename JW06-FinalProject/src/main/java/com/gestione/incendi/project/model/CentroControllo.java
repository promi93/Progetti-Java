package com.gestione.incendi.project.model;

import com.gestione.incendi.project.interfaccia.RilevatoreSonda;

public class CentroControllo implements RilevatoreSonda {
    private String url="http://alarm?";

    public CentroControllo(String url) {
        this.url = url;
    }

    @Override
    public void rilevaIncendio(Sonda sonda) {
    }

    @Override
    public void segnaleAllarme(Sonda sonda) {
    	creaAllarmeUrl(sonda);
    }

    public String allarmeUrl(Sonda sensor) {
        String alarmURL = creaAllarmeUrl(sensor);
        return alarmURL;
        
    }

    public String creaAllarmeUrl(Sonda sonda) {
        return url + "idsonda=" + sonda.getId_Sonda() +
                "&lat=" + sonda.getLatitudine() +
                "&lon=" + sonda.getLongitudine() +
                "&smokelevel=" + sonda.getSmokeLevel();
    }


}
