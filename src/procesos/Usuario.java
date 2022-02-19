
package procesos;

public class Usuario {
    private String codigo,usuario,password,nombre,correo,last_session, fecha_nac, telefono, nombre_tipo;
    private int id_tipo, estado;

    public Usuario(String codigo, String usuario, String password, String nombre, String correo, String telefono, String fecha_nac,int id_tipo, int estado) {
        this.codigo    = codigo;
        this.usuario   = usuario;
        this.password  = password;
        this.nombre    = nombre;
        this.correo    = correo;
        this.id_tipo   = id_tipo;
        this.estado    = estado;
        this.fecha_nac = fecha_nac;
        this.telefono  = telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getLast_session() {
        return last_session;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    @Override
    public String toString() {
        return "[ Usuario ]\n" + " \t Codigo:        " + codigo       +
                                 " \t Usuario:       " + usuario      +
                                 " \t Contraseña:    " + password     + 
                                 " \t Nombre:        " + nombre       + 
                                 " \t Correo:        " + correo       + 
                                 " \t Ultimo Acceso: " + last_session +
                                 " \t Tipo Usuario:  " + nombre_tipo  +
                                 " \t Id. Tipo:      " + id_tipo      +
                                 " \t Estado:        " + estado;
    }
    
    
    
}
