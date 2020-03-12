
package programa.pkg14.unibh;

import java.util.Scanner;

public class PROGRAMA14UNIBH {

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner ent = new Scanner (System.in);
        
        System.out.print ("Digite o primeiro numero");
        n1 = ent.nextInt();
        System.out.print ("Digite o segundo numero");
        n2 = ent.nextInt();
        System.out.print("Digite o terceiro numero");
        n3 = ent.nextInt();
        
        if (n1 > n2 && n1 > n3 && n2>n3)
            System.out.printf("A ordem dos numeros e %d, %d,%d ",n3,n2,n1);
        else if (n2 > n1 && n2 > n3 && n3>n1)
            System.out.printf("A ordem dos numeros e %d, %d, %d,",n1,n3,n2);
        else if (n3 > n2 && n3 > n1 && n2 > n1)
            System.out.printf("A ordem dos numeros e %d, %d, %d",n1,n2,n3);
    }
    
}
