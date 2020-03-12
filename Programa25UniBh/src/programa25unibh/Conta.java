
package programa25unibh;

public abstract class Conta  {
        
        public int agencia;
        public int numero;
        public int saldo;
        public Cliente cliente;

    
    // CONSTRUTOR    
    public Conta(int agencia, int numero, int saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    // GETTERS E SETTERS
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
   // METODOS DA CLASSE CONTA
  
    public String ConsultaSaldo(){
      return "Saldo: " + saldo;
  }
  
  public String Sacar(double saque){
      if (saque>0 && saque<saldo)
      {
          this.saldo -= saque;
          return "Novo Saldo: " + saldo;
      }   else
          return "Valor invalido para saque.";
  }
        
  public String Depositar(double depositar){
      if (depositar > 0)
      {
          this.saldo += depositar;
          return "Novo saldo: " + saldo;
      }else
          return "Valor invalido para deposito";
  }      
}
