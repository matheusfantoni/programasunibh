
package agenciaapp;

import Enum.GrandeAreaConhecimento;
import Enum.AreaConhecimento;


public class AreaPesquisa {
    private int codigo;
    private GrandeAreaConhecimento grandeAreaConhecimento;
    private AreaConhecimento areaConhecimento;
    
    
    public AreaPesquisa(){}
    

    public AreaPesquisa(int codigo, GrandeAreaConhecimento grandeAreaConhecimento, AreaConhecimento areaConhecimento) {
        this.codigo = codigo;
        this.grandeAreaConhecimento = grandeAreaConhecimento;
        this.areaConhecimento = areaConhecimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public GrandeAreaConhecimento getGrandeAreaConhecimento() {
        return grandeAreaConhecimento;
    }

    public void setGrandeAreaConhecimento(GrandeAreaConhecimento grandeAreaConhecimento) {
        this.grandeAreaConhecimento = grandeAreaConhecimento;
    }

    public AreaConhecimento getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }
    
    
    public String toString(){
        
        return String.format("Código da Área Pesquisa: %d.\n" + "Grande Área Conhecimento: %s.\n"
                + "Área Conhecimento: %s.\n",this.codigo,this.grandeAreaConhecimento,this.areaConhecimento);
    }
    
    
}
