
package principal;

import ENUM.StatusItem;
import java.util.Date;

public class ItemEmprestimo {
    
    // ATRIBUTOS DA CLASSE ITEM-EMPRESTIMO
   
    private Date dataDevolucao;
    private StatusItem statusItem;        
    private Publicacao publicacao;
    
    
    // CONSTRUTOR

    public ItemEmprestimo(Publicacao publicacao) {
        this.publicacao = publicacao;
        this.statusItem = StatusItem.EMPRESTADO;
        
    }
    
    // GETTERS E SETTERS

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
    
    
    // METODOS
    
    public void atualizarDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
        this.statusItem = StatusItem.DEVOLVIDO;
    }
    
    
}
