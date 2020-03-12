package Empresa;

import java.util.ArrayList;

public abstract class Mensalista extends Funcionario {

    
    ArrayList<Dependentes> ListaDeptes;
    
    
    // METODO PARA CALCULAR A HORA FUNCIONARIO MENSALISTA QUE E IGUAL AO SAL BASE
    
    @Override
    public double calcSalario() {
        return this.getSalarioBase();
    }

    
    // METODO DE IMPRESSAO DOS DADOS DA FOLHA DA PGTO
    
    @Override
    public String imprimirFolhaPagamento() {
        return String.format(""
                + "****************** DEMONSTRATIVO DE PAGAMENTO *******************\n"
                + "| Matrícula:                 %d\n"
                + "| Nome:                      %s\n"
                + "| CPF:                       %s\n"
                + "| Salário base:              %.2fR$\n"
                + "| Desconto INNS:           - %.2fR$\n"
                + "| Desconto IRRF:           - %.2fR$\n"
                + "| Desconto VT:             - %.2fR$\n"
                + "| Desconto VR:             - %.2fR$\n"
                + "| Salário Liguido            %.2fR$\n"
                + "*******************************************************************\n",
                this.getMatricula(), this.getNome(), this.getCpf(), this.getSalarioBase(), this.getInss(),
                this.getIrrf(), this.getVt(), this.getVr(), this.getSalarioLiquido());
    }

    
}
