import java.util.Date;
import java.util.List;

public class Servicio extends Hospital{
    String idServicio;
    String nombre;
    List<Hospital> hospitales;
    int numeroCamas;
    String comentario;

    public Servicio(String idServicio, String nombre, List<Hospital> hospitales, int numeroCamas, String comentario){
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospitales = hospitales;
        this.numeroCamas = numeroCamas;
        this.comentario = comentario;
    }

    public Servicio(String codMedico){
    }

    public Servicio(String codMedico, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, List<Servicio> servicios, Hospital hospital){
    }

    public String getIdServicio(){
        return idServicio;
    }

    public void setIdServicio(String idServicio){
        this.idServicio = idServicio;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Hospital> getHospitales(){
        return hospitales;
    }

    public void setHospitales(List<Hospital> hospitales){
        this.hospitales = hospitales;
    }

    public int getNumeroCamas(){
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas){
        this.numeroCamas = numeroCamas;
    }

    public String getComentario(){
        return comentario;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }


    public Servicio(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicio, Medico director){
    super(codHospital, nombre, ciudad, telefono, servicio, director);
    }
    
    @Override
    public String toString(){
        return "Servicio{" +
                "idServicio='" + idServicio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", hospitales=" + hospitales +
                ", numeroCamas=" + numeroCamas +
                ", comentario='" + comentario + '\'' +
                '}';
    }

}
