
package programa19unibh;

public class Vendedor extends Funcionario{ // Extends para herdar os atributos da classe Funcionario
        
        private float percComissao;
        private float totVendas; // Atributos da classe Vendedor
        
        
        public Vendedor (String cpf, String nome, float percComissao, float totVendas){
                super (cpf,nome);
                this.percComissao = percComissao;
                this.totVendas = totVendas;             // CONSTRUTOR 
        }
        public void CalcularSalarioVendedor(){
            this.setsalario (this.totVendas * this.percComissao/100); // METODO PARA CALCULAR O SALARIO
                                                                        // DO VENDEDOR
        }
}
