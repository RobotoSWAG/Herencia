import java.util.Date;

public class Historial extends Visita{
    String codHistorial;
    Paciente paciente;

    public Historial(String codHistorial, Paciente paciente){
        this.codHistorial = codHistorial;
        this.paciente = paciente;
    }

    public String getCodHistorial(){
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial){
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    @Override
    public String toString(){
        return "Historial{" +
                "codHistorial='" + codHistorial + '\'' +
                ", paciente=" + paciente +
                '}';
    }

    public Historial(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnosticos, String tratamiento, int numeroCama, Date fechaSalida, Historial historial, String codHistorial, Paciente paciente){
    super(codVisita, fechaHora, hospital, servicio, medico, diagnosticos, tratamiento, numeroCama, fechaSalida, historial, codHistorial, codVisita);
    }
}
