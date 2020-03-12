package folhapagamento;

public class Pagamento {

    public Pagamento(){}
    
    private Funcionario func;

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Pagamento(Funcionario func) {
        this.func = func;
    }

    public double calcularInss() {
        INSS inss = INSS.buscarFaixa(
                this.getFunc().calcularSalario());
        if (this.getFunc().calcularSalario()
                > inss.getValorFinal()) {
            return inss.getValorFinal()
                    * inss.getAliquota();

        } else {
            return this.getFunc().calcularSalario()
                    * inss.getAliquota();
        }
    }

    public double calcularBaseIRRF() {
        return this.getFunc().calcularSalario()
                - this.calcularInss()
                - this.getFunc().getListaDependente().size()
                * IRRF.getValorPorDependente();

    }

    public double calcularIRRF() {
        IRRF irrf = IRRF.buscarFaixa(
                this.calcularBaseIRRF());
        return this.calcularBaseIRRF()
                * irrf.getAliquota()
                - irrf.getDeducao();
    }

    public double calcularDescontos() {
        return this.calcularInss()+
                this.calcularIRRF()+
             this.getFunc().calcularDescontoVR()+
             this.getFunc().calcularDescontoVT();
    }
    
    public double calcularSalarioLiquido(){
        return this.getFunc().calcularSalario()-
                this.calcularDescontos();
    }
    
    public String imprimirRecibo (){
        return String.format("Dados Pessoais\n"
                + "Matrícula: %s.\n"
                + "Nome: %s.\n"
                + "CPF: %s.\n"
                + "Quantidade de Dependentes: %d.\n"
                + "--------------------------------\n"
                + "Dados do Pagamento\n"
                + "Valor do Salário: %8.2f.\n"
                + "Desconto de INSS: %8.2f.\n"
                + "Desconto de IRRF: %8.2f.\n"
                + "Desconto Transporte: %8.2f.\n"
                + "Desconto Alimentação: %8.2f.\n"
                + "Salário Líquido: %8.2f.\n\n",
                this.getFunc().getMatricula(),
                this.getFunc().getNome(),
                this.getFunc().getCPF(),
                this.getFunc().getListaDependente().size(),
                this.getFunc().calcularSalario(),
                this.calcularInss(),
                this.calcularIRRF(),
                this.getFunc().calcularDescontoVT(),
                this.getFunc().calcularDescontoVR(),
                this.calcularSalarioLiquido());
        
                         
                
                
                
               
    }
}
