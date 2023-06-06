package com.gestione.prenotazioni.aziendali.runner;

import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BuildingRunner {

    private final BuildingRepository buildingRepository;

    @Autowired
    public BuildingRunner(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
       
        Building building1 = new Building();
        building1.setName("Edificio A");
        building1.setAddress("Via - Don Minzoni, Edificio A");
        building1.setCity("Roma");
        buildingRepository.save(building1);

      
        Building building2 = new Building();
        building2.setName("Edificio B");
        building2.setAddress("Via - Borgo S.Pietro, Edificio B");
        building2.setCity("Milano");
        buildingRepository.save(building2);

        
    }
}
