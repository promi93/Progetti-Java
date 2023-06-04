package com.gestione.prenotazioni.aziendali.model;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Log {

	private Long id;
	private String token;
	private final String type = "Bearer";
	private String username;
	private List<String> function;
	private Date endOfTime;

}
