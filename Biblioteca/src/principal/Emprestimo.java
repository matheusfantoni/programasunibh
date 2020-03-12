
package principal;

import ENUM.StatusEmprestimo;
import ENUM.StatusItem;
import java.util.ArrayList;
import java.util.Date;



public class Emprestimo {
        
    
        // ATRIBUTOS DA CLASSE EMPRESTIMO
    
        private int codigo;
        private Date dataEmprestimo;
        private Date dataPrevDevolucao;
        private double valorMulta;
        private Usuario usuario;
        private StatusEmprestimo statusEmprestimo;
        private ArrayList<ItemEmprestimo> listaEmprestimo = new ArrayList<ItemEmprestimo>();
        private static int contaID = 1;
        
        
        // CONSTRUTOR DA CLASSE EMPRESTIMO
        
        public Emprestimo (Date dataEmprestimo,Date dataPrevDevolucao){
            this.dataEmprestimo = dataEmprestimo;
            this.dataPrevDevolucao = dataPrevDevolucao;
            this.statusEmprestimo = StatusEmprestimo.ANDAMENTO;
            contaID();
        }
        
        // GETTERS E SETTERS

    public int getCodigo() {
        return codigo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevDevolucao() {
        return dataPrevDevolucao;
    }

    public void setDataPrevDevolucao(Date dataPrevDevolucao) {
        this.dataPrevDevolucao = dataPrevDevolucao;
    }

    public double getValorMulta() {
        return valorMulta;
    }
    
    public void setStatusEmprestimo(StatusEmprestimo statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
        

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

  
      // METODOS ESPECIFICOS DA CLASSE
        
        private void contaID(){
            this.codigo = contaID;
            contaID ++;
    }
        
       public void adicionarItem(ItemEmprestimo itemEmprestimo){
           this.listaEmprestimo.add(itemEmprestimo);
       } 
        
       public void devolverItem(ItemEmprestimo itemEmprestimo){
           for (ItemEmprestimo i : listaEmprestimo){
               if (i.getPublicacao().equals(itemEmprestimo.getPublicacao())){
                   i.setStatusItem(StatusItem.DEVOLVIDO);
                   break;
               }
           }
       }
       
       public void devolverTodos(){
           for (ItemEmprestimo i : listaEmprestimo)
               i.setStatusItem(StatusItem.DEVOLVIDO);
           this.statusEmprestimo = statusEmprestimo.FINALIZADO;
       }
       
       public double calcularValorMulta(double dias){
           double taxa = 0.5;
           
           return dias * (1+taxa);
       }
       
       public void adicionarUsuario(Usuario usuario){
           setUsuario(usuario);
       }
       
       public double verificarDatas(ItemEmprestimo itemEmprestimo){
           
            Date d = new Date();
            if(d.after(itemEmprestimo.getDataDevolucao()))
        {
            double data = (itemEmprestimo.getDataDevolucao().getTime()-d.getTime())+3600000;
            double dias = data/86400000;
            return dias;
        }
        return 0;
       }

    @Override
    public String toString() {
        return "Codigo = " + codigo + ".\n Data de Emprestimo = " + dataEmprestimo + ".\n Data Prevista de Devolucao = " + dataPrevDevolucao + ".\n Valor da Multa = " + valorMulta + ".\n Nome do Usuario = " + usuario + ".\n Status do Emprestimo = " + statusEmprestimo + ".\n Lista dos Emprestimos = " + listaEmprestimo + '}';
    }
       
       
      
       
}
