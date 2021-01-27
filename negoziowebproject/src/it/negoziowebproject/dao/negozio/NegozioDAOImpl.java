package it.negoziowebproject.dao.negozio;

import java.util.ArrayList;
import java.util.List;

import it.negoziowebproject.dao.DB_MOCK;
import it.negoziowebproject.model.Negozio;

public class NegozioDAOImpl implements NegozioDAO{


	@Override
	public List<Negozio> list() throws Exception {
		return DB_MOCK.LISTA_NEGOZI;
	}

	@Override
	public Negozio get(Long id) throws Exception{
		Negozio result = new Negozio();
		for (Negozio negozioItem : DB_MOCK.LISTA_NEGOZI) {
			if (negozioItem.getIdNegozio().equals(id))
				result = negozioItem;
		}
		return result;
	}

	@Override
	public int insert(Negozio negozioInput) throws Exception {
		Long lastNegozio = (long) DB_MOCK.LISTA_NEGOZI.size();
		negozioInput.setIdNegozio(lastNegozio);
		DB_MOCK.LISTA_NEGOZI.add(negozioInput);
		return 1;
	}
	
	@Override
	public int delete(Negozio negozioInput) throws Exception {
				DB_MOCK.LISTA_NEGOZI.remove(negozioInput);
		return 1;
	}
	
	@Override
	public int update(Negozio negozioInput) throws Exception {
		List<Negozio> list=this.list();
		Negozio negozioUpdate=this.get(negozioInput.getIdNegozio());
		list.remove(negozioUpdate);
		list.add(negozioInput);
		
		return 1;
	}
	
	@Override
	public List<Negozio> findByNumeroArticoliMoreThan(int numeroArticoli) {
		List<Negozio> result = new ArrayList<>();
		for (Negozio negozioItem : DB_MOCK.LISTA_NEGOZI) {
			if (negozioItem.getNumeroArticoli()>numeroArticoli)
				result.add(negozioItem);
		}
		return result;
	}



}

