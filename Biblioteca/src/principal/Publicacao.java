
package principal;

public abstract class Publicacao {
    
    // ATRIBUTOS DA CLASSE PUBLICACAO
    
    private int codigo;
    private String titulo;
    private String editora;
    private int ano;
    private static int contaID;

    // CONSTRUTOR DA CLASSE PUBLICACAO
    
    public Publicacao(int codigo, String titulo, String editora, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        setContaID();
        
    }
    
    // GETTERS E SETTERS
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static int getContaID() {
        return contaID;
    }

    private void setContaID() {
        this.codigo = contaID;
        contaID ++ ;
        
    }
    
}
