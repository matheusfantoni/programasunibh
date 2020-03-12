
package programa.pkg9.unibh;

import java.util.Scanner;

public class PROGRAMA9UNIBH {

    public static void main(String[] args) {
        float debito = 0, deb_acumulado = 0, capacidade = 1000;
        
        Scanner in =  new Scanner (System.in);
        while (deb_acumulado < capacidade){
            System.out.println("Digite o valor do debito:");
            debito = in.nextFloat();
            deb_acumulado += debito;
            System.out.printf("Ainda existe uma capacidade de %8.2f",capacidade-deb_acumulado);
        }
            
    }
    
}
