package co.edu.sena.RegistroUsuario.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("ALL")
public class GetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String htmlResponse = "<html><h3>Welcome to servlets</h3></html>";
        PrintWriter writer = resp.getWriter();
        writer.write(htmlResponse);



    }
}//fin de clase GetServlet
