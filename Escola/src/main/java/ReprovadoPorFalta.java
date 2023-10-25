
import Service.Aluno;
import service.SituacaoService;

public class ReprovadoPorFalta extends SituacaoService {

    private SituacaoService proximo;

    @Override
    public String processarSituacao(Aluno aluno) {
        if (aluno.getFrequencia() < 75) {
            return "Reprovado por falta";
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
