
package agenciaapp;

public class Projeto {
    
    private String codigo;
    private String titulo;
    private int duracao;
    private double orcamento;
    private String instituicao_pesquisa;
    private String dt_Envio;
    private String dt_Resposta;
    private boolean resultado;
    private AreaPesquisa area_pesquisa;
    
    public Projeto(){}

    public Projeto(String codigo, String titulo, int duracao, double orcamento, String instituicao_pesquisa, String dt_Envio, String dt_Resposta, boolean resultado, AreaPesquisa area_pesquisa) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.instituicao_pesquisa = instituicao_pesquisa;
        this.dt_Envio = dt_Envio;
        this.dt_Resposta = dt_Resposta;
        this.resultado = resultado;
        this.area_pesquisa = area_pesquisa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getInstituicao_pesquisa() {
        return instituicao_pesquisa;
    }

    public void setInstituicao_pesquisa(String instituicao_pesquisa) {
        this.instituicao_pesquisa = instituicao_pesquisa;
    }

    public String getDt_Envio() {
        return dt_Envio;
    }

    public void setDt_Envio(String dt_Envio) {
        this.dt_Envio = dt_Envio;
    }

    public String getDt_Resposta() {
        return dt_Resposta;
    }

    public void setDt_Resposta(String dt_Resposta) {
        this.dt_Resposta = dt_Resposta;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public AreaPesquisa getArea_pesquisa() {
        return area_pesquisa;
    }

    public void setArea_pesquisa(AreaPesquisa area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }
    
    public String toString(){
        return String.format("Código: %s. \n  Título: %s.\n  Duração: %d.\n Orçamento: %8.2f.\n"
                + "Instituição Pesquisa: %s.\n Data de Envio: %s.\n Data de Resposta: %s.\n"
                + "Resultado: %s.\n Area Pesquisa: %s",this.codigo,this.titulo,this.duracao,this.orcamento,
                this.instituicao_pesquisa,this.dt_Envio,this.dt_Resposta,this.resultado,this.area_pesquisa);
    }
    
    
}
