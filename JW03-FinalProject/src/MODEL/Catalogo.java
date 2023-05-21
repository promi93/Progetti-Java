package MODEL;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "catalogo")

@Entity
public class Catalogo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "codiceISBN")
	private String codiceISBN;
	
	@Column(nullable = false)
	private String titolo;
	
	@Column(nullable = false)
	private LocalDate anno_pubblicazione;
	
	@Column(nullable = false)
	private Integer numero_pagine;

	
	
	public Catalogo() {
		super();
	}



	public Catalogo(String codiceISBN, String titolo, LocalDate anno_pubblicazione, Integer numero_pagine) {
		super();
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.anno_pubblicazione = anno_pubblicazione;
		this.numero_pagine = numero_pagine;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCodiceISBN() {
		return codiceISBN;
	}



	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}



	public String getTitolo() {
		return titolo;
	}



	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	public LocalDate getAnno_pubblicazione() {
		return anno_pubblicazione;
	}



	public void setAnno_pubblicazione(LocalDate anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}



	public Integer getNumero_pagine() {
		return numero_pagine;
	}



	public void setNumero_pagine(Integer numero_pagine) {
		this.numero_pagine = numero_pagine;
	}



	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", codiceISBN=" + codiceISBN + ", titolo=" + titolo + ", anno_pubblicazione="
				+ anno_pubblicazione + ", numero_pagine=" + numero_pagine + "]";
	}

	

	
}
