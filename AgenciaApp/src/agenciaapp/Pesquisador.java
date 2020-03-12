
package agenciaapp;

import java.util.ArrayList;

public class Pesquisador {
    
        private String rg;
        private String cpf;
        private String nome;
        private char sexo;
        private String dt_Nasc;
        private String grau_acad;
        private String instituicao;
        private ArrayList<Projeto> listaProjetos = null;
        
        
    
    public Pesquisador (){}    
        
    public Pesquisador(String rg, String cpf, String nome, char sexo, String dt_Nasc, String grau_acad, String instituicao, ArrayList<Projeto> projetos) {
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dt_Nasc = dt_Nasc;
        this.grau_acad = grau_acad;
        this.instituicao = instituicao;
        this.listaProjetos = projetos;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDt_Nasc() {
        return dt_Nasc;
    }

    public void setDt_Nasc(String dt_Nasc) {
        this.dt_Nasc = dt_Nasc;
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

    public ArrayList<Projeto> getProjetos() {
        return listaProjetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.listaProjetos = projetos;
    }

    public void addProjeto(Projeto p){
        listaProjetos.add(p);
    }

    public Projeto encontrarProjeto(String codigo){
        for (Projeto p : listaProjetos){
            if (p.getCodigo().equals(codigo))
                return p;
        }
         return null;   
    }
    
    public void listarProjeto(String codigo){
        for (Projeto p : listaProjetos){
            if (p.getCodigo().equals(codigo))
                p.toString();
            
            else {
                System.out.println("Lista de projetos não encontrados.");
                }
        }
    }  
    
    public void listarProjeto (){
        for (Projeto p : listaProjetos){
             p.toString();
        }
    }
    
    public int contarProjeto(){
        
        int contaProjetos = 0;
        
        for (Projeto p : listaProjetos){
            contaProjetos ++;
        }
        return contaProjetos;
    }
    
    
    public String toString(){
        return String.format("RG: %s.\n CPF: %s.\n Nome: %s.\n Sexo: %s.\n Data de Nascimento: %s.\n"
                + "Grau Acadêmico: %s.\n Instituição: %s.\n Projetos: %s",this.rg,this.cpf,this.nome,
                this.sexo,this.dt_Nasc,this.grau_acad,this.instituicao,this.listaProjetos);
        
         
    }    
        
        
        
        
        
}
    
    
    
