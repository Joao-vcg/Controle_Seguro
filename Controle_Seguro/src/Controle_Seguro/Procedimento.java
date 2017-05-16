package Controle_Seguro;

import java.util.ArrayList;

public class Procedimento {
    private String nomeProc;
    private ArrayList<ItemProcedimento> lista;
    
    public Procedimento(String nomeProc, ItemProcedimento item){
        this.nomeProc = nomeProc;
        lista = new ArrayList();
        lista.add(item);
    }
    
    public Procedimento(){
        lista = new ArrayList();
    }
    
    public String getNomeProc() {
        return nomeProc;
    }
    public void setNomeProc(String nomeProc) {
        this.nomeProc = nomeProc;
    }
    
    public void addItem(ItemProcedimento item){
        lista.add(item);
    }
    public ArrayList<ItemProcedimento> getLista() {
        return lista;
    }
    public void setLista(ItemProcedimento item) {
        lista.add(item);
    }
    
    
}