package com.gestione.incendi.project.model;



public class CentroSondaFactory {
    public static Sonda createSensoreIncendio(String idSonda, double latitudine, double longitudine) {
        return new Sonda(idSonda, latitudine, longitudine);
    }

    public static CentroSondaProxy createSensoreIncendioProxy(Sonda sonda, CentroControllo controlCenter) {
        return new CentroSondaProxy(sonda, controlCenter);
    }
}
