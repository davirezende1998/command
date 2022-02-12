public class Revogar implements Acao{
    private Licenca licenca;

    public Revogar(Licenca licenca) {
        this.licenca = licenca;
    }

    public void executar() {
        this.licenca.revogarLicenca();
    }

    public void cancelar() {
        this.licenca.emitirLicenca();
    }
}