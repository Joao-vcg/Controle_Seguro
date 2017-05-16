package Controle_Seguro;
import java.util.ArrayList;

public class Hospital {
    private int qtdMedicos;
    private ArrayList<Cirurgico> cirurgicos;
    
    public Hospital(int qtdMedicos, Cirurgico cirurgico){
        this.qtdMedicos = qtdMedicos;
        cirurgicos = new ArrayList<>();
        cirurgicos.add(cirurgico);
    }

    public int getQtdMedicos() {
        return qtdMedicos;
    }
    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }

    public ArrayList<Cirurgico> getCirurgicos() {
        return cirurgicos;
    }
    public void setCirurgicos(ArrayList<Cirurgico> cirurgicos) {
        this.cirurgicos = cirurgicos;
    }
    
}
