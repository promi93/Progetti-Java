package MODEL;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@DiscriminatorValue("LIBRO")
@Table(name = "libro")
public class Libro extends Catalogo {

	@Column(nullable = false)
	private String autore;
	
	@Column(nullable = false)
	private String genere;

	
	
	public Libro() {
		super();
	}



	public Libro(String autore, String genere) {
		super();
		this.autore = autore;
		this.genere = genere;
	}



	public String getAutore() {
		return autore;
	}



	public void setAutore(String autore) {
		this.autore = autore;
	}



	public String getGenere() {
		return genere;
	}



	public void setGenere(String genere) {
		this.genere = genere;
	}



	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + "]";
	}



	public void setAnno_pubblicazione(int i) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
}
