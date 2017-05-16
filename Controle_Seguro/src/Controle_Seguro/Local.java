package Controle_Seguro;
import java.util.ArrayList;

public class Local {
    private long cep;
    private ArrayList<Autorizacao> autorizacoes;
    
    public Local(long cep, Autorizacao autorizacao){
        this.cep = cep;
        autorizacoes = new ArrayList();
    }

    public long getCep() {
        return cep;
    }
    public void setCep(long cep) {
        this.cep = cep;
    }

    public ArrayList<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }
    public void setAutorizacoes(ArrayList<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    }
    
}
