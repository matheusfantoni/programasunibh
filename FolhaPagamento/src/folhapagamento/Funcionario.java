/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

import java.util.ArrayList;

/**
 *
 * @author João
 */
public abstract class Funcionario {
    private String matricula;
    private String nome;
    private String CPF;       
    private double salario;    
    private double valorValeRefeicao;
    private ArrayList<Dependente> listaDependente = new ArrayList<Dependente>();

    public abstract double calcularSalario();
    public abstract double calcularDescontoVR();
    
    public double calcularDescontoVT(){
       return this.calcularSalario() * 0.06;
    }
    
    public void addDependente(Dependente dep){
       listaDependente.add(dep);
    } 

    public void addDependente(String nome, String CPF, int idade){
       Dependente dep = new Dependente();
       dep.setNome(nome);
       dep.setCPF(CPF);
       dep.setIdade(idade);
       
       this.addDependente(dep);
    } 
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorValeRefeicao() {
        return valorValeRefeicao;
    }

    public void setValorValeRefeicao(double valorValeRefeicao) {
        this.valorValeRefeicao = valorValeRefeicao;
    }

    public ArrayList<Dependente> getListaDependente() {
        return listaDependente;
    }

    public void setListaDependente(ArrayList<Dependente> listaDependente) {
        this.listaDependente = listaDependente;
    }    

    public Funcionario(String matricula, String nome, String CPF, double salario, double valorValeRefeicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.valorValeRefeicao = valorValeRefeicao;
    }
    
    
}
