package Empresa;

import java.util.ArrayList;

public class CargoConfianca extends Funcionario {
    
    // ATRIBUTOS DA CLASSE CONFIANCA
    
    private int bonus;
    ArrayList<Dependentes> ListaDeptes;

    
    // METODO PARA CALCULAR A HORA FUNCIONARIO CARGO DE CONFIANCA
    
    @Override
    public double calcSalario() {
        return (this.getBonus() * this.getSalarioBase()) + this.getSalarioBase();
    }
    
    // METODO DA CLASSE FUNCIONARIO (ABSTRACT) PARA IMPRIMIR A FOLHA DE PGTO.
    // (SOBRESCRITA DO METODO)
    
    @Override
    public String imprimirFolhaPagamento() {
        return String.format(""
                + "*********** DEMONSTRATIVO DE PAGAMENTO ****************\n"
                + "| Matrícula:                 %d\n"
                + "| Nome:                      %s\n"
                + "| CPF:                       %s\n"
                + "| Salário base:              %.2fR$\n"
                + "| Desconto INNS:           - %.2fR$\n"
                + "| Desconto IRRF:           - %.2fR$\n"
                + "| Desconto VT:             - %.2fR$\n"
                + "| Desconto VR:             - %.2fR$\n"
                + "| Salário Liguido            %.2fR$\n"
                + "********************************************************** \n",
                this.getMatricula(), this.getNome(), this.getCpf(), this.getSalarioBase(), this.getInss(),
                this.getIrrf(), this.getVt(), this.getVr(), this.getSalarioLiquido());
    }

    
    // METODOS GETTER E SETTER DA CLASSE CONFIANCA
    
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
