package co.edu.sena.RegistroUsuario.model.bean;

public class PersonajeBean {
    private int personaje_id;
    private String nombre_personaje;
    private String ruta_imagen;

    public int getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public String getNombre_personaje() {
        return nombre_personaje;
    }

    public void setNombre_personaje(String nombre_personaje) {
        this.nombre_personaje = nombre_personaje;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }
}
