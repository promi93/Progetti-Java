package MODEL;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "utenti")
public class Utenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(nullable = false)
	private Integer utente;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private LocalDate data_nascita;
	
	@Column (nullable = false)
	private Long numero_tessera;

	
	
	public Utenti() {
		super();
	}



	public Utenti(Integer utente, String nome, String cognome, LocalDate data_nascita, Long numero_tessera) {
		super();
		this.utente = utente;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.numero_tessera = numero_tessera;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getUtente() {
		return utente;
	}



	public void setUtente(Integer utente) {
		this.utente = utente;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public LocalDate getData_nascita() {
		return data_nascita;
	}



	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}



	public Long getNumero_tessera() {
		return numero_tessera;
	}



	public void setNumero_tessera(Long numero_tessera) {
		this.numero_tessera = numero_tessera;
	}



	@Override
	public String toString() {
		return "Utenti [id=" + id + ", utente=" + utente + ", nome=" + nome + ", cognome=" + cognome + ", data_nascita="
				+ data_nascita + ", numero_tessera=" + numero_tessera + "]";
	}
	

	
	
	
}
