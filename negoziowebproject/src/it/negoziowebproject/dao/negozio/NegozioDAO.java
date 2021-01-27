package it.negoziowebproject.dao.negozio;

import java.util.List;

import it.negoziowebproject.dao.IBaseDAO;
import it.negoziowebproject.model.Negozio;

public interface NegozioDAO extends IBaseDAO<Negozio> {

	public List<Negozio> findByNumeroArticoliMoreThan(int numeroArticoliInput);

}
