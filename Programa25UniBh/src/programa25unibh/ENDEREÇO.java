
package programa25unibh;

public class ENDEREÇO {
    private String logradouro;
    private int numero;
    private String cidade;
    private String UF;
    private int CEP;
    
    public ENDEREÇO (){}

    public ENDEREÇO(String logradouro, int numero, String cidade, String UF, int CEP) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.UF = UF;
        this.CEP = CEP;
    }
      

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
    
    
    @Override
    public String toString(){
        return String.format("Rua %s, número %d, " + "Cidade: %s. " + "UF: %s. " + "CEP: %d. " ,logradouro,numero,cidade,UF,CEP);
    }
    
    
    
}
