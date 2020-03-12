
package programa.pkg4.cursoemvideo;

import java.util.Scanner;

public class PROGRAMA4CURSOEMVIDEO {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        System.out.println("Digite o nome do aluno");
        String nome = ent.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = ent.nextFloat();
        
        System.out.printf("A nota de %s e %.1f", nome,nota);
    }
    
}
