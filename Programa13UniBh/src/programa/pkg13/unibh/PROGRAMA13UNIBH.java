
package programa.pkg13.unibh;

import java.util.Random;
import java.util.Scanner;

public class PROGRAMA13UNIBH {

    public static void main(String[] args) {
        int [][] Mat = new int [3] [3];
        float media;
        Scanner ent = new Scanner (System.in);
        
        
        int lin, col, soma = 0,conta_ele = 0;
        
        for (lin = 0;lin < 3;lin++)
            for (col = 0;col < 3; col++){
                        System.out.printf("Digite a posição %d x %d:",lin+1,col+1);
            Mat [lin] [col] = ent.nextInt();
            
            while (Mat[lin][col] <= 0){
                System.out.print("Insira um valor maior que zero");
                Mat [lin][col] = ent.nextInt();
            }
            
            soma = Mat [lin][col] + soma;
            }
            media = soma / 9;
            for (lin = 0;lin < 3;lin++)
                for (col = 0;col < 3; col++){
                    if (Mat [lin][col] > media)
                    conta_ele++;
                    if (lin==col)
                        System.out.printf("%d diagonal principal: \n",Mat[lin][col]);
                }
            System.out.printf("Soma: %d. \n Média: %8.2f \n" + "Elementos acima da"  + "média: %d",soma,media,conta_ele);
 }
}         
        
   
    

