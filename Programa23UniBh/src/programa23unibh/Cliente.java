
package programa23unibh;

public class Cliente {
        
    public int id;
    public String nome;
    public double limiteCredito; // ATRIBUTOS DA CLASSE CLIENTE
    
    public Cliente(){} // CONSTRUTOR VAZIO
    
    public Cliente (int id, String nome, double limiteCredito){
        this.id = id;
        this.nome = nome;
        this.limiteCredito = limiteCredito; //  CONSTRUTOR 1 DA CLASSE CLIENTE
    }
    
    public Cliente (int id, String nome){
        this.id = id;
        this.nome = nome;  // CONSTRUTOR 2 DA CLASSE CLIENTE
    }
    
    public String imprimirDados(){
        return String.format ("Identificador: %d. \nNome: %s. \nLimite: %8.2f.\n",this.id,this.nome,this.limiteCredito);
        // Metodo para impressao dos dados.
    }
    
}
