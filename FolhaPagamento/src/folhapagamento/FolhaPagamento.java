
package folhapagamento;

import java.util.ArrayList;

public class FolhaPagamento {
    public static void main(String[] args) {
        
        Dependente d1 = new Dependente();
        d1.setNome("Jose da Silva");
        d1.setCPF("111.111.111-11");
        d1.setIdade(2);
        
        Dependente d2 = new Dependente();
        d2.setNome("Marcos da Silva");
        d2.setCPF("111.111.111-12");
        d2.setIdade(3);
        
        Dependente d3 = new Dependente();
        d3.setNome("Paulo da Silva");
        d3.setCPF("111.111.111-13");
        d3.setIdade(4);
        
        Funcionario f1 = new Mensalista("MAT001", "Carlos Cruz","111.111.111-15",5000.0,120.0);
        
        f1.addDependente(d1);
        f1.addDependente(d2);
        
        ArrayList<Pagamento> lista = new 
                ArrayList<Pagamento>();
        
        Pagamento p1 = new Pagamento(f1);
        
        lista.add(p1);
        
        f1 = new CargoConfianca(
        2500.00, "MAT002", "Matheus Rocha",
                "111.111.111-18", 3000.00, 240.00);
        
        f1.addDependente(d3);
        
        p1 = new Pagamento(f1);
        
        lista.add(p1);
        
        for(Pagamento pg: lista){
            System.out.println(pg.imprimirRecibo());
        }
    }    
}
