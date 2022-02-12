import java.util.ArrayList;
import java.util.List;

public class Anac {
    private List<Acao> acoes = new ArrayList<Acao>();

    public void executarAcao(Acao acao) {
        this.acoes.add(acao);
        acao.executar();
    }

    public void cancelarUltimaAcao() {
        if (acoes.size() != 0) {
            Acao acao = this.acoes.get(this.acoes.size() - 1);
            acao.cancelar();
            this.acoes.remove(this.acoes.size() - 1);
        }
    }
}