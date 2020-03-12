package Empresa;

import java.util.ArrayList;

public class Comissionario extends Funcionario {

    // ATRIBUTOS DA CLASSE COMISSIONARIO
    
    private double valorVenda;
    private int comissao;
    private int qtdeVendas;
    ArrayList<Dependentes> ListaDeptes;

    
    // METODO PARA CALCULAR A HORA FUNCIONARIO COMISSIONADO.
    
    @Override
    public double calcSalario() {
        return ((this.getComissao() * this.getValorVenda()) + this.getValorVenda()) * this.getQtdeVendas();
    }

    // SOBRESCRITA DO METODO DA CLASSE FUNCIONARIO IMPRIMIR A FOLHA DA PGTO
    
    @Override
    public String imprimirFolhaPagamento() {
        return String.format(""
                + "**************** DEMONSTRATIVO DE PAGAMENTO *****************\n"
                + "| Matrícula:                 %d\n"
                + "| Nome:                      %s\n"
                + "| CPF:                       %s\n"
                + "| Salário base:              %.2fR$\n"
                + "| Desconto INNS:           - %.2fR$\n"
                + "| Desconto IRRF:           - %.2fR$\n"
                + "| Desconto VT:             - %.2fR$\n"
                + "| Desconto VR:             - %.2fR$\n"
                + "| Salário Liguido            %.2fR$\n"
                + "**************************************************************\n",
                this.getMatricula(), this.getNome(), this.getCpf(), this.getSalarioBase(), this.getInss(),
                this.getIrrf(), this.getVt(), this.getVr(), this.getSalarioLiquido());
    }

    
    // GETTERS E SETTERS DA CLASSE COMISSIONARIO
    
    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getQtdeVendas() {
        return qtdeVendas;
    }

    public void setQtdeVendas(int qtdeVendas) {
        this.qtdeVendas = qtdeVendas;
    }

}
