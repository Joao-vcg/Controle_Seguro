package Controle_Seguro;
import java.util.ArrayList;

public class Plano_Saude {
    private int num_aut;
    private String nome_p;
    private Operadora operadora;
    private ArrayList<Segurado> segurados;
    private ArrayList<Procedimento> procedimentos;

    public Plano_Saude(String nome_p, int num_aut, Operadora operadora){
        this.nome_p = nome_p;
        this.num_aut = num_aut;
        this.operadora = operadora;
        segurados = new ArrayList();
        procedimentos = new ArrayList();
        operadora.addPlanos(this);
    }

    public int getNum_aut() {
        return num_aut;
    }
    public void setNum_aut(int num_aut) {
        this.num_aut = num_aut;
    }

    public String getNome_p() {
        return nome_p;
    }
    public void setNome_p(String nome_p) {
        this.nome_p = nome_p;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public ArrayList<Segurado> getSegurados() {
        return segurados;
    }
    public void addSegurado(Segurado s){
        segurados.add(s);
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }
    public void setProcedimentos(ArrayList<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }
}
