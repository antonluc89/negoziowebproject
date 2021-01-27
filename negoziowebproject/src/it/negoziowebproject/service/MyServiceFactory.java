package it.negoziowebproject.service;

import it.negoziowebproject.dao.MyDaoFactory;
import it.negoziowebproject.service.negozio.NegozioService;
import it.negoziowebproject.service.negozio.NegozioServiceImpl;

public class MyServiceFactory {
	private static NegozioService NEGOZIO_SERVICE_INSTANCE;

	public static NegozioService getNegozioServiceInstance() {
		if (NEGOZIO_SERVICE_INSTANCE == null)
			NEGOZIO_SERVICE_INSTANCE = new NegozioServiceImpl();

		NEGOZIO_SERVICE_INSTANCE.setNegozioDAO(MyDaoFactory.getNegozioDAOInstance());

		return NEGOZIO_SERVICE_INSTANCE;
	}
}
