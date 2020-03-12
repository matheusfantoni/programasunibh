package exercicioheranca;

public class Aluno extends Pessoa {
    
    private String status, curso;
    
    public Aluno (){} // Construtor vazio
    
    public Aluno (String nome, String telefone){ // Construtor 1
        super (nome,telefone);
    }
    
    public Aluno (String nome, String telefone, Endereco endereco, String status, String curso){ // Construtor 2
        super (nome,telefone,endereco);
        this.status = status;
        this.curso = curso;
    }
    
    public void setStatus (String status){
        this.status = status;
    }
    
    public String getStatus (){
        return this.status;
    }
    
    public void setCurso (String curso){
        this.curso = curso;
    }
    
    public String getCurso (){
        return this.curso;
    }
    public String imprimirDados(){
        return String.format ("%s. \nStatus: %s." + "\nCurso: %s.",super.imprimirDados(),status,curso);
    }
}
