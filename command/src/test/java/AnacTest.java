import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnacTest {
    Anac anac;
    Licenca licenca;

    @BeforeEach
    void setUp() {
        anac = new Anac();
        licenca = new Licenca("Davi Rezende", "12/02/2022");
    }

    @Test
    void deveEmitirLicenca() {
        Acao emitir = new Emitir(licenca);
        anac.executarAcao(emitir);
        assertEquals("Licença ativa", licenca.getSituacao());
    }

    @Test
    void deveRevogarLicenca() {
        Acao revogar = new Revogar(licenca);
        anac.executarAcao(revogar);
        assertEquals("Licença revogada", licenca.getSituacao());
    }

    @Test
    void deveCancelarEmissao() {
        Acao emitir = new Emitir(licenca);
        Acao revogar = new Revogar(licenca);

        anac.executarAcao(emitir);
        anac.executarAcao(revogar);
        anac.cancelarUltimaAcao();

        assertEquals("Licença ativa", licenca.getSituacao());
    }

    @Test
    void deveCancelarRevogacao() {
        Acao emitir = new Emitir(licenca);
        Acao revogar = new Revogar(licenca);

        anac.executarAcao(revogar);
        anac.executarAcao(emitir);
        anac.cancelarUltimaAcao();

        assertEquals("Licença revogada", licenca.getSituacao());
    }
}