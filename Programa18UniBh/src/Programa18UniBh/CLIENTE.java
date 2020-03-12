
package Programa18UniBh;

public class CLIENTE {
        public int id;
        public String nome;
        public double limite;
        public double valorComprado;
        public ENDEREÇO end;
        public int soma;
       
        // CONSTRUTOR
        public CLIENTE (double limite){
            this.limite = limite;
            end = new ENDEREÇO();
            
        }
        public String Comprar (double valorComprado){
            if (valorComprado > this.limite)
                return "Compra não autorizada. ";
            else{
                this.limite = this.limite - valorComprado;
                this.valorComprado = this.valorComprado + valorComprado;
                return String.format("Cliente: %s \n" + "Compra Autorizada " + "Valor: %8.2f \n" + "Limite: %8.2f",this.nome,this.valorComprado,this.limite);
        }
    }        
        
        
}
        