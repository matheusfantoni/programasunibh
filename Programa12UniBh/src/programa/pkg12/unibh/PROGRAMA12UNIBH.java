
package programa.pkg12.unibh;

import java.util.Scanner;

public class PROGRAMA12UNIBH {

    public static void main(String[] args) {
        int [] idades =  new int [2];
        String [] nomes = new String [2];
        double [] peso = new double [2];
        double [] altura = new double [2];
        double [] imc = new double [2];
        
        Scanner ent = new Scanner (System.in);
        Scanner ent2 = new Scanner (System.in);
        int i = 0;
        double imc_aux = 0;
        String [] classif = new String [2];
                
        for (i = 0; i < 2;i++){
            System.out.printf("Digite a idade da %dº pessoa:",i+1);
            idades [i] = ent.nextInt();
            System.out.printf("Digite o nome da %dº pessoa:",i+1);
            nomes [i] = ent2.nextLine();
            System.out.printf("Digite o peso da %dº pessoa:",i+1);
            peso [i] = ent.nextDouble();
            System.out.printf("Digite a altura da %dº pessoa:", i+1);
            altura [i] = ent.nextDouble();
            imc [i] = peso [i] / altura [i] * altura [i];
            if (imc [i] <= 18.5)
                classif [i] = "Abaixo do peso";
            else if (imc [i] > 18.5 && imc [i] <= 24.9)
                classif [i] = "Peso ideal";
            else if (imc [i] > 24.9 && imc [i] <= 29.9)
                classif [i] = "Levemente acima do peso";
            else if (imc [i] > 29.9 && imc [i] <= 34.9)
                classif [i] = "Obesidade grau I";
            else
                    classif [i] = "Obesidade alta";
        }
          System.out.println("ID\t NOME \t NASCIMENTO \t ALTURA \t PESO \t IMC \t CLASSIFICACAO");
          
          for (i = 0; i < 2;i++)
              System.out.printf("%d\t%s\t%d\t%8.2f\t%8.2f\t%8.2f\t%s\n",i+1,nomes[i],2018-idades[i],altura[i],peso[i],imc[i],classif[i]);
                  
            
    }
    
}
