package Controle_Seguro;
import java.util.ArrayList;

public class Cirurgico extends Procedimento{
    private int qtdMedicos;
    private ArrayList<Hospital> hospitais;
    
    public Cirurgico(int qtdMedicos, String nomeProc, ItemProcedimento lista, Hospital hospital){
        super(nomeProc, lista);
        this.qtdMedicos = qtdMedicos;
        hospitais.add(hospital);
    }

    public int getQtdMedicos() {
        return qtdMedicos;
    }
    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }

    public ArrayList<Hospital> getHospitais() {
        return hospitais;
    }
    public void setHospitais(ArrayList<Hospital> hospitais) {
        this.hospitais = hospitais;
    }
    
}