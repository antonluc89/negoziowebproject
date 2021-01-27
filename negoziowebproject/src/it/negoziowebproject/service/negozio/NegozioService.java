package it.negoziowebproject.service.negozio;

import java.util.List;
import it.negoziowebproject.dao.negozio.NegozioDAO;
import it.negoziowebproject.model.Negozio;

public interface NegozioService {
	public void setNegozioDAO(NegozioDAO negozioDAO);

	public List<Negozio> listNegozi() throws Exception;

	public Negozio cercaPerId(Long id) throws Exception;

	public int inserisci(Negozio negozioInput) throws Exception;

	public int elimina(Negozio negozioInput) throws Exception;

	public int aggiorna(Negozio negozioInput) throws Exception;

	public List<Negozio> cercaPerNumeroArticoliMaggioreDi(int numeroArticoliInput) throws Exception;

}
