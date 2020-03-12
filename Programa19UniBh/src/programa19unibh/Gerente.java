
package programa19unibh;

public class Gerente extends Funcionario{ //EXTENDS FUNCIONARIO PARA HERDAR OS ATRIBUTOS DA CLASSE FUNCIONARIO
        
        private float bonus; //ATRIBUTOS
    
        
        public Gerente (String cpf,String nome,float bonus,float salario){
            super (cpf,nome,salario);
            this.bonus = bonus;  // CONSTRUTOR 1
        }
           
       public Gerente (){}    
        
        
        public float getbonus(){
            return this.bonus; // GETTER DO BONUS
        }
        
        public void setbonus (float bonus){
            this.bonus = bonus; // SETTER DO BONUS
        }
        
        public void CalcularSalarioGerente (float sal){
            this.setsalario  (sal + this.bonus); // METODO PARA CALCULAR O VALOR DO SALARIO DO GERENTE
           
        }
                     
         public String GerimprimirDados(){
            return String.format("CPF: %s \nNOME: %s \nBONUS: %8.2f \nSALARIO: %8.2f",this.getcpf(), this.getnome(),this.bonus,this.getsalario());
        }
}
