
package programa23unibh;

import java.util.Scanner;

public class Programa23UniBh {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        Cliente[] cli = new Cliente[2];
        cli[0] = new Cliente();
        System.out.println("Digite o id, nome e o limite de Credito desejado:");
        
        cli[0].id = in.nextInt(); 
        cli[0].nome = in2.nextLine();  // Informando o usuario para digitar os valores necessarios
        cli[0].limiteCredito = in.nextDouble(); 
        
        cli[1] = new Cliente (200,"Ana Paula Fantoni",5000.0); // Settando os valores direto
        
        for (int i = 0; i <2;i++)
            System.out.println(cli[i].imprimirDados());
    }
    
}
