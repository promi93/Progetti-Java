package MODEL;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "prestiti")
public class Prestito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "utente")
	private Integer utente;
	
	@Column(nullable = false)
	private String elemento_prestato;
	
	@Column(nullable = false)
	private LocalDate inizio_prestito;
	
	@Column(nullable = false)
	private LocalDate data_restituzione_prevista;
	
	@Column(nullable = false)
	private LocalDate data_restituzione_effettiva;

	
	
	public Prestito() {
		super();
	}



	public Prestito(Integer utente, String elemento_prestato, LocalDate inizio_prestito,
			LocalDate data_restituzione_prevista, LocalDate data_restituzione_effettiva) {
		super();
		this.utente = utente;
		this.elemento_prestato = elemento_prestato;
		this.inizio_prestito = inizio_prestito;
		this.data_restituzione_prevista = data_restituzione_prevista;
		this.data_restituzione_effettiva = data_restituzione_effettiva;
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



	public String getElemento_prestato() {
		return elemento_prestato;
	}



	public void setElemento_prestato(String elemento_prestato) {
		this.elemento_prestato = elemento_prestato;
	}



	public LocalDate getInizio_prestito() {
		return inizio_prestito;
	}



	public void setInizio_prestito(LocalDate inizio_prestito) {
		this.inizio_prestito = inizio_prestito;
	}



	public LocalDate getData_restituzione_prevista() {
		return data_restituzione_prevista;
	}



	public void setData_restituzione_prevista(LocalDate data_restituzione_prevista) {
		this.data_restituzione_prevista = data_restituzione_prevista;
	}



	public LocalDate getData_restituzione_effettiva() {
		return data_restituzione_effettiva;
	}



	public void setData_restituzione_effettiva(LocalDate data_restituzione_effettiva) {
		this.data_restituzione_effettiva = data_restituzione_effettiva;
	}



	@Override
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente + ", elemento_prestato=" + elemento_prestato
				+ ", inizio_prestito=" + inizio_prestito + ", data_restituzione_prevista=" + data_restituzione_prevista
				+ ", data_restituzione_effettiva=" + data_restituzione_effettiva + "]";
	}
	
	
	

	

	
}
