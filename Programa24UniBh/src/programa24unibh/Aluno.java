
package programa24unibh;

public class Aluno {
    
    private String mat;
    private String nome;
    private int[] notas = new int [3];
    private String status;       // Atributos da CLASSE ALUNO
    private double freq;
    private int somaNotas;
    
    
    public String getMat(){
        return this.mat;
    }
    public void setMat (String mat){
        this.mat = mat;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getStatus(){
        return this.status;
    }
    public double getFreq(){
        return this.freq;
    }
    public void setfreq(double freq){
        this.freq = freq;
        this.atualizarStatus();
    }
    public int getSomaNotas(){
        return this.somaNotas;
    }
    
    public void setNotas (int nota,int posicao){
        this.notas[posicao] = nota;
        this.realizarSomaNotas();
        this.atualizarStatus();
    }
    
    private void realizarSomaNotas(){
        for (int i = 0; i < 3 ; i++)
            this.somaNotas += this.notas[i];
    }
    private void atualizarStatus(){
        if (this.somaNotas >= 70 && this.freq>=75)
            this.status = "Aprovado";
        else
           this.status = "Reprovado"; 
    }
    public double retornarMediaNotas(){
        return this.somaNotas/3;
    }
    
    public String imprimirDados(){
        return String.format("Nome: %s. \nMatricula: %s. \nTotal de Notas: %d. \nFrequencia: %8.2f."
                + " \nStatus: %s.\n Media: %8.2f.",this.nome,this.mat,
                this.somaNotas,this.freq,this.status,this.retornarMediaNotas());
    }
}
