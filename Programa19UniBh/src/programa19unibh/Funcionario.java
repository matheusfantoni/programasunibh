
package programa19unibh;

public class Funcionario {
        private String cpf;
        private String nome;
        private float salario;
        
        
    public Funcionario(){ // Construtor 1    
}
    public Funcionario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    } // Construtor 2
    
    public Funcionario (String cpf, String nome,float salario){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getcpf(){
        return this.cpf; // GETTER DO CPF
    }
    public void setcpf (String cpf){
        this.cpf = cpf; // SETTER DO CPF
    } 
    public String getnome(){
        return this.nome; // GETTER DO NOME
    }
    public void setnome(String nome){
        this.nome = nome; // SETTER DO NOME
    }
    public double getsalario(){
        return this.salario; // GETTER DO SALARIO
    }
    public void setsalario(float salario){
        this.salario = salario; //  SETTER DO SALARIO
    }
    
   
}