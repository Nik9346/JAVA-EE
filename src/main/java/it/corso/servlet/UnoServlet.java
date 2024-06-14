package it.corso.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// localhost:4545/jee-01/uno?nome=Davide
@WebServlet("/uno") //deve essere univoco
public class UnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeUtente = request.getParameter("nome");
		nomeUtente = nomeUtente != null && !nomeUtente.isEmpty() ? nomeUtente : "Sconosciuto";
		request.setAttribute("nomeUtente", nomeUtente); //utilizzo come riferimento stringa lo stesso nome della variabile
		
		request.getServletContext().getRequestDispatcher("/WEB-INF/view/uno.jsp").forward(request, response); //passiamo la richiesta al file che deve rispondere, gli scarica il compito e gli trasmette anche la richiesta e la risposta.
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
