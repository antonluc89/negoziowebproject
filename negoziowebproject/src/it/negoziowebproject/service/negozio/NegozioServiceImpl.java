package it.negoziowebproject.service.negozio;

import java.util.List;

import it.negoziowebproject.dao.negozio.NegozioDAO;
import it.negoziowebproject.model.Negozio;

public class NegozioServiceImpl implements NegozioService{
	
	private NegozioDAO negozioDAO;

	@Override
	public void setNegozioDAO(NegozioDAO negozioDAO) {
		this.negozioDAO=negozioDAO;
	}

	@Override
	public List<Negozio> listNegozi() throws Exception {
		return negozioDAO.list();

	}
	
	@Override
	public Negozio cercaPerId(Long id) throws Exception{
		return negozioDAO.get(id);
	}

	@Override
	public int inserisci(Negozio negozioInput) throws Exception {
		return negozioDAO.insert(negozioInput);
	}

	@Override
	public int elimina(Negozio negozioInput) throws Exception {
	return negozioDAO.delete(negozioInput);
	}

	@Override
	public int aggiorna(Negozio negozioInput) throws Exception {
		return negozioDAO.update(negozioInput);
	}

	@Override
	public List<Negozio> cercaPerNumeroArticoliMaggioreDi(int numeroArticoliInput) throws Exception{
		return negozioDAO.findByNumeroArticoliMoreThan(numeroArticoliInput);
	}

}
