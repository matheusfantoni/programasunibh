
package Programa18UniBh;

public class ENDEREÇO {
    public String logradouro;
    public int numero;
    public String cidade;
    
    public String MontaEndereco(){
        return String.format("Rua %s, número %d," + "Cidade: %s.",logradouro,numero,cidade);
    }
    
}
