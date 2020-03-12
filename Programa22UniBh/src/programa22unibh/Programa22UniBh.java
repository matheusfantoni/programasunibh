
package programa22unibh;

import java.util.Scanner;

public class Programa22UniBh {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in); // Pegar os dados do teclado
        
        Cliente c1 = new Cliente ();  // Criando objeto Cliente = c1   
        
        System.out.println("Digite o nome da pessoa");
        c1.setnome(in.nextLine()); // Settando o nome da pessoa
        System.out.println("Digite o cpf da pessoa");
        c1.setcpf(in.nextLine()); // Settando o cpf da pessoa
        
        Cliente c2 = new Cliente ("222-222-222-71","Joao da Silva"); // Criando objeto Cliente 
                                                              //  e ja settando os dados no objeto
        
        System.out.println(c1.imprimirDados()); // Impressao dos dados na tela
        System.out.println(c2.imprimirDados());
    }
    
}
