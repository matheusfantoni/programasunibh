
package programa.pkg4.unibh;

import java.util.Scanner;


public class PROGRAMA4UNIBH {

    public static void main(String[] args) {
        int n1, n2,resultado;
        System.out.print("Digite o primeiro número de entrada");
        Scanner entrada1 = new Scanner(System.in);
        n1 = entrada1.nextInt();
        System.out.print("Digite o segundo número de entrada");
        Scanner entrada2 = new Scanner(System.in);
        n2 = entrada2.nextInt();
        if (n1 == n2)
            System.out.println("Os números de entrada são iguais");
        else if (n1 > n2)        
            System.out.printf("O número %d é maior que o número %d",n1,n2);
        else 
            System.out.printf("O número %d é maior que o número %d",n2,n1);
        if (n1 %2 ==0){
         resultado = n1 * 3;
            System.out.printf("O número %d é par e a multiplicação de %d por 3 é igual a %d",n1,n1,resultado);
        }  
        if (n2 %2 ==0){
            resultado = n2 * 3;
            System.out.printf("O número %d é par e a multiplicação de %d por 3 é igual a %d",n2,n2,resultado);
            
        }
        else {
            resultado = n2 * 4;
            System.out.printf("O número %d é ímpar e a multiplicação de %d por 4 é igual a %d",n2,n2,resultado);
        }
        if (n1 %2 ==0 && n1%3 ==0)
            System.out.printf("O número %d é divisível por 2 e 3",n1);
        if (n2 %2 ==0 && n2%3 ==0)
            System.out.printf("O número %d é divisível por 2 e 3",n2);
        
    }
}

