
package programa22unibh;

import java.util.Random;

public class Cliente {
        private String cpf;
        private String nome; // Atributos de Cliente
        private int id;
        
    
    public Cliente(){ // Construtor 1
        this.id = gerarIdAleatorio();
}
    
    public Cliente (String cpf, String nome,int gerarIdAleatorio){
        this.cpf = cpf;
        this.nome = nome; // Construtor 2
        this.id = gerarIdAleatorio();
    }
    
    public Cliente (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;   // Construtor 3
    }
    
    public Cliente (String nome){
        this.nome = nome;
        this.id = gerarIdAleatorio(); // Construtor 4
    }
    
    public String getcpf(){
        return this.cpf; // GETTER DO CPF
    }
    
    public void setcpf(String cpf){
        this.cpf = cpf; // SETTER DO CPF
    }
    
    public String getnome(){
        return this.nome; // GETTER DO NOME
    }
    
    public void setnome (String nome){
        this.nome = nome; // SETTER DO NOME
    }
    
    public int getid(){
        return this.id; // GETTER DO ID
    }
    
    private int gerarIdAleatorio(){
        Random r = new Random();
        return r.nextInt(1000); // METODO PARA GERAR O ID ALEATORIO
    }
    
    public String imprimirDados(){
        return String.format("Nome: %s. \nCPF:%s \nIdentificador: %d",this.nome,this.cpf,this.gerarIdAleatorio());
    // Metodo para imprimir dados na tela 
    }
    
}