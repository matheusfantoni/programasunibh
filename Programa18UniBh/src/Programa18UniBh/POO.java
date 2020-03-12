
package Programa18UniBh;

import java.util.Scanner;
import Programa18UniBh.CLIENTE;

public class POO {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);
        System.out.println("Digite o limite: ");
        CLIENTE cli = new CLIENTE(in2.nextDouble());
        System.out.println("Digite o ID: ");
        cli.id = in2.nextInt();
        System.out.println("Digite o nome ");
        cli.nome = in.nextLine();
        System.out.println("Digite o logradouro: ");
        cli.end.logradouro = in.nextLine();
        System.out.println("Digite o número: ");
        cli.end.numero = in2.nextInt();
        System.out.println("Digite a cidade ");
        cli.end.cidade = in.nextLine();
        int opcao = 1;
        while (opcao > 0){
            System.out.println("Digite 1 para comprar " + "e 0 para sair. " );
            opcao = in2.nextInt();
            if (opcao > 0){
                System.out.println("Digite o valor: ");
                double vlrCompra = in2.nextDouble();
                System.out.println(cli.Comprar(vlrCompra));
        }
    }
    }
    }
