package Controle_Seguro;
import java.util.ArrayList;

public class Clinica {
    private String Medico;
    private ArrayList<Ambulatorial> ambulatorios;
    
    // Padrão Creator, gera uma instância de Ambulatório
    public Clinica(String Medico, Ambulatorial ambulatorio){
        this.Medico = Medico;
        ambulatorios = new ArrayList<>();
        ambulatorios.add(ambulatorio);
    }

    public String getMedico() {
        return Medico;
    }
    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public ArrayList<Ambulatorial> getAmbulatorios() {
        return ambulatorios;
    }
    public void setAmbulatorios(ArrayList<Ambulatorial> ambulatorios) {
        this.ambulatorios = ambulatorios;
    }
    
}
