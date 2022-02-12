public class Emitir implements Acao{
    private Licenca licenca;

    public Emitir(Licenca licenca) {
        this.licenca = licenca;
    }

    public void executar() {
        this.licenca.emitirLicenca();
    }

    public void cancelar() {
        this.licenca.revogarLicenca();
    }
}