
package programa.pkg8.unibh;


import java.util.Scanner;

public class PROGRAMA8UNIBH {

    public static void main(String[] args) {
        float nota, soma = 0, maiornota = 0;
        int maior15 = 0;
        
        Scanner ent = new Scanner (System.in);
        
        for (int i=1; i<=5 ; i++){
            System.out.printf("Digite a %d° nota:",i);
            nota = ent.nextFloat();
            soma = soma + nota;
        if (nota > maiornota)
            maiornota = nota;
        if (nota > 15)
            maior15 ++;
        }
        if (soma >= 70)
            System.out.printf("Você foi aprovado com %8.2f pontos",soma);
        else
            System.out.printf("\nVocê foi reprovado com %8.2f pontos. Faltaram %8.2f pontos.",soma,70-soma);
        System.out.printf ("\nA soma das notas foi %8.2f.\n A maior nota foi %8.2f.\n Tivemos %d notas maiores que 15",soma,maiornota,maior15);
            
    }
    
}
