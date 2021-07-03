import java.util.List;

public class Hospital {
    String codHospital;
    String nombre;
    Ciudad ciudad;
    int telefono;
    List<Servicio> servicio;
    Medico director;

    public Hospital(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicio, Medico director){
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicio = servicio;
        this.director = director;
    }

    public String getCodHospital(){
        return codHospital;
    }

    public void setCodHospital(String codHospital){
        this.codHospital = codHospital;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Ciudad getCiudad(){
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public List<Servicio> getServicio(){
        return servicio;
    }

    public void setServicio(List<Servicio> servicio){
        this.servicio = servicio;
    }

    public Medico getDirector(){
        return director;
    }

    public void setDirector(Medico director){
        this.director = director;
    }

    public Hospital(){

    }
}

