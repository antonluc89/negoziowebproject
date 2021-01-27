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

@WebServlet("/PreparedDeleteServlet")
public class PreparedDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PreparedDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;
		String idParameterNegozioDelete = request.getParameter("parametroId");

		NegozioService negozioServiceInstance = MyServiceFactory.getNegozioServiceInstance();

		try {
			Negozio result = negozioServiceInstance
					.cercaPerId(Long.parseLong(idParameterNegozioDelete));
			request.setAttribute("negozioDaEliminare", result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		destinazione = "deleteNegozio.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws NumberFormatException, ServletException, IOException {

	}
}