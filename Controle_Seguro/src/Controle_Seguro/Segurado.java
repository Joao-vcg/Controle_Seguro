package Controle_Seguro;
import java.util.ArrayList;

public class Segurado {
    private String nome_segurado;
    private long cpf;
    private ArrayList<Plano_Saude> planos;

    public Segurado(String nome_seg, long cpf, Plano_Saude plano){
        this.nome_segurado = nome_seg;
        this.cpf = cpf;
        planos = new ArrayList<>();
        planos.add(plano);
        plano.addSegurado(this);
    }
    
    public Segurado(){
        planos = new ArrayList<>();
    }

    public ArrayList<Plano_Saude> getPlanos() {
        return planos;
    }
    public void setPlanos(Plano_Saude plano) {
        planos.add(plano);
        plano.addSegurado(this);
        
    }
    public void addPlanos(Plano_Saude plano){
        planos.add(plano);
    }

    public String getNome_segurado() {
        return nome_segurado;
    }
    public void setNome_segurado(String nome_segurado) {
        this.nome_segurado = nome_segurado;
    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
}
