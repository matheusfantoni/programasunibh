
package programa25unibh;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa25UniBh {

    static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    
    public static void main(String[] args) {
        
        
        
        Scanner in = new Scanner (System.in);
        Scanner ent = new Scanner (System.in);
        
        
        int opcao, auxiliar, parar;
        parar = 5;
        
        
        do {
    
          System.out.printf("Banco:\n(1) Cadastrar Cliente.\n(2) Cadastrar Conta.\n" +
          "(3) Consultar Saldo.\n(4) Depositar.\n(5) Sacar.\n(0) Sair. " );
        
           opcao = in.nextInt();

         switch( opcao ) {
            case 0:
            break;
            case 1:
              if(!(Banco.cadastrarCliente())){
               System.out.println("ERRO AO CADASTRAR O CLIENTE ");
              }else{
                  Cliente cliente = listaCliente.get(0);
                   System.out.println(cliente.toString());
              }
            break;
           
            case 2:
               if (Banco.CadastrarConta()){
               } 
            break;
            
          /*  case 3:
               metodo03( );
            break;
            
            case 4:
               metodo04( );
            break;
            
            case 5:
               metodo05( );
        
           
            break;
          */  
            default:
            System.out.println( "Opcao invalida!" );
         }
      } while( opcao != 0 );
        
        
    }
    
}
