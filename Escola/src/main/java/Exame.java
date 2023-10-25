
import Service.Aluno;
import service.SituacaoService;

public class Exame extends SituacaoService {

    private SituacaoService proximo;

    @Override
    public String processarSituacao(Aluno aluno) {
        if (aluno.getNota() >= 4 && aluno.getNota() < 7) {
            return "Exame";
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
