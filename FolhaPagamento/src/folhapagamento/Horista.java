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
public class Horista extends Funcionario {

    private double quantidadeHoras;
    private double valorHora;

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario() {
        return this.getQuantidadeHoras() * this.getValorHora();
    }

    @Override
    public double calcularDescontoVR() {
        return this.getValorValeRefeicao() * 0.18;
    }

    public Horista(double quantidadeHoras, double valorHora, String matricula, String nome, String CPF, double salario, double valorValeRefeicao) {
        super(matricula, nome, CPF, salario, valorValeRefeicao);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }
    
    
}
