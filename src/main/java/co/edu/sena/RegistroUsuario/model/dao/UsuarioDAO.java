package co.edu.sena.RegistroUsuario.model.dao;
import co.edu.sena.RegistroUsuario.model.bean.UsuarioBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings("ALL")
public class UsuarioDAO {

    public int registrarUsuario(UsuarioBean usuario){
        int filasAfectadas = 0;
        try{
            //obtener conexion a la base de datos

            Connection con = DBConnection.getConnectionToDataBase();

            //definir insert query

            String insertQuery = "insert into tbUsuario values(upper(?),upper(?),?,aes_encrypt(?,'1564312cxzcdc5431vcx59'))";

            //definir parámetros con un PreparedStatement

            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getApellidoUsuario());
            ps.setString(3, usuario.getCorreoUsuario());
            ps.setString(4, usuario.getClaveUsuario());


            //ejecutar la consola

            filasAfectadas= ps.executeUpdate();




        }catch(SQLException e){
          e.printStackTrace();
        }
        return filasAfectadas;
    }


}//fin de clase UsuarioDAO

