package co.edu.sena.RegistroUsuario.model.bean;

@SuppressWarnings("ALL")
public class UsuarioBean {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correoUsuario;
    private String claveUsuario;

    public UsuarioBean(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioBean(String nombreUsuario, String apellidoUsuario, String correoUsuario, String claveUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.claveUsuario = claveUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    @Override
    public String toString() {
        return "usuarioBean{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidoUsuario='" + apellidoUsuario + '\'' +
                ", correoUsuario='" + correoUsuario + '\'' +
                ", claveUsuario='" + claveUsuario + '\'' +
                '}';
    }
}//fin de clase usuarioBean
