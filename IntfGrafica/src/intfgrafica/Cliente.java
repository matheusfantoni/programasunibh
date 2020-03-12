
package intfgrafica;

public class Cliente {
    private String nome;
    private String CPF;
    private int id;
    private static int contadorId = 1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = contadorId;
        contadorId++;
    }    
    
    public Cliente(String nome, String CPF){
       this.nome = nome;
       this.CPF = CPF; 
       this.setId();
    }
}
