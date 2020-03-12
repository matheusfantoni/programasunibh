
package folhapagamento;


public class CargoConfianca extends Funcionario {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
    @Override
    public double calcularSalario() {
        return this.getSalario() + this.bonus;
    }

    @Override
    public double calcularDescontoVR() {
        return 1;
    }

    public CargoConfianca(double bonus, String matricula, String nome, String CPF, double salario, double valorValeRefeicao) {
        super(matricula, nome, CPF, salario, valorValeRefeicao);
        this.bonus = bonus;
    }
    
    
}
