package co.edu.sena.RegistroUsuario.controller;

import co.edu.sena.RegistroUsuario.model.bean.UsuarioBean;
import co.edu.sena.RegistroUsuario.model.dao.UsuarioDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;

@SuppressWarnings("ALL")
public class ServletRegistro extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombreUsuario = req.getParameter("nombres");
        String apellidoUsuario = req.getParameter("apellidos");
        String correoUsuario = req.getParameter("correo");
        String claveUsuario = req.getParameter("contraseña");

        UsuarioBean usuario = new UsuarioBean(nombreUsuario, apellidoUsuario, correoUsuario, claveUsuario);

        UsuarioDAO dao = new UsuarioDAO();
        int rows = dao.registrarUsuario(usuario);

        String infoMessage = null;
        if (rows==0){
            infoMessage="Ocurrió un error!";
        }else{
            infoMessage="Usuario registrado";
        }

        String page = getHTMLString(req.getServletContext().getRealPath("/_jsp/Registro.jsp"), infoMessage);
        resp.getWriter().write(page);
    }//fin dopost

    public String getHTMLString(String filePath, String message) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while((line=reader.readLine())!=null){
            buffer.append(line);
        }
        reader.close();
        String page = buffer.toString();

        page = MessageFormat.format(page, message);

        return page;
    }//fin gethtmlstring

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = getHTMLString(req.getServletContext().getRealPath("/_jsp/Registro.jsp"), "");
        resp.getWriter().write(page);
    }
}


