
package programa24unibh;

import java.util.Scanner;

public class Programa24UniBh {

    public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);    
    
    int indiceDestaque = 0;
    Aluno[] alu = new Aluno [10];
    
        for (int i = 0; i<10;i++){
            System.out.printf("Digite a matricula do aluno %d:", i+1);
            alu[i] = new Aluno();
            alu[i].setMat(in.nextLine());
            System.out.println("Digite o nome:");
            alu[i].setNome(in.nextLine());
            
            for (int j = 0;j<3;j++){
                System.out.printf("Digite a nota %d:",j+1);
                alu[i].setNotas(in.nextInt(),j);
            }               
            
            System.out.println("Digite a frequencia:");
            alu[i].setfreq (in.nextDouble());
            System.out.println(alu[i].imprimirDados());
        }
        
        for (int i = 0; i<10;i++){
            if(alu[i].getSomaNotas() > indiceDestaque)
                indiceDestaque = i;
        }
        System.out.printf("Destaque Academico: %s",alu[indiceDestaque].imprimirDados());
            
    }
    
}
