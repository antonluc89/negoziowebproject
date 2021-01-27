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


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws NumberFormatException, ServletException, IOException {

		
		String idParameterNegozioDelete = request.getParameter("parametroId");
		String destinazione = null;
		
		NegozioService negozioServiceInstance = MyServiceFactory.getNegozioServiceInstance();

		try {
			Negozio negozioDaRimuovere = negozioServiceInstance
					.cercaPerId(Long.parseLong(idParameterNegozioDelete));
			MyServiceFactory.getNegozioServiceInstance().elimina(negozioDaRimuovere);
			String rimozioneEffettuata = ("Il negozio con id: " + negozioDaRimuovere.getIdNegozio() + " è stato rimosso dalla lista");
			request.setAttribute("rimozioneEffettuata", rimozioneEffettuata);
			request.setAttribute("listAttributeNegozio", MyServiceFactory.getNegozioServiceInstance().listNegozi());
			destinazione = "listaNegozi.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
