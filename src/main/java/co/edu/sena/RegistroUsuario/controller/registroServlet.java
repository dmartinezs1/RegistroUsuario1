package co.edu.sena.RegistroUsuario.controller;

import co.edu.sena.RegistroUsuario.model.bean.UsuarioBean;
import co.edu.sena.RegistroUsuario.model.dao.UsuarioDAO;

import javax.servlet.http.HttpServlet;
import java.io.*;
import java.text.MessageFormat;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class registroServlet extends HttpServlet {

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

/*
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
             throws ServletException, IOException {
        //recolectar todos los datos

        String nombreUsuario = req.getParameter("nombres");
        String apellidoUsuario = req.getParameter("apellidos");
        String correoUsuario = req.getParameter("correo");
        String claveUsuario = req.getParameter("contraseña");


        //pasar datos al userbean

        UsuarioBean usuario = new UsuarioBean(nombreUsuario, apellidoUsuario, correoUsuario, claveUsuario);

        //llamar la capa DAO (Data Access Object) y guardar datos del objeto usuario

        UsuarioDAO dao = new UsuarioDAO();
        int filas = dao.registrarUsuario(usuario);

        //preparar información exito o falla en proceso

        String mensaje = null;

        if (filas == 0) {
            mensaje = "Lo sentimos, se produjo un error!";
        } else {
            mensaje = "Registro exitoso!";
        }

        //mostrar el mensaje  en el navegador

        String page = getHTMLString(req.getServletContext().getRealPath("/_jsp/Registro.jsp"), mensaje);
        resp.getWriter().write(page);

    } // end doPost

        public String getHTMLString(String filePath, String mensaje) throws IOException{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);

            }
        reader.close();
        String page = buffer.toString();
        page = MessageFormat.format(page, mensaje);

        return page;
        }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = getHTMLString(req.getServletContext().getRealPath("/_jsp/Registro.jsp"), "");
        resp.getWriter().write(page);
    }

 */
