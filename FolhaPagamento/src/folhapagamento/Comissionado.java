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
public class Comissionado extends Funcionario {

    private double valorVendas;
    private double percComissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }
    
    @Override
    public double calcularSalario() {
        return this.getValorVendas() * this.getPercComissao() / 100;
    }

    @Override
    public double calcularDescontoVR() {
        return this.getValorValeRefeicao() * 0.15;
    }    

    public Comissionado(double valorVendas, double percComissao, String matricula, String nome, String CPF, double salario, double valorValeRefeicao) {
        super(matricula, nome, CPF, salario, valorValeRefeicao);
        this.valorVendas = valorVendas;
        this.percComissao = percComissao;
    }
    
}
