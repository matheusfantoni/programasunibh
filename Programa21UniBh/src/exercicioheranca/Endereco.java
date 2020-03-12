
package exercicioheranca;

public class Endereco {
    
    private String logradouro, cidade, estado,cep;
    private int numero;
    
    public Endereco(){} // Construtor vazio
    
    public Endereco (String logradouro,String cidade,
            String estado,int numero,String cep){ // Construtor 1
        
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
        
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getLogradouro (){
        return this.logradouro;
    }
    
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
   
    public String getCidade (){
        return this.cidade;
    }
    
    public void setEstado (String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public void setNumero (int numero){
        this.numero = numero;
    }
    
    public int getNumero (){
        return this.numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String imprimirDados(){
        return String.format("Rua/Av: %s, \nNúmero: %d,\nCidade: %s,\nEstado: %s, CEP: %s",logradouro,numero,cidade,estado,cep);
    }
    
    
}
