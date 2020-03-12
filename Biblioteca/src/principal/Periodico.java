
package principal;

public class Periodico extends Publicacao {
    
    // ATRIBUTOS DA CLASSE PERIODICO
    
    private int numEdicao;
    private String mes;
    
    //  CONSTRUTOR DA CLASSE PERIODICO
    
    public Periodico(int codigo, String titulo, String editora, int ano) {
        super(codigo, titulo, editora, ano);
        this.numEdicao = numEdicao;
        this.mes = mes;
    }
    
    // METODO TO STRING
    
    @Override
    public String toString() {
        return String.format("Codigo: %d.\n Titulo: %s.\n Editora: %s.\n Ano: %d.\n Numero da Edicao: %d.\n Mes: %s.\n",
        super.getCodigo(),super.getTitulo(),super.getEditora(),super.getAno(),this.numEdicao,this.mes);
    }
    
    
    
}
