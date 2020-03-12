
package programa.pkg5.unibh;

import java.util.Scanner;

public class PROGRAMA5UNIBH {

    public static void main(String[] args) {
        int n1,n2,n3,quadrado,soma;
        System.out.print("Digite o primeiro número");
        Scanner entrada1 = new Scanner(System.in);
        n1 = entrada1.nextInt();
        System.out.print("Digite o segundo número");
        n2 = entrada1.nextInt();
        System.out.print ("Digite o terceiro número");
        n3 = entrada1.nextInt();
        quadrado = 0;
        soma = 0;
        
        if (n1 %2 ==0){
           quadrado = n1 * n1;
                   System.out.printf ("O quadrado do primeiro número é %d",quadrado);
        }
        if (n2 %2 ==0){
            quadrado = n2 * n2;
        System.out.printf ("O quadrado do segundo número é %d",quadrado);
        }
        if (n3 %2 ==0){
            quadrado = n3 * n3;
        System.out.printf ("O quadrado do terceiro número é %d",quadrado);
        }
        soma = n1+n2+n3;
            if (soma %5 ==0){
            System.out.printf("A soma dos números é %d e o mesmo é divisível por 5",soma);
        
        }
        if (n1 %2==0 || n1 %3==0){
            System.out.printf("O número %d é divisível por 2 ou 3",n1);
        }                
        if (n2 %2==0 || n2 %3==0){
            System.out.printf("O número %d é divisível por 2 ou 3",n2);
            
        }
        if (n3 %2==0 || n3 %3==0){
            System.out.printf("O número %d é divisível por 2 ou 3",n3);
    }
 
    }
}
