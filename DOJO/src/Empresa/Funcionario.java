package Empresa;

import java.util.ArrayList;

public abstract class Funcionario {
    
    // ATRIBUTOS DA CLASSE FUNCIONARIO
    
    private int matricula;
    private String nome;
    private String cpf;    
    private double salarioLiquido;  // SALARIO COM OS DESCONTOS
    private double salarioBase;    // SALARIO RECEBIDO BRUTO
    double inss;
    double irrf;
    double vt;
    double vr;
    ArrayList<Dependentes> ListaDeptes; // ARRAYLIST PARA OS DEPENDENTES

    public abstract double calcSalario();  // METODO ABSTRATO PARA CALCULAR O SALARIO NAS OUTRAS CLASSES

    public abstract String imprimirFolhaPagamento(); // METODO PARA IMPRIMIR A FOLHA DE PAGAMENTO

    // METODO PARA DESCONTAR O INSS
    
    public void DescontoINSS() {
        if (getSalarioBase() <= 1693.72) {
            setInss(0.08 * getSalarioBase());
        } else if (getSalarioBase() <= 2822.90) {
            setInss(0.09 * getSalarioBase());
        } else if (getSalarioBase() <= 5645.80) {
            setInss(0.11 * getSalarioBase());
        } else {
            setInss(604.44);
        }
    }

    // METODO PARA DESCONTAR O IRRF
    
    public void DescontoIRRF() {
        double salario = (this.getSalarioBase() - this.getInss() - (getListaDeptes().size() * 189.59));//Calculo pega a qtde de dependentes
        if (salario <= 1903.98) {
            setIrrf(0);
        } else if (salario <= 2826.65) {
            setIrrf((0.075 * salario) - 142.80);
        } else if (salario <= 3751.05) {
            setIrrf((0.15 * salario) - 354.80);
        } else if (salario <= 4664.68) {
            setIrrf((0.225 * salario) - 639.13);
        } else {
            setIrrf((0.275 * salario) - 869.36);
        }
    }
    
    // METODO PARA DESCONTO DO VR
    
    public void DescontoVR(Funcionario fun) {
        if (fun instanceof Mensalista) {
            setVr(0.20 * getSalarioBase());
        } else if (fun instanceof Horista) {
            setVr(0.18 * getSalarioBase());
        } else if (fun instanceof Comissionario) {
            setVr(0.15 * getSalarioBase());
        } else {
            setVr(1);
        }

    }

    // METODO PARA DESCONTAR O VALE TRANSPORTE
    
    public void DescontoVT() {

        setVt(0.06 * getSalarioBase());
    }
    
    // METODO PARA CALCULAR O SALARIO LIQUIDO
    
    public void salLiquido() {
        setSalarioLiquido(this.getSalarioBase() - this.getInss() - this.getIrrf() - this.getVt() - this.getVr());
    }

    
    // METODOS GETTERS E SETTERS DE FUNCIONARIO
    
    public ArrayList<Dependentes> getListaDeptes() {
        return ListaDeptes;
    }

    public void setListaDeptes(ArrayList<Dependentes> ListaDeptes) {
        this.ListaDeptes = ListaDeptes;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getVt() {
        return vt;
    }

    public void setVt(double vt) {
        this.vt = vt;
    }

    public double getVr() {
        return vr;
    }

    public void setVr(double vr) {
        this.vr = vr;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
