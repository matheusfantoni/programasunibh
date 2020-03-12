
package exercício.prof;

import java.util.Scanner;

public class ExercícioPROF {

    public static void main(String[] args) {
        int n1,n2,soma,quadrado1,quadrado2;
        System.out.print("Digite o primeiro número");
        Scanner entrada1 = new Scanner(System.in);
        n1 = entrada1.nextInt();
        System.out.print("Digite o segundo número");
        Scanner entrada2 = new Scanner(System.in);
        n2 = entrada2.nextInt();
        soma = n1 + n2;
        System.out.println("A soma dos números é: " + soma);
        if (n1 % 2 == 0)
            System.out.println("O primeiro número é par");
        else
            System.out.println ("O primeiro número é ímpar");
        
        if (n2 % 2 == 0)
            System.out.println("O segundo número é par");
        else
            System.out.println("O segundo número é ímpar");
        quadrado1 = n1 * n1;
        quadrado2 = n2 * n2;
        System.out.printf("O quadrado do primeiro número é %d e o quadrado do segundo número é %d",quadrado1,quadrado2);
        
        
        
        
    }
    
}
