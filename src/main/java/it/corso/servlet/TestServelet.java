package it.corso.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//localhost:4545/jee-01/test?nome=Nicola serve per raggiungere la giusta servlet ad oggi è direttamente implementata nella @webservlet notation, dopo il ? si passano valori da chiedere al server
@WebServlet("/test") // serve per passargli l'import di jakarta webServlet
public class TestServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // con questo metodo andremo a gestire tutte le richieste get
		
		String nomeUtente = request.getParameter("nome");
		String h2;
		try {
			int etaUtente = Integer.parseInt(request.getParameter("eta"));
			h2 = "<h2> La tua età è pari a " + etaUtente + " anni</h2>";
			
		} catch (Exception e) {
			h2="<h2> Non capisco quanti anni hai</h2>";
		}
		
		nomeUtente = nomeUtente != null && !nomeUtente.isEmpty() ? nomeUtente : "Sconosciuto";
		
//		String tagEta = "<h2> La tua età è pari a " + tageta + " anni</h2>";
		String benvenuto = "<h1>Benvenuto in questa applicazione " + nomeUtente + "</h1>" ;
		response.getWriter().append(benvenuto).append(h2); // in questo modo passo la risposta che il server deve dare
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // tutte le richieste Post verranno gestite in questo metodo
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
