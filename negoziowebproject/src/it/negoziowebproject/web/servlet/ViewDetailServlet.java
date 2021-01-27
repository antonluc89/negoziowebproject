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


@WebServlet("/ViewDetailServlet")
public class ViewDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewDetailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		String idParametroDetail = request.getParameter("parametroId");

		NegozioService negozioServiceInstance = MyServiceFactory.getNegozioServiceInstance();

		try {
			Negozio result = negozioServiceInstance
					.cercaPerId(Long.parseLong(idParametroDetail));
			request.setAttribute("negozioDetailPage", result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		destinazione = "detailNegozio.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
