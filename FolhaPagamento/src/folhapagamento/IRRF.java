package folhapagamento;


public enum IRRF {    
    CATEGORIA1(0, 1903.98, 0, 0),
    CATEGORIA2(1903.99, 2826.65, 0.075, 142.80),
    CATEGORIA3(2826.66, 3751.05, 0.15, 354.80),
    CATEGORIA4(3751.06, 4664.68, 0.225, 636.13),
    CATEGORIA5(4664.69, 99999999, 0.275, 869.36);
     
    private IRRF (double vlrIni, double vlrFim, double aliquota, double deducao){
       this.valorInicial = vlrIni;
       this.valorFinal = vlrFim;
       this.aliquota = aliquota;
       this.deducao = deducao;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public double getAliquota() {
        return aliquota;
    }

    public double getDeducao() {
        return deducao;
    }

    public static double getValorPorDependente() {
        return valorPorDependente;
    }
    
    private double valorInicial;
    private double valorFinal;
    private double aliquota;
    private double deducao;
    private static double valorPorDependente = 189.59;
    
    public static IRRF buscarFaixa(double salario){
       for (IRRF irrf : values()){
           if (salario >= irrf.getValorInicial() && salario <= irrf.getValorFinal())
               return irrf;       
       }
       return CATEGORIA5;                   
    }    
}    