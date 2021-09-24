package co.edu.sena.RegistroUsuario.controller;

import co.edu.sena.RegistroUsuario.model.bean.PersonajeBean;
import co.edu.sena.RegistroUsuario.model.dao.SearchDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;


@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//collect search string from the form
		String searchString = req.getParameter("search");
		
		//call DAO layer and get all products for search criteria
		SearchDAO dao = new SearchDAO();
		List<PersonajeBean> personajes = dao.searchPersonaje(searchString);
		
		//write the products data back to the client browser
		/*String page = getHTMLString(req.getServletContext().getRealPath("/html/searchResults.html"), products);
		resp.getWriter().write(page);*/
		req.setAttribute("personajes", personajes);
		req.getRequestDispatcher("/_jsp/searchResults.jsp").forward(req, resp);
		
		
	}
	
	/*
	 * this methods reads the HTML template as a String, replaces placeholders
	 * with the values and returns the entire page as a String
	 * @param filePath
	 * @param products
	 * @return
	 * @throws IOException
	 */
	
	public String getHTMLString(String filePath, List<PersonajeBean> personajes) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line="";
		StringBuffer buffer = new StringBuffer();
		while((line=reader.readLine())!=null){
			buffer.append(line);
		}
		
		reader.close();
		String page = buffer.toString();
		
		page = MessageFormat.format(page, personajes.get(0).getRuta_imagen(),
				personajes.get(1).getRuta_imagen(),personajes.get(2).getRuta_imagen(),
				personajes.get(0).getRuta_imagen(),personajes.get(1).getRuta_imagen(),
				personajes.get(2).getRuta_imagen(),0);
		
		return page;
		
		
	}
}
