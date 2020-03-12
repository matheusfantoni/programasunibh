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
public class Mensalista extends Funcionario {

  
    @Override
    public double calcularSalario() {
       return this.getSalario();
    }

    @Override
    public double calcularDescontoVR() {
        return this.getValorValeRefeicao() * 0.20;
    }

    public Mensalista(String matricula, String nome, String CPF, double salario, double valorValeRefeicao) {
        super(matricula, nome, CPF, salario, valorValeRefeicao);
    }


     public double calcularInss() {
        INSS inss = INSS.buscarFaixa(
                this.calcularSalario());
        if (this.calcularSalario()
                > inss.getValorFinal()) {
            return inss.getValorFinal()
                    * inss.getAliquota();

        } else {
            return this.calcularSalario()
                    * inss.getAliquota();
        }
    }
     
     public double calcularIRRF(){
         return 0.0;
     }

    
}
