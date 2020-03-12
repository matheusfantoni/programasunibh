
package principal;

public class Livro extends Publicacao{
    
    // ATRIBUTOS DA CLASSE LIVRO
    
    private String autores;
    private int quantExemplar;
    private int quantDisponivel;

    
    // CONSTRUTOR DA CLASSE LIVRO
    
    public Livro(int codigo, String titulo, String editora, int ano) {
        super(codigo, titulo, editora, ano);
        this.autores = autores;
        this.quantDisponivel = quantDisponivel;
        this.quantExemplar = quantExemplar;
    }
    
    
    // GETTERS E SETTERS

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getQuantExemplar() {
        return quantExemplar;
    }

    public void setQuantExemplar(int quantExemplar) {
        this.quantExemplar = quantExemplar;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }
    
    // METODO PARA ATUALIZAR QTD DISPONIVEL
    
    public void atualizaQtdDisponivel(boolean d){
        if (d)
            this.quantDisponivel++;
        else
            this.quantDisponivel--;
    }
    
    // METODO TO STRING
    
    @Override
    public String toString(){
        return String.format("Codigo: %d.\n Titulo: %s.\n Editora: %s.\n Ano: %d.\n"
        + "Autores: %s.\n Quantidade Disponivel: %d.\n",super.getCodigo(),super.getTitulo(),super.getEditora(),
        super.getAno(),this.autores,this.quantDisponivel);
    }
    
    
}
