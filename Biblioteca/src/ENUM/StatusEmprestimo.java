
package ENUM;

public enum StatusEmprestimo {
    
    ANDAMENTO(1),
    FINALIZADO(2);
    
    private int codStatusEmprestimo;
    
    // CONSTRUTOR
    StatusEmprestimo (int codStatusEmprestimo){
        this.codStatusEmprestimo = codStatusEmprestimo;
}
    
    // GETTER
    
    public int getCodStatusEmprestimo(){
            return codStatusEmprestimo;
    }
}
