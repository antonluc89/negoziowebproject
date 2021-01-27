package it.negoziowebproject.model;

public class Negozio {

	private Long idNegozio;
	private String nome;
	private String partitaIva;
	private int numeroArticoli;
	private String indirizzo;
	private String numeroTelefonico;
	
	public Negozio() {
	}

	public Negozio( String nome, String indirizzo, String numeroTelefonico) {
		super();
		this.nome = nome;
		this.indirizzo=indirizzo;
		this.numeroTelefonico=numeroTelefonico;
	}

	public Negozio(Long idNegozio, String nome,String partitaIva,int numeroArticoli, String indirizzo, String numeroTelefonico) {
		super();
		this.idNegozio=idNegozio;
		this.nome = nome;
		this.partitaIva=partitaIva;
		this.numeroArticoli=numeroArticoli;
		this.indirizzo=indirizzo;
		this.numeroTelefonico=numeroTelefonico;
	}

	public Long getIdNegozio() {
		return idNegozio;
	}

	public void setIdNegozio(Long idNegozio) {
		this.idNegozio = idNegozio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public int getNumeroArticoli() {
		return numeroArticoli;
	}

	public void setNumeroArticoli(int numeroArticoli) {
		this.numeroArticoli = numeroArticoli;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	
}
