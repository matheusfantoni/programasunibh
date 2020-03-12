
package programa.pkg10.unibh;

import java.util.Scanner;

public class PROGRAMA10UNIBH {

    public static void main(String[] args) {
        int numero = 0,conta_nros = 0,soma_par = 0,qtde_par = 0;
        char opcao = 'S';
        Scanner ent = new Scanner (System.in);
        
        while (opcao == 's' || opcao == 'S'){
        System.out.print("Digite um numeros");
        numero = ent.nextInt();
        while (numero < 0){
            System.out.print("Invalido! Digite um numero positivo");
            numero = ent.nextInt();
        }
        conta_nros ++;
        if (numero %2 ==0){
            soma_par += numero;
            qtde_par ++;
        }
        if (numero %100 == 37)
            System.out.printf("O numero %d possui dezena 37",numero);
        System.out.print("Digite S para continuar");
        opcao = ent.next().charAt(0);
        }
        System.out.printf("Foram digitados %d numeros. A soma dos pares e %d e a quantidade de pares e %d",conta_nros,soma_par,qtde_par);
        }
    }
    


