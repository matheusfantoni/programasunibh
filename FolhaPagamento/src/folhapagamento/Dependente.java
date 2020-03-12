/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

/**
 *
 * @author João
 */
public class Dependente {
    
    private String CPF;
    private String nome;
    private int idade;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString(){
      return String.format("Dados do dependente: \n"
              + "Nome: %s.\n"
              + "CPF: %s.\n"
              + "Idade: %d.", this.getNome(), this.getCPF(), this.getIdade());
    }
    
    
}
