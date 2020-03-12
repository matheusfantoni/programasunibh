
package programa.pkg1.unibh;

import java.util.Scanner;

public class Programa1UniBh {

    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 =0,media =0;
        
        
        Scanner ent = new Scanner (System.in);
        System.out.println("Digite o primeiro numero");
        nota1 = ent.nextFloat();
        System.out.println("Digite o segundo numero");
        nota2 = ent.nextFloat();
        System.out.println("Digite o terceiro numero");
        nota3 = ent.nextFloat();
        System.out.println("Digite o quarto numero");
        nota4 = ent.nextFloat();
        
        media = ((nota1+nota2+nota3+nota4)/4);
        System.out.printf("A media simples das notas é: %8.2f",media);
        
        
        
    }
    
}
