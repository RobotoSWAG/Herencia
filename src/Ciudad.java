import java.util.List;

public class Ciudad extends Hospital{
    String codCiudad;
    String nombre;

    public Ciudad(String codCiudad, String nombre){
        this.codCiudad = codCiudad;
        this.nombre = nombre;
    }

    public String getCodCiudad(){
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad){
        this.codCiudad = codCiudad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Ciudad(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicio, Medico director, String codCiudad){
    super(codHospital, nombre, ciudad, telefono, servicio, director);
    }

    @Override
    public String toString(){
        return "Ciudad{" +
                "codCiudad='" + codCiudad + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
