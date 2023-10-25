
import Service.Aluno;
import service.SituacaoService;

public class ReprovadoPorNota extends SituacaoService {

    private SituacaoService proximo;

    @Override
    public String processarSituacao(Aluno aluno) {
        if (aluno.getNota() < 4) {
            return "Reprovado por nota";
        } else {
            if (proximo != null) {
                return proximo.processarSituacao(aluno);
            } else {
                return "Situação indefinida";
            }
        }

    }

    @Override
    public void setProximo(SituacaoService proximo) {
        this.proximo = proximo;

    }
}
