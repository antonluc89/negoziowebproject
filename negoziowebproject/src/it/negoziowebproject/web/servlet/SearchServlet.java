package it.negoziowebproject.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.negoziowebproject.service.MyServiceFactory;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		
	String numeroArticoliInsert = request.getParameter("numeroArticoliInput");
	int numeroArticoliInsertParse= Integer.parseInt(numeroArticoliInsert);
	
		if
			 (numeroArticoliInsert.equals("")) {
			String messageInput = "Inserisci campo.";
			request.setAttribute("messaggioDiErrore", messageInput);
				destinazione = "searchPage.jsp";
			}else {
				try {
					request.setAttribute("listAttributeNegozio",
							MyServiceFactory.getNegozioServiceInstance().cercaPerNumeroArticoliMaggioreDi(numeroArticoliInsertParse));
				} catch (Exception e) {
				e.printStackTrace();
				}
				destinazione = "listaNegozi.jsp";
			}
			

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}
}