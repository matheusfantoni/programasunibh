
package programa.pkg17.unibh;

public class Pessoa {
    public String cpf;
    public String nome;
    public int idade;
    public String telefone;
    public int anoNasc;
        
    // CONSTRUTOR
    public Pessoa (int anoNasc){
    idade = 2018 - anoNasc;
    this.anoNasc = anoNasc;
    }
    
    // METODOS
    public String DadosPessoa(){
        return "Ola " + nome + ".Seu CPF é " + cpf + " e o seu telefone é " + telefone;
    } // FECHAMENTO DA CLASSE PESSOA
}


