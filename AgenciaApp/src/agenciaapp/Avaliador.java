
package agenciaapp;

import java.util.ArrayList;
import java.util.Arrays;


public class Avaliador {
    private String rg, cpf, nome;
    private String dt_nasc,grau_acad,instituicao;
    private char sexo;
    private int[] area_pesquisas;

    public Avaliador(String rg, String cpf, String nome, String dt_nasc, String grau_acad, String instituicao, char sexo, int[] area_pesquisas) {
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.grau_acad = grau_acad;
        this.instituicao = instituicao;
        this.sexo = sexo;
        this.area_pesquisas = area_pesquisas;
    }
    
    public Avaliador (){
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(String dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getGrau_acad() {
        return grau_acad;
    }

    public void setGrau_acad(String grau_acad) {
        this.grau_acad = grau_acad;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int[] getArea_pesquisas() {
        return area_pesquisas;
    }

    public void setArea_pesquisas(int[] area_pesquisas) {
        this.area_pesquisas = area_pesquisas;
    }
    public String toString(){
    String str = String.format("RG: %s.\n CPF: %s.\n Nome: %s.\n Sexo: %s.\n"
            + "Data de Nascimento: %s.\n Grau acadêmico: %s.\n"
            + "Instituição: %s.\n",this.rg,this.cpf,this.nome,this.sexo,
            this.dt_nasc,this.grau_acad,this.instituicao);
    
    return str +  " Areas Pesquisas: " + Arrays.toString(area_pesquisas);
    
    }       
    
    
            
    
            
            
    
}
