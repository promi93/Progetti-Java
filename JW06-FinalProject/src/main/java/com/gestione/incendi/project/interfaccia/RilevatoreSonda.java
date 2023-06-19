package com.gestione.incendi.project.interfaccia;

import com.gestione.incendi.project.model.Sonda;

public interface RilevatoreSonda {
	
    void rilevaIncendio(Sonda sonda);

    void segnaleAllarme(Sonda sensor);
    
}

