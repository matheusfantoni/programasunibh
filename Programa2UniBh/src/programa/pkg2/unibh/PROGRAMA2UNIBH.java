
package programa.pkg2.unibh;

import java.util.Scanner;

public class PROGRAMA2UNIBH {

    public static void main(String[] args) {
        
        float peso = 0,altura =0,imc = 0;
        Scanner ent = new Scanner (System.in);
        
        System.out.println("Digite o seu peso");
        peso = ent.nextFloat();
        System.out.println("Digite a sua altura");
        altura = ent.nextFloat();  
        
        imc = peso /( altura * altura);
               
        if (imc >= 17 && imc <= 18.4)
            System.out.println("Abaixo do peso");
        else if (imc >= 18.5 && imc <= 24.9)
            System.out.println("Peso Normal");
        else if (imc >= 25 && imc <= 29.9)
            System.out.println("Acima do peso");
        else if (imc >= 30 && imc <= 34.9)
            System.out.println("Obesidade");
        else
            System.out.println("Fora dos valores conhecidos"); ;
    }
    
}
