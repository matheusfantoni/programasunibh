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
public enum INSS {
    CATEGORIA1(0, 1693.72, 0.08),
    CATEGORIA2(1693.73, 2822.90, 0.09),
    CATEGORIA3(2822.91, 5645.80, 0.11);
    
    private INSS (double vlrIni, double vlrFim, double aliquota){
       this.valorInicial = vlrIni;
       this.valorFinal = vlrFim;
       this.aliquota = aliquota;
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
    
    private double valorInicial;
    private double valorFinal;
    private double aliquota;
    
    public static INSS buscarFaixa(double salario){
       for (INSS inss : values()){
           if (salario >= inss.getValorInicial() && salario <= inss.getValorFinal())
               return inss;       
       }
       return CATEGORIA3;                   
    }    
}
