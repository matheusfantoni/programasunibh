
package programa.pkg3.unibh;

import java.util.Scanner;

public class PROGRAMA3UNIBH {

    public static void main(String[] args) {
        
        int n1  = 0,n2 = 0,soma =0,q1 = 0,q2 = 0;
        Scanner ent = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero");
        n1 = ent.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = ent.nextInt();
        
        soma = n1+n2;
        System.out.printf("A soma dos numeros e: %d",soma);
        
        if (n1 %2 ==0){
            System.out.printf("\nO primeiro numero e par: %d",n1);
        if (n2 %2 ==0)
            System.out.printf("\nO segundo numero e par: %d",n2);
        if (n1 %2 != 0)
            System.out.printf("\nO primeiro numero e impar: %d",n1);
        if (n2 %2  != 0)
            System.out.printf("\nO segundo numero e impar: %d",n2);
        else
            System.out.println("Digite o valor valido");
    }
        q1 = n1*n1;
            System.out.printf("\nO quadrado do primeiro numero e: %d",q1);
        q2 = n2*n2;
            System.out.printf("\nO quadrado do segundo numero e: %d",q2);    
               
    }
}
