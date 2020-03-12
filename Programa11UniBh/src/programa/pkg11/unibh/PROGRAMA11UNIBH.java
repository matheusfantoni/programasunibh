
package programa.pkg11.unibh;

import java.util.Scanner;

public class PROGRAMA11UNIBH {

    public static void main(String[] args) {
        int [] numeros = new int [10];
        int [] resultado = new int [3];
        Scanner in = new Scanner (System.in);
        int i = 0;
        
        
        for (i = 0;i <10;i++){
            System.out.printf("Digite o %dº numero",i+1);
        numeros[i] = in.nextInt();
    }
        for (i = 0; i < 10; i++){
            resultado [0] = resultado [0] + numeros [i];
            if (numeros [i] > resultado [1])
                resultado [1] = numeros [i];
            if(numeros [i] %2 ==0)
                resultado [2] ++;
            
        }
           System.out.printf("A soma dos numeros e %d.\n O maior numero e o %d.\n Existem %d pares",resultado [0],resultado [1],resultado [2]);
           
            
    } 
}
