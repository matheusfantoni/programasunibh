package Empresa;

import java.util.ArrayList;

public class Horista extends Funcionario {
    
    
    // ATRIBUTOS DA CLASSE HORISTA
    
    private int horasTrabalhadas;
    private double valorHora;
    ArrayList<Dependentes> ListaDeptes;
        
    // METODO PARA CALCULAR A HORA DO FUNCIONARIO HORISTA
    
    @Override
    public double calcSalario() {
        return this.getHorasTrabalhadas() * this.getValorHora();
    }
    
    // METODO PARA IMPRESSAO DA FOLHA DA PGTO DE HORISTA

    @Override
    public String imprimirFolhaPagamento() {
        return String.format(""
                + "*************** DEMONSTRATIVO DE PAGAMENTO *****************\n"
                + "| Matrícula:                 %d\n"
                + "| Nome:                      %s\n"
                + "| CPF:                       %s\n"
                + "| Salário base:              %.2fR$\n"
                + "| Desconto INNS:           - %.2fR$\n"
                + "| Desconto IRRF:           - %.2fR$\n"
                + "| Desconto VT:             - %.2fR$\n"
                + "| Desconto VR:             - %.2fR$\n"
                + "| Salário Liguido            %.2fR$\n"
                + "************************************************************ \n",
                this.getMatricula(), this.getNome(), this.getCpf(), this.getSalarioBase(), this.getInss(),
                this.getIrrf(), this.getVt(), this.getVr(), this.getSalarioLiquido());
    }

    // METODOS GETTER E SETTER DE HORISTA
    
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

}
