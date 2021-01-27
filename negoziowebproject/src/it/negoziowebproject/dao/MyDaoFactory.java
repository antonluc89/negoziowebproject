package it.negoziowebproject.dao;

import it.negoziowebproject.dao.negozio.NegozioDAO;
import it.negoziowebproject.dao.negozio.NegozioDAOImpl;

public class MyDaoFactory {

	private static NegozioDAO NEGOZIO_DAO_INSTANCE = null;

	public static NegozioDAO getNegozioDAOInstance() {
		if (NEGOZIO_DAO_INSTANCE == null)
			NEGOZIO_DAO_INSTANCE = new NegozioDAOImpl();

		return NEGOZIO_DAO_INSTANCE;
	}
}
