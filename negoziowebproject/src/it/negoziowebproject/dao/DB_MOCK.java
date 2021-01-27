package it.negoziowebproject.dao;

import java.util.ArrayList;
import java.util.List;

import it.negoziowebproject.model.Negozio;

public class DB_MOCK {
	public static final List<Negozio> LISTA_NEGOZI = new ArrayList<>();

	static {
		LISTA_NEGOZI.add(new Negozio(1l, "Benetton", "48561624", 24, "Via dei limbi", "0246329"));
		LISTA_NEGOZI.add(new Negozio(2l, "Armani", "345465754", 15, "Via della luna", "0435696"));
		LISTA_NEGOZI.add(new Negozio(3l, "Serafini", "96433323", 16, "Via gigni", "01463288"));
		LISTA_NEGOZI.add(new Negozio(4l, "Fendi", "39642085", 4, "Via lori", "0561489"));
		LISTA_NEGOZI.add(new Negozio(5l, "Gucci", "47036398", 11, "Via fosca", "0355682"));
		LISTA_NEGOZI.add(new Negozio(6l, "Bulgari", "54928376", 9, "Via Vespucci", "03596645"));
		LISTA_NEGOZI.add(new Negozio(7l, "Oviesse", "19794635", 7, "Via belvedere", "04233952"));
		LISTA_NEGOZI.add(new Negozio(8l, "Nike", "20438594", 19, "Via Cavour", "06852463"));
		LISTA_NEGOZI.add(new Negozio(9l, "Pittarosso", "57463278", 4, "Via dei portici", "082664266"));
	}
}
