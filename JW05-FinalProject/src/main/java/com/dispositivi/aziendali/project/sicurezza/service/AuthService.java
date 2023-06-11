package com.dispositivi.aziendali.project.sicurezza.service;

import com.dispositivi.aziendali.project.sicurezza.payload.LoginDto;
import com.dispositivi.aziendali.project.sicurezza.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
