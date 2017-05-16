package Controle_Seguro;

public class Ambulatorial extends Procedimento{
    private int qtdTecnicos;
    
    public Ambulatorial(int qtdTecnicos, String nomeProc, ItemProcedimento lista){
        super(nomeProc, lista);
        this.qtdTecnicos = qtdTecnicos;
    }

    public int getQtdTecnicos() {
        return qtdTecnicos;
    }

    public void setQtdTecnicos(int qtdTecnicos) {
        this.qtdTecnicos = qtdTecnicos;
    }
    
}
