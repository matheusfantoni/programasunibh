
package programa.pkg15.unibhaa;

import java.util.Scanner;

public class PROGRAMA15UNIBHAA {

    public static void main(String[] args) {
        double nota1,nota2,nota3;
        Scanner ent = new Scanner (System.in);
        double media;
        
        System.out.print("Digite a primeira nota");
        nota1 = ent.nextDouble();
        System.out.print("Digite a segunda nota");
        nota2 = ent.nextDouble();
        System.out.print("Digite a terceira nota");
        nota3 = ent.nextDouble();
        
        media = ((nota1+nota2+nota3)/3);
        if (media >= 7.0)
            System.out.print("Aprovado");
        else if (media >= 5.0 && media < 7.0)
            System.out.print ("Recuperacao");
        else if (media < 5.0)
                System.out.print ("Reprovado");
        else
            System.out.print("Digite um valor valido");
                
    }
    
}
