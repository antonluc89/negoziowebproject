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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		String iDParametroUpdate = request.getParameter("parametroId");
		
		NegozioService negozioServiceInstance = MyServiceFactory.getNegozioServiceInstance();

	
		int numeroArticoliParse=0;
	Long idParsato= Long.parseLong(iDParametroUpdate);
		String nomeDaAggiornare = request.getParameter("nomeUpdate");
		String partitaIvaDaAggiornare = request.getParameter("partitaIvaUpdate");
		String numeroArticoliDaAggiornare = request.getParameter("numeroArticoliUpdate");
		String indirizzoDaAggiornare = request.getParameter("indirizzoUpdate");
		String numeroTelefonicoDaAggiornare = request.getParameter("numeroTelefonicoUpdate");
		
		numeroArticoliParse = Integer.parseInt(numeroArticoliDaAggiornare);

		
		destinazione = "listaNegozi.jsp";
		try {
			Negozio negozioUpdate = new Negozio();
			negozioUpdate.setIdNegozio(idParsato);
			negozioUpdate.setNome(nomeDaAggiornare);
			negozioUpdate.setPartitaIva(partitaIvaDaAggiornare);
			negozioUpdate.setNumeroArticoli(numeroArticoliParse);
			negozioUpdate.setIndirizzo(indirizzoDaAggiornare);
			negozioUpdate.setNumeroTelefonico(numeroTelefonicoDaAggiornare);
			request.setAttribute("abitanteDaModificare",
					MyServiceFactory.getNegozioServiceInstance().aggiorna(negozioUpdate));
			String modificaEffettuata = ("Proprietà del negozio modificate");
			
			request.setAttribute("modificaEffettuata", modificaEffettuata);
			request.setAttribute("listAttributeNegozio", negozioServiceInstance.listNegozi());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}