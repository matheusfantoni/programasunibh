
package exercicioheranca;


public class ExercicioHeranca {

    public static void main(String[] args) {
        
       Endereco end = new Endereco ();
       end.setLogradouro("Cristiano Machado");
       end.setCidade("Belo Horizonte");
       end.setEstado("Minas Gerais");
       end.setNumero(4000);
       end.setCep("31710-540");
       
       Aluno a1 = new Aluno ("Matheus Fantoni", "99858-4984", end, "Ativo", "Computação");
        System.out.println(a1.imprimirDados());
       
    }
    
    
    
    
    
}
