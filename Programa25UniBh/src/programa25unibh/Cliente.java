
package programa25unibh;

public class Cliente {
    
    private String CPF;
    private String nome;
    private ENDEREÇO end;

    public Cliente(String CPF, String nome, ENDEREÇO end) {
        this.CPF = CPF;
        this.nome = nome;
        this.end = end;
    }

    Cliente() {
       
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ENDEREÇO getEnd() {
        return end;
    }

    public void setEnd(ENDEREÇO end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Cliente = " + "CPF: " + CPF + ", NOME: " + nome + ", ENDEREÇO: " + end ;
    }

        
}
