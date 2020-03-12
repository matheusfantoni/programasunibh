
package exercicioheranca;

public class Pessoa {
    
    private String nome,telefone;
    private Endereco endereco;
    
    public Pessoa (){} // Construtor vazio
    
    public Pessoa (String nome, String telefone){ // Construtor 1
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Pessoa (String nome, String telefone, Endereco endereco){ // Construtor 2
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
       
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public String imprimirDados(){
        return String.format ("Nome: %s, Telefone: %s, Endereço: %s " , this.nome,this.telefone,endereco.imprimirDados()); 
                }
}
