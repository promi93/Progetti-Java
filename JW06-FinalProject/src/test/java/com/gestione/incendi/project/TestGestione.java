package com.gestione.incendi.project;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.gestione.incendi.project.model.CentroControllo;
import com.gestione.incendi.project.model.CentroSondaFactory;
import com.gestione.incendi.project.model.CentroSondaProxy;
import com.gestione.incendi.project.model.Sonda;

@SpringBootTest
public class TestGestione {
    private CentroControllo centroControllo;
    private Sonda sonda;
    private CentroSondaProxy proxy;

    @BeforeEach
    void setUp() {
    	centroControllo = mock(CentroControllo.class);
    	sonda = CentroSondaFactory.createSensoreIncendio("Sonda1", 42.1234, 13.5678);
        proxy = CentroSondaFactory.createSensoreIncendioProxy(sonda, centroControllo);
    }

    @Test
    void testFireDetection() {
    	sonda.rilevaFuoco(6);
        verify(centroControllo, times(1)).segnaleAllarme(sonda);
    }

    @Test
    void testSmokeLevel() {
    	sonda.rilevaFuoco(3);
        assertEquals(3, proxy.getSmokeLevel());
    }

    @Test
    void testAlarmURL() {
    	sonda.rilevaFuoco(7);
        String expectedURL = "http://host/alarm?id_sonda=Sonda1&lat=42.1234&lon=13.5678&smokelevel=7";
 
        
        verify(centroControllo, times(1)).segnaleAllarme(sonda);   
        
       
    }

}

