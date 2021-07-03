import java.util.Date;

public class Visita {
    String codVisita;
    Date fechaHora;
    Hospital hospital;
    Servicio servicio;
    Medico medico;
    String diagnosticos;
    String tratamiento;
    int numeroCama;
    Date fechaSalida;
    Historial historial;

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnosticos, String tratamiento, int numeroCama, Date fechaSalida, Historial historial){
        this.codVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnosticos = diagnosticos;
        this.tratamiento = tratamiento;
        this.numeroCama = numeroCama;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnosticos, String tratamiento, int numeroCama, Date fechaSalida, Historial historial, String codHistorial, String codVisita1){
    }

    public String getCodVisita(){
        return codVisita;
    }

    public void setCodVisita(String codVisita){
        this.codVisita = codVisita;
    }

    public Date getFechaHora(){
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora){
        this.fechaHora = fechaHora;
    }

    public Hospital getHospital(){
        return hospital;
    }

    public void setHospital(Hospital hospital){
        this.hospital = hospital;
    }

    public Servicio getServicio(){
        return servicio;
    }

    public void setServicio(Servicio servicio){
        this.servicio = servicio;
    }

    public Medico getMedico(){
        return medico;
    }

    public void setMedico(Medico medico){
        this.medico = medico;
    }

    public String getDiagnosticos(){
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos){
        this.diagnosticos = diagnosticos;
    }

    public String getTratamiento(){
        return tratamiento;
    }

    public void setTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }

    public int getNumeroCama(){
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama){
        this.numeroCama = numeroCama;
    }

    public Date getFechaSalida(){
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida){
        this.fechaSalida = fechaSalida;
    }

    public Historial getHistorial(){
        return historial;
    }

    public void setHistorial(Historial historial){
        this.historial = historial;
    }

    @Override
    public String toString(){
        return "Visita{" +
                "codVisita='" + codVisita + '\'' +
                ", fechaHora=" + fechaHora +
                ", hospital=" + hospital +
                ", servicio=" + servicio +
                ", medico=" + medico +
                ", diagnosticos='" + diagnosticos + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", numeroCama=" + numeroCama +
                ", fechaSalida=" + fechaSalida +
                ", historial=" + historial +
                '}';
    }

    public Visita(){

    }
}
