
package programa25unibh;

public class Corrente extends Conta {
        
        private double limiteCredito;
        
     // CONSTRUTOR    

    public Corrente(double limiteCredito, int agencia, int numero, int saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
        this.limiteCredito = limiteCredito;
    }
        
    
    
    //GETTER E SETTER 
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
        
        
    // METODOS
        @Override
    public String ConsultaSaldo(){
        
        return "Saldo: " + saldo + "\nLimite de Credito: " + limiteCredito;
        
    }
    
        @Override
    public String Sacar (double saque){
        double lim = saque + limiteCredito;
        if (saque <= saldo && saque>0){
            this.saldo -= saque;
            return "Saque aprovado, novo saldo: " + saldo;
        }else if (saque<limiteCredito){
            this.saldo =0;
            limiteCredito -= lim;
            return "Saque aprovado, novo saldo = 0.0 \nLimite de Credito: " + limiteCredito;
        }else{
            return "Valor indisponivel para saque";
        }
    }

    @Override
    public String toString() {
        return "Corrente{" + "limiteCredito=" + limiteCredito + '}';
    }
    
    
}
