package Controle_Seguro;
import java.util.ArrayList;

public class Operadora {
    private String nomeOp;
    private ArrayList<Plano_Saude> planos;

    public Operadora(String nome) {
        this.nomeOp = nome;
        planos = new ArrayList<>();
    }

    public Operadora() {
    }

    public String getNomeOp() {
        return nomeOp;
    }

    public ArrayList<Plano_Saude> getPlanos() {
        return planos;
    }
    public void addPlanos(Plano_Saude plano) {
        planos.add(plano);
    }

}
