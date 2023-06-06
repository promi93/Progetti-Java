package com.gestione.prenotazioni.aziendali.runner;

import com.gestione.prenotazioni.aziendali.model.User;
import com.gestione.prenotazioni.aziendali.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRunner {

    private final UserRepository userRepository;

    @Autowired
    public UserRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        
        User user1 = new User();
        user1.setUsername("user1");
        user1.setFullName("Nome Utente 1");
        user1.setEmail("user1@example.com");
        userRepository.save(user1);

        User user2 = new User();
        user2.setUsername("user2");
        user2.setFullName("Nome Utente 2");
        user2.setEmail("user2@example.com");
        userRepository.save(user2);

      
    }
}
