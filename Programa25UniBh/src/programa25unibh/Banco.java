
package programa25unibh;

import java.util.Scanner;

public class Banco extends Conta {
        
        public static boolean testarLetra( String nome ) {
      
      boolean resposta = false;
      char x ;
      int cont = 0 ;
      
      // tirar espaços internos da String
      nome = nome.replaceAll(" ",""); 
      
      
      // testar se tem apenas Letra
      
      for(int i = 0 ; i < nome.length(); i++){
      
          x = nome.charAt(i);
          
            if( x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z' ) {
            cont++;
            }
       }
       
       if( cont == nome.length()){
         resposta = true;
       }
                  
      return( resposta );  
     
   } 




    public static boolean  cadastrarCliente(){
    
        Scanner in = new Scanner(System.in);
        Scanner ent = new Scanner (System.in);
        Cliente cli = new Cliente();
        ENDEREÇO end = new ENDEREÇO ();    
        
        int i = 0 ; 
        String nome;
            
        System.out.println("\n CADASTRO DE UM NOVO CLIENTE"); 
        System.out.println();  
                                
       do {
       
        System.out.printf("Digite o nome do cliente:");
        nome = in.nextLine(); 
      
            if (testarLetra(nome)) {                    
              cli.setNome(nome);
              i = 3 ;
            }
            else {
               System.out.println("Nome incorreto, digite o nome novamente:");
               i++;
               
                if(i == 3){
                  return false ;
                 }
            }
            
         }while(i != 3);
            
                
        System.out.printf("Digite o CPF do cliente:");               
        cli.setCPF(in.nextLine());
                
        System.out.printf("Digite a rua do cliente:");   
        end.setLogradouro(in.nextLine());
                
        System.out.printf("Digite o numero:");                
        end.setNumero(ent.nextInt());
               
        System.out.printf("Digite a cidade do cliente:");                
        end.setCidade(in.nextLine());
                
        System.out.printf("Digite o estado do cliente:");
        end.setUF(in.nextLine());
                
		  System.out.printf("Digite o Cep do cliente:");
        end.setCEP(in.nextInt());
        
        cli.setEnd(end);
        
        System.out.println("");      
        System.out.println("CLIENTE CADASTRADO COM SUCESSO \n"+cli.toString());     
       
        Programa25UniBh.listaCliente.add(cli);

    
    return true ;
    }
    
    public static boolean CadastrarConta(){
        
        Scanner tecladonumero = new Scanner (System.in);
        Scanner tecladotexto = new Scanner (System.in);
        
        Cliente cli = new Cliente();
        ENDEREÇO end = new ENDEREÇO ();
        
        double limiteCredito = 0;
        int agencia = 0 ; 
        long numero = 0;
        int selectConta = 0;
        int saldo = 0;
            
        System.out.println("\n CADASTRO DE UMA NOVA CONTA"); 
        System.out.println("(7) Conta Corrente \n (8) Conta Poupança ");
        
        selectConta = tecladonumero.nextInt();
        if (selectConta == 7){ //corrente
            limiteCredito = 5000.0;
            System.out.println("Digite a agencia: ");
            agencia = tecladonumero.nextInt();
            System.out.println("Digite o numero: ");
            numero = tecladonumero.nextLong();
            System.out.println("Digite o saldo: ");
            saldo = tecladonumero.nextInt();
            
            int novoNumero = (int)numero;
            Corrente corrente = new Corrente(limiteCredito, agencia, novoNumero, 500, new Cliente());
            
            
        }else if (selectConta == 8){ // poupanca
            System.out.println("Digite a agencia: ");
            
            agencia = tecladonumero.nextInt();
            System.out.println("Digite o numero: ");
            numero = tecladonumero.nextLong();
            
            
        }
        else{
            System.out.println("Digite 7 ou 8 para continuar: ");
            selectConta = tecladonumero.nextInt();
        }        
        
        return true ;
        
    }

    public Banco(int agencia, int numero, int saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
    }
}
