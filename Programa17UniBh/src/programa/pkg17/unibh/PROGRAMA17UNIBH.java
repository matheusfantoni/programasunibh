
package programa.pkg17.unibh;



public class PROGRAMA17UNIBH {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa (1970);
        Pessoa p2 = new Pessoa (1980);
        p1.cpf = "000.000.000-00";
        p1.nome = "Matheus Fantoni";
        p1.telefone = "99858-4984";
        String aux = p1.DadosPessoa();
        System.out.printf("%s",aux);
       
        p2.cpf = "111.111.111-11";
        p2.nome = "Ana Paula";
        p2.telefone = "9124-3213";
        System.out.printf("%s",p2.DadosPessoa());
    }
    
}
