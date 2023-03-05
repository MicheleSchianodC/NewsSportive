package model;

public class Articoli {

	private String titolo;
	private String descrizione;
	private String immagine;
	
	public Articoli() {
		
	}
	
	public Articoli(String titolo,String descrizione,String immagine) {
		this.titolo=titolo;
		this.descrizione=descrizione;
		this.immagine=immagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
	
	
}
