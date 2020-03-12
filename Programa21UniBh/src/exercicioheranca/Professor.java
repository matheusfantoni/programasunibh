
package exercicioheranca;

public class Professor extends Pessoa{

    private double salario;
    private String departamento;
    
    public Professor (){} // Construtor vazio
    
    public Professor (String nome, String telefone,Endereco endereco, double salario,String departamento){ // Construtor 1
        super(nome,telefone,endereco);
        this.salario = salario;
        this.departamento = departamento;
    }
    
    public Professor (String nome, String telefone){
        super (nome,telefone);
    }
    
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public double getSalario (){
        return this.salario;
    }
    
    public void setDepartamento (String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento (){
        return this.departamento;
    }
    
    public String imprimirDados(){
        return String.format ("%s. \n Salário: %8.2f" + "\n Departamento: %s",super.imprimirDados(),salario,departamento);
    }
    
    public boolean salarioEhValido(double salario){
        return salario >= 945.00; 
         
  }
}