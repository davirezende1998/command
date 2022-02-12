public class Licenca {
    private String nome;
    private String dataEmissao;
    private String situacao;

    public Licenca(String nome, String dataEmissao) {
        this.nome = nome;
        this.dataEmissao = dataEmissao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void emitirLicenca() {
        this.situacao = "Licença ativa";
    }

    public void revogarLicenca() {
        this.situacao = "Licença revogada";
    }
}