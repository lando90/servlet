package reservas;


public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private int id;
    private String email;
    private String direccion;   
    private String codigo_postal;
    private String password;
    private String ciudad;
    private int administrador;

	public Usuario(){
		
	}
    public Usuario(String nombre, String apellidos, String dni, int id, String email, String direccion, String codigo_postal, String password, String ciudad, int administrador) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = id;
        this.email = email;
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.password = password;
        this.ciudad = ciudad;
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getPassword() {
        return password;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int isAdministrador() {
        return administrador;
    }
    public String esAdministrador() {
        if(administrador==1)
			return "Si";

			return "No";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }
    
    
}
