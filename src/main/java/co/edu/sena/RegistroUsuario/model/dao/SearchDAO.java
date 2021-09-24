package co.edu.sena.RegistroUsuario.model.dao;

import co.edu.sena.RegistroUsuario.model.bean.PersonajeBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SearchDAO {
    public List<PersonajeBean> searchPersonaje(String searchString) {
        PersonajeBean personaje = null;
        List<PersonajeBean> personajes = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnectionToDataBase();

            String sql = "select * from personajes where nombre_personaje like '%" + searchString + "%'";

            Statement statement = connection.createStatement();

            ResultSet set = statement.executeQuery(sql);

            while (set.next()) {
                personaje = new PersonajeBean();
                personaje.setPersonaje_id(set.getInt("personaje_id"));
                personaje.setRuta_imagen(set.getString("ruta_imagen"));
                personaje.setNombre_personaje(set.getString("nombre_personaje"));
                personajes.add(personaje);

            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return personajes;
    }

}
