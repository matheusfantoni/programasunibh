
package matriz;

import java.util.Scanner;

public class MATRIZ {

    public static void main(String[] args) {
         double[][]m = new double [6][5];
        Scanner in = new Scanner (System.in);
        double soma=0, melhormedia=0;
        String melhoraluno="";
        int i;
       
        String[]nome = new String [6];
        String[]resultado = new String [6];
        double[]media= new double [6];
        
        for(i=0; i<6; i++){
            System.out.printf("Digite o nome do aluno %d: \n", i+1);
            nome[i]= in.next();
            System.out.printf("Digite a nota 1 de %s:", nome[i]);
            m[i][0]=in.nextDouble();
            System.out.printf("Digite a nota 2 de %s:", nome[i]);
            m[i][1]=in.nextDouble();
            System.out.printf("Digite a nota 3 de %s:", nome[i]);
            m[i][2]=in.nextDouble();
            
            soma=0;
            soma= m[i][0]+m[i][1]+m[i][2];
            media[i]=(soma/3);
            
           if(media[i] >= 7)
               resultado [i]= "aprovado";
           else
               resultado [i]= "reprovado";
           if(media[i]>melhormedia)
               melhormedia = media[i];
               melhoraluno = nome[i];
        }
        System.out.printf("\n O melhor aluno foi %s", nome[i]);
        System.out.print("Nome \t  Nota1  \t  Nota2  \t  Nota3  \t  Média  \t  Resultado \n");
        
        for(i=0; i<15; i++)
            System.out.printf("%s \t %8.2f \t %8.2f \t %8.2f \t %8.2f \t %s \n", nome[i],m[i][0],m[i][1],m[i][2], media[i],resultado[i]);    
    }              
}
    
    

