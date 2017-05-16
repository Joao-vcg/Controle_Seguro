package Controle_Seguro;

public enum Estado {
    Pendente(1), Autorizado(2), Negado(3);
    private final int valorEstado;
    
    Estado(int valor){
        valorEstado = valor;
    }
}