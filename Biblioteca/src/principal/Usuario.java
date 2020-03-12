
package principal;

import java.util.Date;

public class Usuario {
    
    // ATRIBUTOS DA CLASSE USUARIO
    
    private int codigo;
    private String nome;
    private long cpf;
    private String endereco;
    private String telefone;
    private Date dataNasc;
    private static int contaID;
    
    
    // CONSTRUTOR DA CLASSE USUARIO
    
    public Usuario(int codigo, String nome, long cpf, String endereco, String telefone, Date dataNasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        setContaID();
        
    }
    
    // GETTERS E SETTERS

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public static int getContaID() {
        return contaID;
    }

    private void setContaID() {
        this.codigo = contaID;
        contaID ++;
    }
    
    
    // TO STRING
    
    @Override
    public String toString() {
        return "Nome do Usuario = " + nome + ".\n CPF = " + cpf + ".\n Endereco = " + endereco + ".\n Telefone = " + telefone + ".\n Data de Nascimento = " + dataNasc + '}';
    }

    
    
    
    
    
}
