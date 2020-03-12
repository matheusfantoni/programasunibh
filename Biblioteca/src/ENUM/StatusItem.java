
package ENUM;

public enum StatusItem {
    
    EMPRESTADO(1),
    DEVOLVIDO(2);
    
    private int codStatusItem;
    
    
    // CONSTRUTOR
    
    StatusItem(int codStatusItem){
        this.codStatusItem = codStatusItem;
    
}
    
    // GETTER
    
    public int getCodStatusItem() {
        return codStatusItem;
    }
   
}
