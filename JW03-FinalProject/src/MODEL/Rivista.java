package MODEL;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import ENUM.Periodicita;

@Entity
@DiscriminatorValue("RIVISTA")
@Table(name = "rivista")
public class Rivista extends Catalogo {

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Periodicita periodicita;

	
	
	public Rivista() {
		super();
	}



	public Rivista(Periodicita periodicita) {
		super();
		this.periodicita = periodicita;
	}



	public Periodicita getPeriodicita() {
		return periodicita;
	}



	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}



	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + "]";
	}
	
	
	
}
