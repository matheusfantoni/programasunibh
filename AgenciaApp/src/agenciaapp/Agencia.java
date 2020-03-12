
package agenciaapp;

import java.util.ArrayList;

public class Agencia {
    
    private ArrayList<Pesquisador> pesquisadores;
    private ArrayList<Avaliador> avaliadores;
    private ArrayList<AreaPesquisa> areas_pesquisas;
    
    
    
public Agencia (){}

public void adicionarPesquisador(Pesquisador p){
    pesquisadores.add(p);
}
        
public void adicionarAvaliador(Avaliador a){
    avaliadores.add(a);
}    

public void adicionarAreaPesquisa(AreaPesquisa ap){
    areas_pesquisas.add(ap);
}

public Pesquisador encontrarPesquisador(String cpf){
    
    for(Pesquisador p : pesquisadores){
        if (p.getCpf().equals(cpf))
            return p;
        }
        
        return null;
}

public Avaliador encontrarAvaliador(String cpf){
    
    for (Avaliador a : avaliadores){
        if (a.getCpf().equals(cpf))
            return a;
    }
    
        return null;
}

public AreaPesquisa encontrarAreaPesquisa(int codigo){
    
    
    for (AreaPesquisa ap : areas_pesquisas){
        if (ap.getCodigo() == codigo)
            return ap;
                
    }
    
        return null;
}


public void mostraAvaliadores(){
    
    for (Avaliador a : avaliadores)
        a.toString();
}

public void mostraPesquisadores(){
    
    for (Pesquisador p : pesquisadores)
        p.toString();
}

public void mostraAreasPequisa(){
    
    for (AreaPesquisa ap : areas_pesquisas)
        ap.toString();
}

}
