package it.negoziowebproject.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.negoziowebproject.model.Negozio;
import it.negoziowebproject.service.MyServiceFactory;
import it.negoziowebproject.service.negozio.NegozioService;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String destinazione = null;

		NegozioService negozioServiceInstance = MyServiceFactory.getNegozioServiceInstance();

//		Long idNegozioInsertParse = null;
//		String idNegozioDAInserire = null;
		int numeroArticoliParse=0;
//		String idNegozioDaInserire = request.getParameter("idNegozio");
		String nomeDaInserire = request.getParameter("nomeInput");
		String partitaIvaDaInserire = request.getParameter("partitaIvaInput");
		String numeroArticoliDaInserire = request.getParameter("numeroArticoliInput");
		String indirizzoDaInserire = request.getParameter("indirizzoInput");
		String numeroTelefonicoDaInserire = request.getParameter("numeroTelefonicoInput");
		
		numeroArticoliParse = Integer.parseInt(numeroArticoliDaInserire);
		
		destinazione = "listaNegozi.jsp";
		
		try {
			Negozio negozioInsert = new Negozio();
			negozioInsert.setNome(nomeDaInserire);
			negozioInsert.setPartitaIva(partitaIvaDaInserire);
			negozioInsert.setNumeroArticoli(numeroArticoliParse);
			negozioInsert.setIndirizzo(indirizzoDaInserire);
			negozioInsert.setNumeroTelefonico(numeroTelefonicoDaInserire);
			request.setAttribute("abitanteDaInserire",
					MyServiceFactory.getNegozioServiceInstance().inserisci(negozioInsert));
			String aggiuntaEffettuata = ("Il negozio con nome: " +negozioInsert.getNome()+ " è stato inserito nella lista");
			request.setAttribute("aggiuntaEffettuata", aggiuntaEffettuata);
			request.setAttribute("listAttributeNegozio", negozioServiceInstance.listNegozi());
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}
}