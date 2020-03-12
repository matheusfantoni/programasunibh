
package programa19unibh;

import java.util.Scanner;

public class Programa19UniBh {

    public static void main(String[] args) {
                
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o CPF:");
        Gerente ger1 = new Gerente ();
        ger1.setcpf(in.nextLine());
        System.out.println("Digite o NOME:");
        ger1.setnome(in.nextLine());
        System.out.println("Digite o BONUS:");      // PEDINDO AO USUARIO PARA QUE DIGITE OS DADOS
        ger1.setbonus(in.nextFloat());
        System.out.println("Digite o SALARIO:");
        ger1.setsalario(in.nextFloat());
        
        System.out.println(ger1.GerimprimirDados()); // IMPRESSAO DOS DADOS NA TELA
        
        
        Gerente ger2 = new Gerente ("111.111.111-11", "Ana Paula",(float)10.000, (float) 1000.0); 
                                    // Settando os valores no objeto direto
        System.out.printf(ger2.GerimprimirDados()); // IMPRESSAO DOS DADOS NA TELA
        
        
        
       
    }
    
}
